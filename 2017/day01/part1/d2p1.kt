package day01.part1

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
    var lastChar = numberStr[numberStr.length-1]
    for (i in 0..numberStr.length-1) {
        if (numberStr[i] == lastChar) {
            sum += numberStr[i].digitToInt()
        }
        lastChar = numberStr[i]
    }
    return sum
}
