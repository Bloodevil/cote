package src

import (
	"math"
	"strings"
)

var SYMBOL = map[int]string{
	1:    "I",
	5:    "V",
	10:   "X",
	50:   "L",
	100:  "C",
	500:  "D",
	1000: "M",
}

func IntToRoman(num int) string {
	result, count := "", 0
	faceValue, placeValue := num, num
	for {
		power_of_ten := int(math.Pow(10, float64(count)))
		faceValue = (num / power_of_ten) % 10
		placeValue = faceValue * power_of_ten

		if num/power_of_ten == 0 {
			break
		}

		if placeValue <= 3 {
			result = strings.Repeat(SYMBOL[1], faceValue) + result
		} else if placeValue == 4 {
			result = SYMBOL[1] + SYMBOL[5] + result
		} else if placeValue == 9 {
			result = SYMBOL[1] + SYMBOL[10] + result
		} else if placeValue == 10 {
			result = SYMBOL[10] + result
		} else if placeValue < 10 {
			result = SYMBOL[5] + strings.Repeat(SYMBOL[1], faceValue-5) + result
		} else if faceValue == 1 || faceValue == 5 {
			result = SYMBOL[placeValue] + result
		} else if faceValue == 4 {
			digit := placeValue / faceValue
			result = SYMBOL[digit] + SYMBOL[digit*5] + result
		} else if faceValue == 9 {
			digit := placeValue / faceValue
			result = SYMBOL[digit] + SYMBOL[digit*10] + result
		} else if faceValue < 5 {
			digit := placeValue / faceValue
			result = strings.Repeat(SYMBOL[digit], faceValue) + result
		} else if faceValue > 5 {
			digit := placeValue / faceValue
			result = SYMBOL[digit*5] + strings.Repeat(SYMBOL[digit], faceValue-5) + result
		}
		count++
	}
	return result
}
