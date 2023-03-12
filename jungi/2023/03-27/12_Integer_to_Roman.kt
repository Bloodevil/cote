package `2023`.`03-27`

internal class Integer_to_Roman {
    fun intToRoman(num: Int): String {
        var num = num
        val sb = StringBuilder()
        var idx = 13
        val intArr = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
        val romanArr = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
        while (num != 0) {
            if (num >= intArr[intArr.size - idx]) {
                num -= intArr[intArr.size - idx]
                sb.append(romanArr[intArr.size - idx])
            } else {
                idx--
            }
        }
        return sb.toString()
    }
}