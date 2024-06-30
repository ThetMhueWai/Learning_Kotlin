class Car(var brand:String, var year:Int){
    init{
        println("$brand is initialized in $year")
    }

    constructor(b:String,y:Int,wheel:Int):this(b,y){
        println("$b has $wheel wheels.")
    }

    fun drive(){
        println("Driving... $brand")
    }
    fun speed(s:Int){
        println("Speed of $brand is $s.")
    }
}

fun main() {
    var c1 = Car("Volvo",1990)
    var c2 = Car("Toyota",2000)
    var c3 = Car("Honda",2010,10)
    // c1.year = 1999

    // println("First Car is: ${c1.brand} and ${c1.year}")
    // println("Second Car is: ${c2.brand} and ${c2.year}")

    // c1.drive()
    // c2.drive()
    // c1.speed(100)
    // c2.speed(80)
}