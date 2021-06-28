var isValidBST = function(root) {
  if (!root) {
      return true
  }
  
  if (root.left) {
      if (root.left.val >= root.val) {
          return false    
      }
  }
  
  if (root.right) {
      if (root.right.val <= root.val) {
          return false
      }
  }

  
  return isValidBST(root.left) && isValidBST(root.right)
}

// NOTE: few cases fails
