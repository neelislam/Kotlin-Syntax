import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Choose a pattern to display:")
        println("1. Upper Triangle")
        println("2. Triangle")
        println("3. Pyramid")
        println("4. Reverse Pyramid")
        println("5. Diamond")
        println("6. Right-angled Triangle")
        println("7. Hollow Square")
        println("8. Exit")

        when (scanner.nextInt()) {
            1 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printUpperTriangle(n)
            }
            2 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printTriangle(n)
            }
            3 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printPyramid(n)
            }
            4 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printReversePyramid(n)
            }
            5 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printDiamond(n)
            }
            6 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printRightAngledTriangle(n)
            }
            7 -> {
                println("Enter the size of the pattern:")
                val n = scanner.nextInt()
                printHollowSquare(n)
            }
            8 -> {
                println("Exiting...")
                break
            }
            else -> println("Invalid choice, please try again.")
        }
    }
}

fun printUpperTriangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun printTriangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..n - i) {
            print("  ")
        }
        for (k in 1..(2 * i - 1)) {
            print("* ")
        }
        println()
    }
}

fun printPyramid(n: Int) {
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}

fun printReversePyramid(n: Int) {
    for (i in n downTo 1) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}

fun printDiamond(n: Int) {
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
    for (i in n - 1 downTo 1) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
}

fun printRightAngledTriangle(n: Int) {
    for (i in 1..n) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}

fun printHollowSquare(n: Int) {
    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1 || i == n || j == 1 || j == n) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println()
    }
}
