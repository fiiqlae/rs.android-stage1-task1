package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val bracketsO = listOf('(', '<', '[')
        val bracketsC = listOf(')', '>', ']')
        val result = ArrayList<String>()
        val sb = StringBuilder(inputString)
        var last = 0
        for (i in sb.length - 1 downTo 0) {
            if (bracketsO.contains(sb[i])) {
                for (index in i until sb.length) {
                    if (sb[index] == bracketsC[bracketsO.indexOf(inputString[i])]) {
                        last = index
                        sb[last] = 'Y'
                        break
                    }
                }
                result.add(0, inputString.substring(i + 1, last))
            }
        }
        return result.toTypedArray()
    }
}
