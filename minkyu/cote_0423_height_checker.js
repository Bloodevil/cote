const heightChecker = (heights) => {
  const orderedHeights = [...heights].sort((a, b) => a - b)

  return heights.reduce((accum, height, idx) => (
    orderedHeights[idx] !== height
      ? accum + 1
      : accum
  ), 0)
}
