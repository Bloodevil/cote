package `2023`.`02-26`

class Solution : VersionControl() {
    fun firstBadVersion(n: Int): Int {
        var answer = 0
        var start = 0
        var mid = n / 2
        var end = n
        if (n == 1) return 1

        // 탈출 조건
        while (true) {
            if (end == start) {
                answer = start
                break
            }
            if (isBadVersion(mid)) {
                end = mid
            } else {
                start = mid + 1
            }
            mid = (start + end) / 2
        }
        return answer
    }
}

open class VersionControl {
    fun isBadVersion(mid: Int): Boolean {
        return false;
    }
}
