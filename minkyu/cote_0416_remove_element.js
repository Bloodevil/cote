const removeElement = (nums, val) => {
  let idx = 0
  
  while (nums.length > idx - 1) {
      if (nums[idx] === val) {
          nums.splice(idx, 1)
      } else {
          idx++
      }
  }

  return nums.length
}
