fun main() {
    while (true) {
        println("Welcome to the Kotlin Calculator!")
        println("Choose an operation:")
        println("1. Addition (+)")
        println("2. Subtraction (-)")
        println("3. Multiplication (*)")
        println("4. Division (/)")
        println("5. Exit")
        print("Enter your choice (1-5): ")

        val choice = readLine()?.toIntOrNull()

        if (choice == 5) {
            println("Exiting the calculator. Goodbye!")
            break
        }

        if (choice !in 1..4) {
            println("Invalid choice. Please try again.")
            continue
        }

        print("Enter the first number: ")
        val num1 = readLine()?.toDoubleOrNull()
        print("Enter the second number: ")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input. Please enter valid numbers.")
            continue
        }

        val result = when (choice) {
            1 -> num1 + num2
            2 -> num1 - num2
            3 -> num1 * num2
            4 -> {
                if (num2 == 0.0) {
                    println("Division by zero is not allowed.")
                    continue
                }
                num1 / num2
            }
            else -> null
        }

        println("The result is: $result")
        println("------------------------------------------------")
    }
}
