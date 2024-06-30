class User() {
    var userID: String = ""
    var userName: String = ""
    init{
        userID = "P001"
        userName = "David"
    }
    fun printUser(){
        println("User is $userID and $userName")
    }
}
fun main(){
    val user1 = User()
    val user2 = User()

    user1.printUser()
    user2.printUser()

    user1.userName = "John"
    user1.userID = "P002"

    user1.printUser()
    user2.printUser()

}