const climbStairs = (n, memo = {}) => {
  if (memo[n]) {
    return memo[n]
  }

  if (n <= 2) {
    return n
  }

  memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo)

  return memo[n]
}

console.log(`Example 1: ${climbStairs(2)}`)
console.log(`Example 2: ${climbStairs(3)}`)
console.log(`Example 3: ${climbStairs(45)}`)
