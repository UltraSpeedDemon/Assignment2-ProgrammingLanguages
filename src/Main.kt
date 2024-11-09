/* Programming Languages - Assignment 2
*  Ethan Curtis - 1166648
*  Dilraj Singh Aujla - 1177128
*
* Practices Functional Programming in Kotlin
* */

//TASK 1: ********************************
//small functions as defined in Task 1
fun addTen(number: Int):
        Int = number + 10 //adds 10 to the number
fun multiplyByThree(number: Int):
        Int = number * 3 //multiplies the number by 3
fun isGreaterThanFifty(number: Int):
        Boolean = number > 50 //returns true if the number is greater than 50

//apply these functions to a list of numbers using a single variable
val processNumber: (Int) -> Boolean = { isGreaterThanFifty(multiplyByThree(addTen(it))) }

//TASK 2: ********************************
//function to calculate the total sum using map and reduce
fun calculateTotal(scores: List<Int>):
        Int = scores.map { it }.reduce { sum, score -> sum + score } // Using map and reduce to calculate total

//function to calculate the average using map and reduce
fun calculateAverage(scores: List<Int>): Double {
    val total = calculateTotal(scores) //using the calculateTotal function to get the total
    return total.toDouble() / scores.size //returning the average
}

//function to filter out failing scores using filter
fun filterPassingScores(scores: List<Int>):
        List<Int> = scores.filter { it >= 50 } //filtering out scores less than 50

//TASK 3: ********************************
//...

fun main() {
    //TASK 1: Main function **************
    // list of numbers to test on
    val numbers = listOf(3, 16, 22, 37, 43)

    // variable of the results
    val results = numbers.map(processNumber)

    //skip line
    println()
    // Printing results
    println("Results for each number in the list: $results") // Example output

    //skip line
    println()

    //TASK 2: Main function **************
    //Original list of scores in Task 2
    val scores = listOf(45, 67, 89, 32, 56, 78, 90, 48)

    //variables to perform the functions
    val average = calculateAverage(scores) //calculates average using function
    val passingScores = filterPassingScores(scores) //filters out failing scores using function

    //Print the results
    println("Average score: $average")
    println("Passing scores: $passingScores")

    //skip line
    println()

    //TASK 3: Main function ***************
    val numbersList = listOf(1, 2, 3, 4, 5, 6)

    // Calculate the square of each number using map
    val squares = numbersList.map { it * it }

    // Filter even numbers using filter
    val evenSquares = squares.filter { it % 2 == 0 }

    println("Even squares: $evenSquares")
}

