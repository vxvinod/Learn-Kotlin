import kotlin.random.Random

fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    print(spices.filter{it.first()=='c' && it.last() == 'e'})
    print(spices.take(3).filter { it.startsWith('c') })
}


var rollDice = { sides: Int ->
    if (sides == 0) 0
    else Random.nextInt(sides) + 1 }

var rollDice2: (Int) ->  Int = { sides ->
        if(sides == 0) 0
        else Random.nextInt(sides) + 1
}