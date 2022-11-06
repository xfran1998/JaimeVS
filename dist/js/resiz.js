var dragging = false;

class resizeBox {
  static Direction = {
    Horizontal: 0,
    Vertical: 1,
  };

  constructor(
    layout = null,
    {
      width = "500px",
      height = "500px",
      location = "body",
      class_box = "resize-box",
      thickness = "10px",
      color = "#444",
    }
  ) {
    if (layout === null) return;

    this.dragging = false;

    this.width = width;
    this.height = height;
    this.location = location;
    this.class_box = class_box;
    this.thickness = thickness;
    this.color = color;

    this.minHeight = 50;
    this.minWidth = 50;
    // this.max = 1000;

    this.size = {
      width: 0,
      height: 0,
    };

    this.coords = {
      x: 0,
      y: 0,
    };

    this.deltaPosMouse = {
      x: 0,
      y: 0,
    };

    this.resizable_boxes = [];
    this.resizable_bar_x = []; // horizontal bar
    this.resizable_bar_y = []; // vertical bar

    // for handling the resize
    this.dirDrag = null;
    this.isDragging = false;
    this.draggingBar = null;

    this.create_layout(layout);
    console.log(this.boxes);
    console.log(this.handle);

    // check if the layout is valid.
    if (!this.checkIsValidCorners(this.boxes))
      throw new Error("Invalid layout");

    this.joinHandlers();
    this.create_container();
    this.getCoordMainContainer();
    this.getSizeMainContainer();
    this.setContainerOnHandlers();
    this.setHandlersDependent();
    this.generateListeners();
  }

  create_container() {
    const width_boxes = parseInt(this.width.split("px")[0]) / this.main_axis_y;
    const height_boxes =
      parseInt(this.height.split("px")[0]) / this.main_axis_x;
    const container = document.createElement("div");
    container.classList.add("resize-container");
    container.style.width = this.width;
    container.style.height = this.height;
    container.style.position = "relative";
    container.style.overflow = "hidden";

    // create resizable boxes
    Object.keys(this.boxes).forEach((key, index) => {
      let box = document.createElement("div");
      box.id = key;
      box.classList.add("resize-box");
      box.style.top = this.boxes[key].top * height_boxes + "px";
      box.style.left = this.boxes[key].left * width_boxes + "px";
      box.style.width =
        (this.boxes[key].right - this.boxes[key].left) * width_boxes + "px";
      box.style.height =
        (this.boxes[key].bottom - this.boxes[key].top) * height_boxes + "px";
      box.style.position = "absolute";
      box.style.background =
        "#" + Math.floor(Math.random() * 16777215).toString(16);
      box.style.zIndex = "1";

      container.appendChild(box);

      this.mainContainer = container;
    });

    // create resizable bars
    Object.keys(this.handle).forEach((key) => {
      this.handle[key].forEach((handler, index) => {
        let bar = document.createElement("div");
        bar.classList.add("resize-bar");
        // bar.classList.add(key);
        bar.setAttribute("data-axis", key);
        bar.setAttribute("data-index", index);
        bar.style.position = "absolute";
        bar.style.zIndex = "2";
        bar.style.backgroundColor = this.color;

        console.log(handler);
        if (key == "xAxis") {
          bar.style.cursor = "row-resize";
          bar.style.transform = "translate(0, -50%)";
          let top = handler.boundrie[0][0] * height_boxes;
          let left = handler.boundrie[0][1] * width_boxes;
          let width =
            (handler.boundrie[1][1] - handler.boundrie[0][1]) * width_boxes;
          // let height = parseInt(this.thickness.split('px')[0]);
          let height = this.thickness;
          console.log(this.thickness);

          bar.style.top = top + "px";
          bar.style.left = left + "px";
          bar.style.width = width + "px";
          bar.style.height = height;
        }

        if (key == "yAxis") {
          bar.style.cursor = "col-resize";
          bar.style.transform = "translate(-50%, 0)";
          let top = handler.boundrie[0][0] * height_boxes;
          let left = handler.boundrie[0][1] * width_boxes;
          let width = this.thickness;
          let height =
            (handler.boundrie[1][0] - handler.boundrie[0][0]) * height_boxes;

          bar.style.top = top + "px";
          bar.style.left = left + "px";
          bar.style.width = width;
          bar.style.height = height + "px";
        }

        handler.element = bar;
        container.appendChild(bar);
      });
    });

    document.querySelector("#test").appendChild(container);
  }

