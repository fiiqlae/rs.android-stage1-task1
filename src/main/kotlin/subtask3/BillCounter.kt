package subtask3

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var total = bill.sum()
        var annasPart = (total - bill[k]) / 2
        return if(annasPart == b) "Bon Appetit" else (b-annasPart).toString()
    }
}
