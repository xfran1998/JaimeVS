var dragging = false;

// const box = document.querySelector('.box');
// const handle = document.querySelector('.handle');

// var x , y , h , w ;

// console.log(handle);
// handle.addEventListener('mousedown', function(e){
//     x = e.clientX;
//     y = e.clientY;
//     h = box.offsetHeight;
//     w = box.offsetWidth;
//     console.log(x,y,h,w);
//     dragging = true;

//     let min = 300;
//     let max = 1000;

//     addEventListener('mousemove', function(e){
//         console.log(e.clientX, e.clientY);
//         if(dragging){
//             // get max min width and height
//             let width = w + (e.clientX - x);
//             width = width < min ? min :
//                     width > max ? max : width;

//             let height = h + (e.clientY - y);
//             height = height < min ? min :
//                     height > max ? max : height;

//             // change container width and height
//             box.style.width = width + 'px';
//             box.style.height = height + 'px';
//         }
//     } );

//     addEventListener('mouseup', function(e){
//         dragging = false;
//     });
// } );

class resizeBox {
  constructor(
    layout = null,
    size = null,
    location = "body",
    class_box = "resize-box",
    thickness_bar = "10px"
  ) {
    if (layout === null) return;

    this.dragging = false;

    const { width, height } = size;
    this.width = width;
    this.height = height;
    this.location = location;
    this.class_box = class_box;
    this.thickness_bar = thickness_bar;

    this.min = 300;
    this.max = 1000;

    this.resizable_boxes = [];
    this.resizable_bar_x = []; // horizontal bar
    this.resizable_bar_y = []; // vertical bar

    this.create_layout(layout);
    // console.log(this.boxes);
    // console.log(this.handle);

    // check if the layout is valid.
    if (!this.checkIsValidCorners(this.boxes))
      throw new Error("Invalid layout");

    this.create_container();
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
    // container.style.display = 'flex';
    // container.style.flexDirection = 'row';
    // container.style.flexWrap = 'wrap';

    // create resizable bars
    // for(let i = 1; i < this.main_axis_y; i++){
    //     const box = document.createElement('div');
    //     box.classList.add('resizable-bar');
    //     console.log(this.thickness_bar);
    //     box.style.width = this.thickness_bar;
    //     box.style.height = this.height;
    //     box.style.position = 'absolute';
    //     box.style.top = '0px';
    //     box.style.left = i * width_boxes + 'px';
    //     box.style.cursor = 'col-resize';
    //     box.style.zIndex = '3';
    //     box.style.backgroundColor = '#fff';
    //     box.style.opacity = '0.5';
    //     // translate(-50%, 0);
    //     box.style.transform = 'translate(-50%, 0)';
    //     container.appendChild(box);
    //     this.resizable_bar_x.push(box);
    // }

    // for(let i = 1; i < this.main_axis_x; i++){
    //     const box = document.createElement('div');
    //     box.classList.add('resizable-bar');
    //     box.style.width = this.width;
    //     box.style.height = this.thickness_bar;
    //     box.style.position = 'absolute';
    //     box.style.top = i * height_boxes + 'px';
    //     box.style.left = '0px';
    //     box.style.cursor = 'row-resize';
    //     box.style.zIndex = '3';
    //     box.style.backgroundColor = '#fff';
    //     box.style.opacity = '0.5';
    //     // translate(-50%, 0);
    //     box.style.transform = 'translateY(-50%)';
    //     container.appendChild(box);
    //     this.resizable_bar_y.push(box);
    // }

    // create resizable boxes
    Object.keys(this.boxes).forEach((key, index) => {
      console.log("this.boxes");
      console.log(this.boxes[key]);
      let box = document.createElement("div");
      box.classList.add("box");
      box.classList.add("resize-box");
      box.style.top = this.boxes[key].top * height_boxes + "px";
      box.style.left = this.boxes[key].left * width_boxes + "px";
      box.style.width =
        (this.boxes[key].right - this.boxes[key].left) * width_boxes + "px";
      box.style.height =
        (this.boxes[key].bottom - this.boxes[key].top) * height_boxes + "px";
      box.style.position = "absolute";
      // box.style.backgroundColor = '#444';
      box.style.background =
        "#" + Math.floor(Math.random() * 16777215).toString(16);
      box.style.borderRadius = "5px";
      // box.style.boxShadow = '0px 0px 5px #' + Math.floor(Math.random() * 16777215).toString(16);
      box.style.zIndex = "1";
      box.style.cursor = "pointer";
      // box.style.transition = 'all 0.5s';
      // box.style.transform = 'translate(-50%, -50%)';
      // box.style.transformOrigin = '50% 50%';
      // box.style.overflow = 'hidden';

      container.appendChild(box);
    });

    document.querySelector("#test").appendChild(container);
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
    const handle = {};
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
      handle[box_type] = boundries.boundries;
    });

    this.boxes = boxes;
    this.handle = handle;
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
}

// Valid layour
const valid_box = new resizeBox(
  [
    [0, "a", "a"],
    [0, "b", "b"],
    [0, "c", "d"],
  ],
  { width: "600px", height: "500px" }
);

// Invalid layour
const invalid_box = new resizeBox(
  [
    [0, "a", "a"],
    [0, "b", "b"],
    [0, "c", "b"],
  ],
  { width: "600px", height: "500px" }
);
