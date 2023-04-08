/**
 * @param {number[][]} grid
 * @return {number}
 */
var minPathSum = function (grid) {
  const gridSum = [];
  for (let i in grid) gridSum.push(new Array(grid[i].length).fill(0));

  gridSum[0][0] = grid[0][0];
  for (let [y, row] of grid.entries()) {
    for (let [x, val] of row.entries()) {
      let val2 = Number.MAX_SAFE_INTEGER;
      if (x > 0) val2 = Math.min(val2, gridSum[y][x - 1]);
      if (y > 0) val2 = Math.min(val2, gridSum[y - 1][x]);
      if (val2 != Number.MAX_SAFE_INTEGER) gridSum[y][x] = val + val2;
    }
  }
  return gridSum[grid.length - 1][grid[0].length - 1];
};
