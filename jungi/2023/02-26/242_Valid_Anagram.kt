package `2023`.`02-26`

import java.util.*


internal class Valid_Anagram {
    fun isAnagram(s: String, t: String): Boolean {
        val sArr = s.toCharArray()
        val tArr = t.toCharArray()
        Arrays.sort(sArr)
        Arrays.sort(tArr)
        return if (Arrays.equals(sArr, tArr)) true else false
    }
}