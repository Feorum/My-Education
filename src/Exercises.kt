data class Employee (val name: String, var salary: Int)

fun employeeById(id: Int) = when(id) {
    1 -> Employee("Mary", 20)
    2 -> null
    3 -> Employee("John", 21)
    4 -> Employee("Ann", 23)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0

fun main() {
    println((1..5).sumOf { id -> salaryById(id) })
}

/*import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val employeeList = listOf("Fiodar","John","Sonya","Henry","Nik","Alfred","Sol")
    fun generateEmployee(): Employee {
        val genEmp = employeeList.random()
        var genSal = Random.nextInt(minSalary, maxSalary)
        return Employee(genEmp, genSal)
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}*/

/*data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
data class Name(val name: String, val name2: String)
data class Address(val address: String, val city: City)
data class City(val street: String, val town: String)

fun main() {
    val person = Person(
        Name("John", "Smith"),
        Address("123 Fake Street", City("Springfield", "US")),
        ownsAPet = false
    )
}*/

/*
data class Employee(val name: String, var salary: Int)

fun main() {
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)
}
*/

/*fun repeatN(n: Int, action: () -> Unit) {
    var zero = 0
    while (zero < n) {
        zero++
        action()
    }
    return Unit
}

fun main() {
    repeatN(5) {println("Hello")}
}*/

/*fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map {action -> "$prefix/$id/$action"}
        println(urls)
}*/

/*fun main() {
    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words){
        if (word.startsWith("l"))
           print("$word ")
        else  null
    }
}*/

/*fun main() {
    for (num in 1..100){
        when {
           num%3 or num%5 == 0 -> println("fizzbuzz")
           num%3 == 0 -> println("fizz")
           num%5 == 0 -> println("buzz")
           else -> println(num)
        }
    }
}*/

/*fun main() {
    var pizzaSlices = 0
    while (pizzaSlices < 8) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
    do {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    } while (pizzaSlices < 8)
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}*/

/*fun main() {
    val number2word = mapOf<Int, String>(1 to "one", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as '${number2word[n]}'")
}*/

/*fun main(){
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
//    val isSupported = SUPPORTED.contains(requested.uppercase()) // альтернатива нижнему решению (в рамках курса нижнее - правильнее)
    val isSupported = requested in SUPPORTED
        println("Support for ${requested.uppercase()}: $isSupported")
}*/

/*fun main(){
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println(greenNumbers.count()+redNumbers.count())
}*/

/*
fun main() {
    val name = "Mary"
    val age = 20
    // Write your code here
    println("$name is $age years old")
}
*/

/*
fun main(){
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
    println("$a,$b,$c,$d,$e,$f")
}
*/