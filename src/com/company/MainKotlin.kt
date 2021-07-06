package com.company


val data = listOf(
    Item("A", "A", 10),
    Item("B", "B", 12),
    Item("X", "X", 80),
    Item("H", "H", 60),
    Item("Z", "Z", 11),
    Item("Y", "Y", 134),
    Item("Q", "Q", 16)
)

fun main(args: Array<String>) {
    val sorted = data.sortedBy { it.id }
    println(sorted)
}

data class Item(val id: String, val name: String, val value: Int)
