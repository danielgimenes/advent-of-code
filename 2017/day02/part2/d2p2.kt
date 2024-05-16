package day02.part2

import utils.readInts

fun main() {
    var row = readInts()
    var checksum = 0
    while (row != null) {
        checksum += divisionOf(row)
        row = readInts()
    }
    println(checksum)
}

fun divisionOf(row: List<Int>): Int {
    for (i in 0..row.size-1) {
        for (j in i+1..row.size-1) {
            val higher = Math.max(row[i], row[j])
            val lower = Math.min(row[i], row[j])
            if (higher % lower == 0) {
                return higher / lower
            }
        }
    }
    return -1
}
