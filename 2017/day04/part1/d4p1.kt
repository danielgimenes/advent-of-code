package day04.part1

import utils.*

fun main() {
    var line = readStr()
    var validPhrases = 0
    while (line != null) {
        if (isPassphraseValid(line)) {
            validPhrases++
        }
        line = readStr()
    }
    println(validPhrases)
}

fun isPassphraseValid(line: String): Boolean {
    val visited = hashSetOf<String>()
    for (s in line.split(" ")) {
        if (visited.contains(s)) {
            return false
        }
        visited.add(s)
    }
    return true
}
