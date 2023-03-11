function checkXMatrix(grid: number[][]): boolean {
  let leftIndex = 0;
  let rightIndex = grid.length - 1;

  for (let i = 0; i < grid.length; i++) {
    for (let j = 0; j < grid.length; j++) {
      if ((leftIndex === j && grid[i][j] === 0) || (rightIndex === j && grid[i][j] === 0)) {
        return false;
      } else if (grid[i][j] !== 0 && j !== leftIndex && j !== rightIndex) return false;
    }

    leftIndex++;
    rightIndex--;
  }

  return true;
}
