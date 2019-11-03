package Building

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf<Directions>(Directions.START)

    var north = {path.add(Directions.NORTH)}
    var south = {path.add(Directions.SOUTH)}
    var east  = {path.add(Directions.EAST)}
    var west  = {path.add(Directions.WEST)}
    var end = {path.add(Directions.END)}

    fun move(where: () -> Boolean){
        where.invoke()
    }

    fun makeMove(command:String?) {
        if (command.equals("n")) move(north)
        else if (command.equals("s")) move(south)
        else if (command.equals("e")) move(east)
        else if (command.equals("w")) move(west)
        else move(end)
    }

}

fun main(args: Array<String>) {
    val game = Game()
    println(game.path)
    game.east()
    game.north()
    game.south()
    game.west()
    game.end()
    println(game.path)
}