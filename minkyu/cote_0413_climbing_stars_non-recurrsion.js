const climbStairs = (n) => {
  if (n <= 2) {
    return n
  }

  let a = 1
  let b = 2
  while (n > 2) {
      let temp = a + b
      a = b
      b = temp
      n--
  }

  return b
}

console.log(`Example 1: ${climbStairs(2)}`)
console.log(`Example 2: ${climbStairs(3)}`)
console.log(`Example 3: ${climbStairs(45)}`)
