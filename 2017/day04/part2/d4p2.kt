package day04.part2

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
    val visited = hashSetOf<HashMap<Char, Int>>()
    for (s in line.split(" ")) {
        val charDist = s.fold(hashMapOf<Char, Int>()) { map, c ->
            map[c] = (map[c] ?: 0) + 1
            map
        }
        if (visited.contains(charDist)) {
            return false
        }
        visited.add(charDist)
    }
    return true
}