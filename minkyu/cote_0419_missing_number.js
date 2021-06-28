const missingNumber = (nums) => (
  nums.reduce((prevNumber, num, idx) => (
      prevNumber + idx + 1 - num
  ), 0)
)
