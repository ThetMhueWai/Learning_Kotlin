class Car(var brand:String, var year:Int)

fun main() {
    var c1 = Car("Volvo",1990)
    var c2 = Car("Toyota",2000)

    c1.year = 1999
    println("First Car is: ${c1.brand} and ${c1.year}")
    println("Second Car is: ${c2.brand} and ${c2.year}")
}