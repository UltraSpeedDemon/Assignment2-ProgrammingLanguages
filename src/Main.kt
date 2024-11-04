/* Programming Languages - Assignment 2
*  Ethan Curtis - 1166648
*  ############ - #######
*
* Practices Functional Programming in Kotlin
* */

// Define small functions as defined in Task 1
fun addTen(number: Int):
        Int = number + 10 // Adds 10 to the number
fun multiplyByThree(number: Int):
        Int = number * 3 // Multiplies the number by 3
fun isGreaterThanFifty(number: Int):
        Boolean = number > 50 // Returns true if the number is greater than 50

//apply these functions to a list of numbers using a single variable
val processNumber: (Int) -> Boolean = { isGreaterThanFifty(multiplyByThree(addTen(it))) }

fun main() {
    // list of numbers to test on
    val numbers = listOf(3, 16, 22, 37, 43)

    // variable of the results
    val results = numbers.map(processNumber)

    //skip line
    println()
    // Printing results
    println("Results for each number in the list: $results") // Example output
}