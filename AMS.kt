import java.util.*

fun main(args: Array<String>) {
    println("Hello Kotlin")
    dayOfWeek()
}

fun dayOfWeek(){
    print("What day is it today")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has Stopped"
    })

}