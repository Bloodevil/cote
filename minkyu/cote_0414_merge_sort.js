const mergeSort = (arr1, arr2) => {
  const sortedArray = []
  
  while (arr1.length && arr2.length) {
      const a = arr1[0]
      const b = arr2[0]
      
      if (a < b) {
          sortedArray.push(arr1.shift())
      } else {
          sortedArray.push(arr2.shift())
      }
  }
  
  return [
      ...sortedArray,
      ...arr1,
      ...arr2,
  ]
}

var sortArray = function(nums) {
  console.log('nums', nums)
  const idx = nums.length / 2
  
  if (nums.length <= 2) {
      return mergeSort(nums.slice(0, idx), nums.slice(idx))
  }

  return mergeSort(sortArray(nums.slice(0, idx)), sortArray(nums.slice(idx)))
}
