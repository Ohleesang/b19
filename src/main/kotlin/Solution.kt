//피자 7조각으로 나눠먹을때 필요한 피자수
//7로 나누고 나머지가있다면 + 1
class Solution {
    fun solution(n: Int): Int {
        val res = n / 7
        val dec = n % 7
        return if (dec == 0) res
        else res + 1
    }
}

fun main() {
    Solution().solution(7)//1
    Solution().solution(1)//1
    Solution().solution(15)//3
}