const assert = require("assert");

const SYMBOL = {
  1: "I",
  5: "V",
  10: "X",
  50: "L",
  100: "C",
  500: "D",
  1000: "M",
};

function intToRoman(num) {
  let result = "";
  let count = 0;
  let faceValue = num;
  let placeValue = num;
  let powerOfTen;
  while (true) {
    powerOfTen = 10 ** count++;
    faceValue = Math.floor(num / powerOfTen) % 10;
    placeValue = faceValue * powerOfTen;

    if (Math.floor(num / powerOfTen) == 0) {
      break;
    }

    if (placeValue <= 3) {
      result = SYMBOL[1].replace(faceValue) + result;
    } else if (placeValue == 4) {
      result = SYMBOL[1] + SYMBOL[5] + result;
    } else if (placeValue == 9) {
      result = SYMBOL[1] + SYMBOL[10] + result;
    } else if (placeValue == 10) {
      result = SYMBOL[10] + result;
    } else if (placeValue < 10) {
      result = SYMBOL[5] + SYMBOL[1].repeat(faceValue - 5) + result;
    } else if (faceValue == 1 || faceValue == 5) {
      result = SYMBOL[placeValue] + result;
    } else if (faceValue == 4) {
      const digit = placeValue / faceValue;
      result = SYMBOL[digit] + SYMBOL[digit * 5] + result;
    } else if (faceValue == 9) {
      const digit = placeValue / faceValue;
      result = SYMBOL[digit] + SYMBOL[digit * 10] + result;
    } else if (faceValue < 5) {
      const digit = placeValue / faceValue;
      result = SYMBOL[digit].repeat(faceValue) + result;
    } else if (faceValue > 5) {
      const digit = placeValue / faceValue;
      result = SYMBOL[digit * 5] + SYMBOL[digit].repeat(faceValue - 5) + result;
    }
  }
  return result;
}

// Simple Test Case
const expected = "XXXVIII";
const result = intToRoman(38);
assert(expected == result, `Expected: ${expected}, but got ${result}`);
