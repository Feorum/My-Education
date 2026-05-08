fun main(){
data class Product(val name: String, val price: Double)

val products = listOf(
    Product("Apple", 1.5),
    Product("Banana", 2.0),
    Product("Orange", 3.0)
)

// Селектор: it.price (берем цену каждого продукта)
val totalPrice = products.sumOf { it.price }

println(totalPrice) // Выведет: 6.5
}

/*fun main() {
    val nullString: String? = null
    println(nullString?.uppercase())
    // null
}*/

/*fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    val nullString: String? = null
    println(lengthString(nullString))
    // null
}*/

/*fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun main() {
    val nullString: String = " "
    println(describeString(nullString))
    // Empty or null string
}*/

/*data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)

    // Creates an exact copy of user
    println(user.copy())
    // User(name=Alex, id=1)

    // Creates a copy of user with name: "Max"
    println(user.copy("Max"))
    // User(name=Max, id=1)

    // Creates a copy of user with id: 3
    println(user.copy(id = 3))
    // User(name=Alex, id=3)

    var user2 = user.copy("Oleg")
    println(user2)
    user2 = User("Nikita", 1)
    println(user2)
}*/

/*data class User(val name: String, val id: Int)

fun main() {
    val user = User("Alex", 1)

    // Automatically uses toString() function so that output is easy to read
    println(user)
    // User(name=Alex, id=1)

}*/


/*
fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val doubled = numbers.map { x -> x * 2 }

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)

    println(doubled)
    // [2, -4, 6, -8, 10, -12]
    println(tripled)
    // [3, -6, 9, -12, 15, -18]

}
*/

/*fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter({ x -> x > 0 })

    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)

    println(positives)
    // [1, 3, 5]
    println(negatives)
    // [-2, -4, -6]

}*/

/*fun main() {
    val upperCaseString = {text: String -> text.uppercase() }
    println(upperCaseString("hello"))
    // HELLO
}*/

/*fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) =
    ((hours * 60) + minutes) * 60 + seconds

fun main() {
    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(0, 1, 25))
    println(intervalInSeconds(2, 0, 0))
    println(intervalInSeconds(0, 10, 0))
    println(intervalInSeconds(1, 0, 1))
}*/
/*
import kotlin.math.PI

fun circleArea(radius: Int) = PI*(radius*radius)

fun main() {
    println(circleArea(2))
}
*/

/*fun main() {
    var cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < cakesEaten)
}*/

/*import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    if (firstResult == secondResult)
        println("You win:)")
    else
        println("You lose :(")
    val button = "A"
    println(
        when (button){
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}*/

/*fun main(){
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = shapes // так называемый casting
    println("At all - ${shapes.count()} elements")
    println("first ${shapes.first()}, last ${shapes.last()}")
    println("Is there triangle in the List?")
    println("triangle" in shapesLocked)

    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry") // второй чери опускается
    println(readOnlyFruit)
    println(fruit.count())
    println("Is there cherry in the Set?")
    println("cherry" in fruit)
    fruit.add("dragonfruit")
    fruit.remove("cherry")
    println(fruit)
    println(fruit.count())

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
    println("The value of apple juice is: ${juiceMenu["apple"]}")
}*/

/*fun main(){
    val separator: Char = ','
    val separator2: Char = ' '
    val separator3: Char = '!'
    val message: String = "Hello"
    val message2: String = "world"
    println("$message$separator$separator2$message2$separator3")
}*/
/*fun main(){
    var dogs = 10
    dogs = 18
    dogs /= 6
    println(dogs)
    dogs *= 10
    println(dogs)
}*/


/*
fun main() {
    println("Hello world")

    val dog = 2
    val meat = 5
    var cat = meat


    println("Котов у нас $cat")
    }*/
