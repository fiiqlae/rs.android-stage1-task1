package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sal = sadArray.toCollection(ArrayList())
        var i = 1
        while (i < sal.size-1) {
            if(sal[i] > sal[i-1]+sal[i+1]) {
                sal.removeAt(i)
                if(i != 1) i--
            }
            else i++
        }
        return sal.toIntArray()
    }
}
