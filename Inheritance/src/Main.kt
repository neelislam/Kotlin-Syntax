//Super class
open class Parent{
    val x =5
    fun parentfun(){
        println("Fathers car: Mustang")
        println("Value of x before child call: " + x)
    }

}

//sub class

class child: Parent(){
    fun childfun(){
        val x = 9
        println("Now running Child car: BMW")
        println("Value of x after child call: " + x)
    }
}
fun main() {
    val obj2 = Parent()
    obj2.parentfun()
    val obj = child()
    obj.childfun()

}