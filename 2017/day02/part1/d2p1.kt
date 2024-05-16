package day02.part1

import utils.readInts

fun main() {
    var row = readInts()
    var checksum = 0
    while (row != null) {
        checksum += maxDiff(row)
        row = readInts()
    }
    println(checksum)
}

fun maxDiff(row: List<Int>): Int {
    var max = row[0]
    var min = row[0]
    for (i in 1..row.size-1) {
        max = Math.max(max, row[i])
        min = Math.min(min, row[i])
    }
    return max - min
}
