package spices

fun main(args: Array<String>) {
    var curry = Curry("hot")
}
abstract class Spice {
    val name = "curry"
    val spiciness = "mild"
    val heat: Int
        get() {return 5}

    abstract fun prepareSpice()
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    var color: String
}

object YellowSpiceColor: SpiceColor{
    override var color = "Yellow"
}

class Curry(var spiceness: String) : Spice(), Grinder, SpiceColor by YellowSpiceColor {
    override fun prepareSpice() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun grind(){print("Grinding")}
}
