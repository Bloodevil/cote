const targetNumber = (numbers, target) => {
  const answer = numbers.reduce((prev, number, idx) => {
    const positive = number
    const negative = number * -1

    if (!prev) {
      return {
        [positive]: 1,
        [negative]: 1,
      }
    }

    const obj = {}

    Object.entries(prev).forEach(([number = 0, count = 0]) => {
      const sumPositive = Number(number) + positive
      const countPositive = (obj[sumPositive] || 0) + count
      const sumNegative = Number(number) + negative
      const countNegative = (obj[sumNegative] || 0) + count

      obj[sumPositive] = countPositive
      obj[sumNegative] = countNegative
    })

    return obj
  }, undefined)

  return answer[target] || 0
}

console.log(`Example 1: ${targetNumber([1, 1, 1, 1, 1], 3)}`)
