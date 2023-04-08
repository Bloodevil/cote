/**
 * @param {string} s
 * @return {number}
 */
const numberOfWays = function (s) {
  let one = 0;
  let zero = 0;
  let answer = 0;
  for (let building of s) {
    if (building === "1") one++;
    else zero++;
  }

  let leftOne = 0;
  let leftZero = 0;
  for (let cursor in s) {
    if (s[cursor] === "1") {
      answer += leftZero * zero;
      one--;
      leftOne++;
    } else {
      answer += leftOne * one;
      zero--;
      leftZero++;
    }
  }
  return answer;
};
