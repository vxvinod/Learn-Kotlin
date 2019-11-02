class Book(val name: String, val author: String, val year: Int) {

    fun getTileAuthor(): Pair<String, String> {
        return Pair(name, author)
    }

    fun getTileAuthorYear(): Triple<String, String, Int> {
        return Triple(name, author, year)
    }
}

fun main(args: Array<String>) {
    val book = Book("48 laws of power", "Vinod", 2019)
    val titleAuthor = book.getTileAuthor()
    val titleAuthorYaer = book.getTileAuthorYear()
    println("Title Author ${titleAuthor.first}--${titleAuthor.second}")
    println("Title Author Year ${titleAuthorYaer.first}--${titleAuthorYaer.second}--${titleAuthorYaer.third}")
}