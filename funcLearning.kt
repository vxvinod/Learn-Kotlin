fun main(args:Array<String>) {
    println(whatShouldIDoToday("sad"))
}

fun whatShouldIDoToday (mood: String, weather: String = "Sunny", temperature : Int = 24) : String{

    return when {
        (mood == "happy" && weather == "Sunny") -> "go for a walk"
        (mood == "sad" && weather == "rainy" && temperature == 0) -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read"
    }


}