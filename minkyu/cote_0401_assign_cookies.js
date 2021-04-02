const findContentChildren = (greeds, sizes) => {
  let content = 0

  const sortedGreeds = greeds.sort((a, b) => a - b)
  const sortedSizes = sizes.sort((a, b) => a - b)

  let j = 0
  for (let i = 0; i < sortedGreeds.length && j < sortedSizes.length; i++) {
    while (j < sortedSizes.length) {
      if (sortedSizes[j++] >= sortedGreeds[i]) {
          content++
          break
      }
    }
  }

  return content
}

const greeds1 = [1,2,3]
const size1 = [1,1]

const greeds2 = [1,2]
const size2 = [1,2,3]

console.log(`Example 1: ${JSON.stringify(findContentChildren(greeds1, size1), null, 2)}`)
console.log(`Example 2: ${JSON.stringify(findContentChildren(greeds2, size2), null, 2)}`)
