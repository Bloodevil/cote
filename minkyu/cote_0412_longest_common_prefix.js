var longestCommonPrefix = function(strs) {
  if (strs.length < 1) {
      return ''
  }
  
  if (strs.length === 1) {
      return strs[0]
  }

  let isEnd
  let idx = 0
  while (isEnd === undefined) {
      isEnd = strs.find((word) => word[idx] !== strs[0][idx] || !word[idx])
      if (isEnd === undefined) idx++
  }
  
  return strs[0].slice(0, idx)
}

// https://leetcode.com/problems/longest-common-prefix/