  joinHandlers() {
    // join the handlers on the same axis value
    const y_axis = this.handle.yAxis;
    for (let i = 0; i < y_axis.length; i++) {
      for (let j = i + 1; j < y_axis.length; j++) {
        if (y_axis[i].boundrie[0][1] === y_axis[j].boundrie[0][1]) {
          // get min row and max row
          let min_row = Math.min(
            y_axis[i].boundrie[0][0],
            y_axis[j].boundrie[0][0]
          );
          let max_row = Math.max(
            y_axis[i].boundrie[1][0],
            y_axis[j].boundrie[1][0]
          );

          // set the new boundrie
          y_axis[i].boundrie[0][0] = min_row;
          y_axis[i].boundrie[1][0] = max_row;

          // get all the containers that are in both handlers
          let containers = y_axis[i].containers.concat(y_axis[j].containers);
          console.log(containers);

          // set the new containers
          y_axis[i].containers = containers;

          // remove the second handler
          y_axis.splice(j, 1);
          j--; // decrement j to avoid skipping an element
        }
      }
    }

    const x_axis = this.handle.xAxis;
    for (let i = 0; i < x_axis.length; i++) {
      for (let j = i + 1; j < x_axis.length; j++) {
        if (x_axis[i].boundrie[0][0] === x_axis[j].boundrie[0][0]) {
          // get min row and max row
          let min_col = Math.min(
            x_axis[i].boundrie[0][1],
            x_axis[j].boundrie[0][1]
          );
          let max_col = Math.max(
            x_axis[i].boundrie[1][1],
            x_axis[j].boundrie[1][1]
          );

          // set the new boundrie
          x_axis[i].boundrie[0][1] = min_col;
          x_axis[i].boundrie[1][1] = max_col;

          // get all the containers that are in both handlers
          let containers = x_axis[i].containers.concat(x_axis[j].containers);
          console.log(containers);

          // set the new containers
          x_axis[i].containers = containers;

          // remove the second handler
          x_axis.splice(j, 1);
          j--; // to avoid skipping the next element
        }
      }
    }
  }

  create_layout(layout) {
    // RULES:
    // - Only one box can be resized at a time.
    // - The boxes has to be squares or rectangles, not polygons.
    // - The boxes had to be resizable with the edge resize bars.

    // Example1:
    // [[ 0, 0, 1 ].
    //  [ 0, 0, 1 ]]
    //
    // RESULT:
    // [ X X | Y ]
    // [ X X | Y ]

    // Example2:
    // [[ a, c, b ].
    //  [ a, c, b ]]
    //
    // RESULT:
    // [ X | Y | Z ]
    // [ X | Y | Z ]

    // Example3:
    // [[ a, b, b ].
    //  [ a, c, c ]]
    //
    // RESULT:
    // [ X | Z  Z ]
    // [   | ---- ]
    // [ X | Y  Y ]

    // STEP 1:
    // - Create a matrix with the layout.
    const boxes = {};
    const handle = {
      xAxis: [], // horizontal bar  --> yAxis: [{ boundrie: [[1,1],[1,3]], containers: [{id=0, side:'bottom'}, {id='a', side:'top'}, {id='b', side:'top'}] }]
      yAxis: [], // vertical bar    --> xAxis: [{ boundrie: [[1,1],[3,1]], containers: [{id=0, side:'right'}, {id='a', side:'left'}, {id='b', side:'left'}] }]
    };
    this.main_axis_x = layout.length;
    this.main_axis_y = layout[0].length;

    // Get different boxes from the layout.
    for (let i = 0; i < this.main_axis_x; i++) {
      for (let j = 0; j < this.main_axis_y; j++) {
        const box_type = layout[i][j];

        if (!boxes[box_type]) {
          boxes[box_type] = [];
        }
        boxes[box_type].push([i, j]);
      }
    }

    // create handlers for the boxes.
    Object.keys(boxes).forEach((box_type) => {
      const box = boxes[box_type];
      const boundries = this.getBoundries(
        box,
        this.main_axis_x,
        this.main_axis_y
      );

      boxes[box_type] = boundries.corners;

      Object.keys(boundries.boundries).forEach((key) => {
        if (boundries.boundries[key] && boundries.boundries[key].length > 0) {
          this.setHandler(handle, boundries.boundries[key], box_type, key);
        }
      });
    });

    this.boxes = boxes;
    this.handle = handle;
  }

