package com.example.udacityclass

import java.time.DayOfWeek
import java.util.*

fun main(args: Array<String>){
    dayOrNight()
}

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

fun dayOrNight() {
    println("What time is it? (0-23hr)")
    val time: Int =readLine()!!.toInt()
    if (time > 12) println("Good evening.") else println("Good morning.")
}