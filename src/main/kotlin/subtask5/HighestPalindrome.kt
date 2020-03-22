package subtask5

class HighestPalindrome {

    // TODO: Complete the following function
    fun highestValuePalindrome(n: Int, k: Int, digitString: String): String {
        var result = digitString
        var k = k
        if (possible(result, k)) {
            for (i in 0 until n / 2) {
                if (k == 0) break
                if(result[i] == result[n-i-1] && result[i] != '9') {
                    if (k >= 2) {
                        result = mirrorChar(replace(result, n - i - 1, '9'), n-i-1)
                        k -= 2
                    } else {
                        result = if (result[i] > result[n - i - 1]) mirrorChar(result, i)
                        else mirrorChar(result, n-i-1)
                    }
                } else if (result[i] != result[n-i-1]) {
                    when {
                        result[i] == '9' -> {
                            result = mirrorChar(result, i)
                            k--
                        }
                        result[n - i - 1] == '9' -> {
                            result = mirrorChar(result, n - i - 1)
                            k--
                        }
                        k >= 2 -> {
                            result = mirrorChar(replace(result, n - i - 1, '9'), n - i - 1)
                            k -= 2
                        }

                        else -> {
                            result = if (result[i] > result[n - i - 1]) mirrorChar(result, i)
                            else mirrorChar(result, n - i - 1)
                        }
                    }
                }
            }
        } else {
            return "-1"
        }
        return result
    }

    private fun mirrorChar(string: String, i: Int): String {
        return replace(string, string.length - i - 1, string[i])
    }

    private fun possible(string: String, permutations: Int): Boolean {
        var k = 0
        for (i in 0 until string.length / 2) {
            if (string[i] != string[string.length - 1 - i]) {
                k += 2
            }
        }
        return (k - permutations == 1)
    }

    private fun replace(s: String, i: Int, c: Char): String {
        var arr = s.toCharArray()
        arr[i] = c
        return String(arr)
    }

}