  isXAxis(boundrie) {
    return boundrie[0][0] === boundrie[1][0]; // check if the boundrie is in the x axis. of 2 points
  }

  setHandler(handlers, boundrie, box_type, side) {
    // check if the boundrie is in the x axis. of 2 points
    const axis = this.isXAxis(boundrie) ? "xAxis" : "yAxis";

    // check if the handler already exists.
    const handler = handlers[axis].find((handler) => {
      return (
        handler.boundrie[0][0] === boundrie[0][0] &&
        handler.boundrie[0][1] === boundrie[0][1] &&
        handler.boundrie[1][0] === boundrie[1][0] &&
        handler.boundrie[1][1] === boundrie[1][1]
      );
    });

    // if the handler already exists, return
    // console.log(handler);
    // console.log(handlers);
    // console.log(boundrie);
    // swap side --> container are in the opposite side of the handler.
    if (side == "top") side = "bottom";
    else if (side == "bottom") side = "top";
    else if (side == "left") side = "right";
    else if (side == "right") side = "left";

    if (handler) {
      // add container to the handler.
      handler.containers.push({ id: box_type, side: side });
      return;
    }

    // in case the handler doesn't exist, check if it's contained
    const containedBy = handlers[axis].find((handler) => {
      return (
        handler.boundrie[0][0] <= boundrie[0][0] &&
        handler.boundrie[0][1] <= boundrie[0][1] &&
        handler.boundrie[1][0] >= boundrie[1][0] &&
        handler.boundrie[1][1] >= boundrie[1][1]
      );
    });

    // if the handler is contained, return
    if (containedBy) {
      // add container to the handler.
      containedBy.containers.push({ id: box_type, side: side });
      return;
    }

    // in case the handler is not contained, check if it contains other handlers
    const contains = handlers[axis].filter((handler) => {
      return (
        handler.boundrie[0][0] >= boundrie[0][0] &&
        handler.boundrie[0][1] >= boundrie[0][1] &&
        handler.boundrie[1][0] <= boundrie[1][0] &&
        handler.boundrie[1][1] <= boundrie[1][1]
      );
    });

    // if the handler contains other handlers, remove them
    // first save the containers of the removed handlers
    const containers = [];
    if (contains.length > 0) {
      contains.forEach((handler) => {
        containers.push(...handler.containers);
        handlers[axis].splice(handlers[axis].indexOf(handler), 1);
      });
    }

    // add the handler to the list
    handlers[axis].push({
      boundrie: boundrie,
      containers: [{ id: box_type, side: side }, ...containers],
    });
  }

  /* ***** getBoundries *****
    input: array of boxes, max_size_x, max_size_y.
    output: array of boundries.

    - boxes: Array of positions of the boxes.                       Array(Array(x, y)).
    - position: index of the box                                    Array(x, y).
    - max_size_x: max size of the x axis.                           Number.
    - max_size_y: max size of the y axis.                           Number.
    - boundries: Array of boundries.                                Object(Array(Array(x, y))).
    - boundry: Array of position [start, end].                      Array(Array(x, y)). 

    return the box boundries:
    { top, right, bottom, left }
    
    inside boundries can be null if the box has no boundry on the coord.
    the boundry is null in case to be iqual to 0 or the max size of the layout.

    Note: box [0,0] has vertex [ [0,0], [0,1], [1,0], [1,1] ] when the handle could be created.
    
    Example 1:
    input:
        boxes: [ [0,0], [0,1], [1,0], [1,1] ]
        max_size_x: 3
        max_size_y: 2

    output:
    corners: { top: 0, right: 2, bottom: 2, left: 0] }
        boundries: { top: null, right: [[0,2], [2,2]] , bottom: null, left: null }
    
    Example 2:
    input:
        boxes: [ [0,2], [1,2] ]
        max_size_x: 2
        max_size_y: 3

    output:
        corners: { top: 0, right: 3, bottom: 2, left: 2] }
        boundries: { top: null, right: null, bottom: null, left: [[2,0], [2,2]] }
    */
  getBoundries(boxes, max_size_x, max_size_y) {
    let boundries = {
      top: null,
      right: null,
      bottom: null,
      left: null,
    };

    // get corners of the box array
    // initializate the corners with the first box.
    const corners = {
      top: boxes[0][0],
      right: boxes[0][1],
      bottom: boxes[0][0],
      left: boxes[0][1],
    };
    boxes.forEach((box) => {
      // check top corner
      if (box[0] < corners.top) {
        corners.top = box[0];
      }
      // check right corner
      if (box[1] + 1 > corners.right) {
        corners.right = box[1] + 1;
      }
      // check bottom corner
      if (box[0] + 1 > corners.bottom) {
        corners.bottom = box[0] + 1;
      }
      // check left corner
      if (box[1] < corners.left) {
        corners.left = box[1];
      }
    });

    // get boundries
    // top boundry
    if (corners.top > 0) {
      boundries.top = [
        [corners.top, corners.left],
        [corners.top, corners.right],
      ];
    }
    // right boundry
    if (corners.right < max_size_y) {
      boundries.right = [
        [corners.top, corners.right],
        [corners.bottom, corners.right],
      ];
    }
    // bottom boundry
    if (corners.bottom < max_size_x) {
      boundries.bottom = [
        [corners.bottom, corners.left],
        [corners.bottom, corners.right],
      ];
    }
    // left boundry
    if (corners.left > 0) {
      boundries.left = [
        [corners.top, corners.left],
        [corners.bottom, corners.left],
      ];
    }

    return { corners, boundries };
  }

