fun main() {
val day = 4

    val result = when (day) {
        1->"Sunday" 2 -> "Monday"
        3 -> "Tuesday" 4 -> "Wednesday"
        5 -> "Thursday" 6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day number"
    }
    println(result)


    //bonus
    //if else
    if (20 > 18) {
        println("20 is greater than 18")
    }
    val time = 20
    if (time < 18) {
        println("Good day.")
    } else if(time > 18) {
        println("Good evening.")
    } else{
        println("Good night.")
    }
//output later, condition first
    val time2 = 20
    val greeting = if (time2 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    //budget ternary
    val time3 = 20
    val greeting2 = if (time3 < 18) "Good day." else "Good evening."
    println(greeting2)
}