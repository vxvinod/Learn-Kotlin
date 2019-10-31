fun main(args: Array<String>) {
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )
    print(spices.filter{it.first()=='c' && it.last() == 'e'})
    print(spices.take(3).filter { it.startsWith('c') })
}


