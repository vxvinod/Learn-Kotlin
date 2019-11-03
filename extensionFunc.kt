import kotlin.random.Random

class Books(val name: String, val author: String, val year: Int, var pages: Int)

fun Books.weight() : Double {return pages*1.5}

fun Books.tornPages(torn: Int) = if(pages >= torn) pages -= torn else 0

class Puppy {

    fun playWithBook(book : Books){
        book.tornPages(
            Random.nextInt(12)
        )
    }

}

fun main(args : Array<String>) {
    val puppy = Puppy()
    val book = Books("Oliver Twist", "Charles Dickens", 1837, 540)

    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("${book.pages} left in ${book.name}")
    }
    println("Sad puppy, no more pages in ${book.name}. ")
}