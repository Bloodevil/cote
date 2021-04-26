const mixCounter = (scoville, K) => {
  let count = 0

  scoville.sort((a, b) => a - b)

  while (scoville.length > 0) {
    const current = scoville[0]
    const next = scoville[1]

    if (current >= K) {
      break
    } else if (!next) {
      count = -1
      break
    }

    const mixed = current + 2 * next
    scoville.splice(0, 2)
    const idx = scoville.findIndex((num) => num > mixed)
    scoville.splice(idx > -1 ? idx : scoville.length, 0, mixed)
    count++
  }

  return count
}

const scoville1 = [1,2,3,9,10,12]
const scoville2 = [4,2,6,1,8,12,11]

console.log(`Example 1: ${mixCounter(scoville1, 7)}`)
console.log(`Example 2: ${mixCounter(scoville2, 10)}`)
console.log(`Example 3: ${mixCounter(scoville2, 1300)}`)
