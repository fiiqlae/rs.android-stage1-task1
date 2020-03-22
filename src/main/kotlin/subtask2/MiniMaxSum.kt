package subtask2

import kotlin.math.max

class MiniMaxSum {

    // TODO: Complete the following function
    fun getResult(input: IntArray): IntArray {
        val sum = input.sum()
        var maxVal = 0
        if(input.max() != null) maxVal = input.max()!!
        var minVal = 0
        if(input.min() != null) minVal = input.min()!!
        return intArrayOf(sum - maxVal, sum - minVal)
    }
}