  // check if the layour is valid
  // is not valid in case any box is overlaping another.
  checkIsValidCorners(corners) {
    let box = [];
    Object.keys(corners).forEach((box_type) => {
      box.push(corners[box_type]);
    });

    // check all the boxes are not overlaping the others.
    for (let i = 0; i < box.length; i++) {
      for (let j = i + 1; j < box.length; j++) {
        if (this.isOverlaping(box[i], box[j])) {
          return false;
        }
      }
    }

    return true;
  }

  isOverlaping(box1, box2) {
    // box = {top: , right: , bottom: , left: }
    // check if the boxes are overlaping
    if (box1.top >= box2.bottom || box1.bottom <= box2.top) {
      return false;
    }
    if (box1.left >= box2.right || box1.right <= box2.left) {
      return false;
    }

    return true;
  }

  getCoordMainContainer() {
    // get coord of top left corner of the main container
    this.coords = {
      x: this.mainContainer.offsetLeft,
      y: this.mainContainer.offsetTop,
    };
  }

  setHandlersDependent() {
    // set the handlers that need to be resized when the one of the handlers is moved.

    // get the handlers that are colliding with each other.
    const collidingHandlers = this.getCollidingHandlers();

    // // set the handlers that need to be resized when the one of the handlers is moved.
    // collisionHandlers.forEach((collision) => {

    // });
  }

  getCollidingHandlers() {
    // get the handlers that are colliding with each other.
    const isColliding = (handler1, handler2, isVertical) => {
      // check if the handlers are colliding
      if (
        isVertical &&
        handler1.boundrie[0][1] != handler2.boundrie[0][1] &&
        handler1.boundrie[0][1] != handler2.boundrie[1][1]
      )
        return false;

      if (
        !isVertical &&
        handler1.boundrie[0][0] != handler2.boundrie[0][0] &&
        handler1.boundrie[0][0] != handler2.boundrie[1][0]
      )
        return false;

      // check if the handler 1 is bigger than the handler 2
      // in case is not it means that the handler 1 is inside the handler 2
      let size_handler1 = isVertical
        ? handler1.boundrie[1][0] - handler1.boundrie[0][0]
        : handler1.boundrie[1][1] - handler1.boundrie[0][1];

      let size_handler2 =
        isVertical == false
          ? handler2.boundrie[1][0] - handler2.boundrie[0][0]
          : handler2.boundrie[1][1] - handler2.boundrie[0][1];

      // if (size_handler2 < size_handler1) return false;

      return true;
    };

    // get the side is handler1 is colliding with handler2
    const getCollidingSide = (handler1, handler2, isVertical) => {
      if (!isVertical) {
        if (
          handler1.boundrie[0][0] < handler2.boundrie[0][0] ||
          handler1.boundrie[0][0] < handler2.boundrie[1][0]
        )
          return "bottom";
        else return "top";
      } else {
        if (
          handler1.boundrie[0][1] < handler2.boundrie[0][1] ||
          handler1.boundrie[0][1] < handler2.boundrie[1][1]
        )
          return "right";
        else return "left";
      }
    };

    console.log(this);
    const handlers_axis = [];
    handlers_axis.push(this.handle.xAxis); // push the x axis handlers
    handlers_axis.push(this.handle.yAxis); // push the y axis handlers

    // the colliding handlers only can be the ones that are on different axis.

    console.log(handlers_axis);
    const collidingHandlers = [];

    // check if xAxis is colliding with yAxis
    handlers_axis[0].forEach((handler1) => {
      // check if the handler is colliding with any other handler
      handlers_axis[1].forEach((handler2) => {
        if (isColliding(handler1, handler2, false)) {
          let side = getCollidingSide(handler1, handler2, false);
          // collidingHandlers.push({
          //   target: handler2,
          //   origin: handler1,
          //   side: side,
          // });
          if (!handler1["colliding"]) handler1["colliding"] = [];
          handler1["colliding"].push({
            target: handler2.element,
            side: side,
          });
        }
      });
    });

    // check if yAxis is colliding with xAxis
    handlers_axis[1].forEach((handler1) => {
      // check if the handler is colliding with any other handler
      handlers_axis[0].forEach((handler2) => {
        if (isColliding(handler1, handler2, true)) {
          let side = getCollidingSide(handler1, handler2, true);
          // collidingHandlers.push({
          //   target: handler2,
          //   origin: handler1,
          //   side: side,
          // });
          if (!handler1["colliding"]) handler1["colliding"] = [];
          handler1["colliding"].push({
            target: handler2.element,
            side: side,
          });
        }
      });
    });

    console.log("collidingHandlers");
    console.log(collidingHandlers);
    return collidingHandlers;
  }

