/**
 * @param {string} s
 * @return {number}
 */
const numberOfWays = function (s) {
  let rightOne = 0;
  let rightZero = 0;
  let answer = 0;
  for (let building of s) {
    if (building === "1") rightOne++;
    else rightZero++;
  }

  let leftOne = 0;
  let leftZero = 0;
  for (let cursor in s) {
    if (s[cursor] === "1") {
      answer += leftZero * rightZero;
      rightOne--;
      leftOne++;
    } else {
      answer += leftOne * rightOne;
      rightZero--;
      leftZero++;
    }
  }
  return answer;
};
