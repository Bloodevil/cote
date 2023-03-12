function intToRoman(num: number): string {
  const symbol = ["I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"];
  const value = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000];

  let i = symbol.length - 1;
  let ramanNum = "";

  while (num) {
    if (num < value[i]) {
      i--;
      continue;
    }

    ramanNum += symbol[i];
    num = num - value[i];
  }

  return ramanNum;
}