  getSizeMainContainer() {
    // get size of the main container
    this.size = {
      x: this.mainContainer.offsetWidth,
      y: this.mainContainer.offsetHeight,
    };
  }

  setContainerOnHandlers() {
    // set the container on the handlers
    console.log("setContainerOnHandlers");
    Object.keys(this.handle).forEach((axis) => {
      this.handle[axis].forEach((handle) => {
        handle.containers.forEach((container) => {
          // console.log(container);
          container.element = document.getElementById(container.id);
        });
      });
    });
  }

  handleMouseDown(e) {
    // get the mouse position
    const axis = e.target.getAttribute("data-axis");
    const index = e.target.getAttribute("data-index");

    console.log(this);

    this.deltaPosMouse = {
      x: e.clientX,
      y: e.clientY,
    };

    this.mouseGlobalPos = {
      x: e.clientX,
      y: e.clientY,
    };

    this.dirDrag =
      axis === "xAxis"
        ? resizeBox.Direction.Vertical
        : resizeBox.Direction.Horizontal;
    this.isDragging = true;
    this.draggingBar = this.handle[axis][index];

    // avoid drag event draggingBar
    e.preventDefault();

    // Set listener for mouse move on document
    document.body.addEventListener("mousemove", (e) => {
      this.handleMouseMove(e);
    });

    // Set listener for mouse up on document
    document.body.addEventListener("mouseup", (e) => {
      this.handleMouseUp(e);
    });
  }

