package utils

fun readInts(): List<Int>? =
    readlnOrNull()?.split(" ")?.map { it.toInt() }

fun readInt(): Int? =
    readlnOrNull()?.toInt()

fun readStr() = readlnOrNull()