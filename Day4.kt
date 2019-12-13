package HackerRank

fun main(args: Array<String>) {
    var p = Person(13)
}


class Person(initialAge: Int) {
    private var age: Int
    init {
        age = if(initialAge > 0) initialAge else 0
        if(age == 0) print("Age is not valid, Setting it to 0\n")
        amIOld()
        yearPasses()
        yearPasses()
        yearPasses()
        amIOld()

        }
    fun yearPasses() {
        age++
    }

    fun amIOld(){
        when(age){
            in 0..12 -> print("Yes you are Young\n")
            in 13..18 -> print("You are Teenager\n")
            else -> print("You are Old\n")
        }
    }
}