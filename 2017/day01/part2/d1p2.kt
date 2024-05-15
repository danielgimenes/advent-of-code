package day01.part2

import utils.readStr

fun main() {
    var numberStr = readStr()
    while (numberStr != null) {
        println(sumOfRepeatedDigits(numberStr))
        numberStr = readStr()
    }
}

fun sumOfRepeatedDigits(numberStr: String): Int {
    var sum = 0
    val lastIndex = numberStr.length-1
    val halfSize = numberStr.length/2
    for (i in 0..lastIndex/2) {
        val numToCompare = numberStr[i+halfSize]
        if (numberStr[i] == numToCompare) {
            sum += numberStr[i].digitToInt()
        }
    }
    return sum*2
}
