fun main(args: Array<String>) {
    val fruits:ArrayList<String> = ArrayList()  

    fruits.add("Apple")
    fruits.add("Banana")
    fruits.add("Orange")

    for (f in fruits) 
    {
        println(f)
    }

    val cars = listOf("BMW","Toyota","Volvo") // mutableListOf can add array
    // cars.add("Something!")
    cars.forEachIndexed{
        i,c -> println("$i => $c")
    }

    var u = 1
    while(u<=10){
        if(u%5==0)          //break
        println(u)          // 1  2  3  4  
        u++
    }
    println("Out of the loop: $u")


    var j = 1
    do{
        println(j)
        j++
    }while(j<=5)

    greeting("Hello Kotlin!",3) // function call

    //lateinit var a:String // lateint mhr var pl thone
    //a="Hello"
    //println(a)
}

fun greeting(msg:String,count:Int){
    for(c in 1..count)
    println("from main:$msg $c")

    //count++ // function parameter is always val not chage var so count++ is not working
    println(count)
}