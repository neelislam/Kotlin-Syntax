fun main() {
    var greeting = "Hello"
    var greetingType: String = "Hello Im String"
    println(greeting)
    println(greetingType)

    var name: String
    name = "First declare the variable type to string then printed"
    println(name)

    var txt = "A B C D E F G"
    println("Accessing index 0 and 2 of A to G, where 2 is a space and 4 is C")
    println(txt[4]) // first element (H)
    println(txt[1]) // third element (l)

    var txtsize = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("The length of ABCDEFGHIJKLMNOPQRSTUVWXYZ is: " + txtsize.length)

    var txtCapSmall = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(txtCapSmall.toUpperCase()+" -ToUpperCase()")   // Outputs "HELLO WORLD"
    println(txtCapSmall.toLowerCase()+" -ToLowerCase()")   // Outputs "hello world




    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println("Comparing 2 strings")
    println(txt1.compareTo(txt2) )  // Outputs 0 (they are equal)
    val isSame=txt1.compareTo(txt2);
    if(isSame == 0) println("They are equal")
    else println("They are not equal")

    //locating
    var locating = "Please locate where 'locate' occurs!"
    print(locating.indexOf("locate"))  // Outputs 7
    println("locate - Located using variable.indexOf")




    var firstName = "John "
    var lastName = "Doe"
    println(firstName.plus(lastName))
    println("Joined name using variable1.plus(variable2)")

}