const isHappy = (n, memo = {}) => {
  if (n === 1) {
      return true
  }
  
  if (memo[n]) {
      return false
  } else {
      memo[n] = true
  }
  
  const sum = String(n).split('').reduce((prevNum, num) => {
      return prevNum + Number(num) * Number(num)
  }, 0)
  
  return isHappy(sum, memo)
}
