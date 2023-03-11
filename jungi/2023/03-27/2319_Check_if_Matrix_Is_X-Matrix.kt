package `2023`.`03-27`

internal class Solution {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        var answer = true
        val n = grid.size
        for (i in 0 until n) {
            if (!answer) break
            for (j in 0 until n) {
                val temp = grid[i][j]
                if (i == 0 && j == 0 || i == n - 1 && j == n - 1 || i + j == n - 1 || i == j) {
                    if (temp == 0) {
                        answer = false
                        break
                    }
                } else {
                    if (temp != 0) {
                        answer = false
                        break
                    }
                }
            }
        }
        return answer
    }
}