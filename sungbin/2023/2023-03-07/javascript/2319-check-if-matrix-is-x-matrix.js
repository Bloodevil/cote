const assert = require("assert");

function checkAreas(grid, areaIndex, x1, y1, x2, y2) {
  for (let y = y1; y < y2; y++) {
    for (let x = x1; x < x2; x++) {
      const number = grid[y][x];
      if (
        ((areaIndex == 0 || areaIndex == 3) &&
          ((x == y && number == 0) || (x != y && number != 0))) ||
        ((areaIndex == 1 || areaIndex == 2) &&
          ((x + y == grid.length - 1 && number == 0) ||
            (x + y != grid.length - 1 && number != 0)))
      ) {
        return false;
      }
    }
  }
  return true;
}

function split(x1, y1, x2, y2) {
  const MID_X = x1 + (x2 - x1) / 2;
  const MID_Y = y1 + (y2 - y1) / 2;

  const areas = [
    [x1, y1, MID_X, MID_Y],
    [MID_X, y1, x2, MID_Y],
    [x1, MID_Y, MID_X, y2],
    [MID_X, MID_Y, x2, y2],
  ];
  return areas;
}

function checkXMatrix(grid) {
  const areas = split(0, 0, grid.length, grid.length);

  for (const [areaIndex, area] of areas.entries()) {
    const isValid = checkAreas(grid, areaIndex, ...area);
    if (!isValid) return false;
  }
  return true;
}

// Simple Test Case
const expected = true;
const grid = [
  [2, 0, 0, 1],
  [0, 3, 1, 0],
  [0, 5, 2, 0],
  [4, 0, 0, 2],
];
const result = checkXMatrix(grid);
assert(expected == result, `Expected: ${expected}, but got ${result}`);
