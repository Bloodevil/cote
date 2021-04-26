const isSameTree = (p, q) => {
  if (!p || !q) {
      return !p && !q
  }
  
  if (p.val !== q.val) {
      return false
  }
  
  return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}
