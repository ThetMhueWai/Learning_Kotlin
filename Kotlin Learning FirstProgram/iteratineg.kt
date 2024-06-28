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
        u++
    }
}