  handleMouseMove(e) {
    if (!this.isDragging) return;
    // const { boundrie, containers } = this.draggingBar;
    // console.log('isDragging', {
    //   boundrie,
    //   containers,
    // });

    // get the mouse position
    const mousePos = [e.clientX - this.coords.x, e.clientY - this.coords.y];
    this.deltaPosMouse = {
      x: e.clientX - this.mouseGlobalPos.x,
      y: e.clientY - this.mouseGlobalPos.y,
    };
    this.mouseGlobalPos = {
      x: e.clientX,
      y: e.clientY,
    };

    // check if it's a valid position
    if (mousePos[0] < 0 || mousePos[0] > this.size.x) return;
    if (mousePos[1] < 0 || mousePos[1] > this.size.y) return;

    // vertical direction
    if (this.dirDrag === resizeBox.Direction.Vertical) {
      // move the bar
      // console.log("move the bar");
      // console.log(this.draggingBar.element.style.top);
      // console.log(this.deltaPosMouse.y);
      let top =
        parseInt(this.draggingBar.element.style.top) + this.deltaPosMouse.y;

      let isValid = true;
      /// check new heights are valid (height > this.minHeight)
      this.draggingBar.containers.forEach((container) => {
        let height = parseInt(container.element.style.height);
        if (
          container.side == "bottom" &&
          height - this.deltaPosMouse.y < this.minHeight
        )
          isValid = false;
        if (
          container.side == "top" &&
          height + this.deltaPosMouse.y < this.minHeight
        )
          isValid = false;
      });

      if (!isValid) return;

      // move the containers
      this.draggingBar.containers.forEach((container) => {
        if (container.side == "bottom") {
          container.element.style.top = top + "px";
          // change height
          container.element.style.height =
            parseInt(container.element.style.height) -
            this.deltaPosMouse.y +
            "px";
        }
        if (container.side == "top") {
          // change height
          container.element.style.height =
            parseInt(container.element.style.height) +
            this.deltaPosMouse.y +
            "px";
        }
      });

      this.draggingBar.element.style.top = top + "px";

      // move bars colliding with the draggingBar if exist
      if (this.draggingBar.colliding) {
        this.draggingBar.colliding.forEach((collidingBar) => {
          if (collidingBar.side == "bottom") {
            // change top with deltaPosMouse
            // change top
            collidingBar.target.style.top =
              parseInt(collidingBar.target.style.top) +
              this.deltaPosMouse.y +
              "px";
            // change height
            collidingBar.target.style.height =
              parseInt(collidingBar.target.style.height) -
              this.deltaPosMouse.y +
              "px";
          }
          if (collidingBar.side == "top") {
            // change height
            collidingBar.target.style.height =
              parseInt(collidingBar.target.style.height) +
              this.deltaPosMouse.y +
              "px";
          }
        });
      }
    }

    // horizontal direction
    if (this.dirDrag === resizeBox.Direction.Horizontal) {
      // move the bar
      let left =
        parseInt(this.draggingBar.element.style.left) + this.deltaPosMouse.x;

      let isValid = true;
      /// check new heights are valid (height > this.minHeight)
      this.draggingBar.containers.forEach((container) => {
        let width = parseInt(container.element.style.width);
        if (
          container.side == "right" &&
          width - this.deltaPosMouse.x < this.minWidth
        )
          isValid = false;
        if (
          container.side == "left" &&
          width + this.deltaPosMouse.x < this.minWidth
        )
          isValid = false;
      });

      if (!isValid) return;

      // move the containers
      this.draggingBar.containers.forEach((container) => {
        if (container.side == "right") {
          container.element.style.left = left + "px";
          // change width
          container.element.style.width =
            parseInt(container.element.style.width) -
            this.deltaPosMouse.x +
            "px";
        }
        if (container.side == "left") {
          // change width
          container.element.style.width =
            parseInt(container.element.style.width) +
            this.deltaPosMouse.x +
            "px";
        }
      });

      this.draggingBar.element.style.left = left + "px";

      // move bars colliding with the draggingBar if exist
      if (this.draggingBar.colliding) {
        this.draggingBar.colliding.forEach((collidingBar) => {
          if (collidingBar.side == "right") {
            // change left with deltaPosMouse
            // change left
            collidingBar.target.style.left =
              parseInt(collidingBar.target.style.left) +
              this.deltaPosMouse.x +
              "px";
            // change width
            collidingBar.target.style.width =
              parseInt(collidingBar.target.style.width) -
              this.deltaPosMouse.x +
              "px";
          }
          if (collidingBar.side == "left") {
            // change width
            collidingBar.target.style.width =
              parseInt(collidingBar.target.style.width) +
              this.deltaPosMouse.x +
              "px";
          }
        });
      }
    }
  }

  handleMouseUp(e) {
    this.isDragging = false;
    this.dirDrag = null;
    this.draggingBar = null;

    console.log("handleMouseUp", this);

    // Remove listener for mouse move on document
    document.removeEventListener("mousemove", (e) => {
      this.handleMouseMove(e);
    });
  }

  // listen to the resize event
  generateListeners() {
    let handlers = document.querySelectorAll(".resize-bar");
    console.log(handlers);
    console.log("box_type.dataset");
    handlers.forEach((handler) => {
      // click event on handle
      handler.addEventListener("mousedown", (e) => {
        this.handleMouseDown(e);
      });
    });
  }
}

// Invalid layour
// const invalid_box = new resizeBox(
//   [
//     [0, "a", "a"],
//     [0, "b", "b"],
//     [0, "c", "b"],
//   ],
//   { width: "600px", height: "500px" }
// );
