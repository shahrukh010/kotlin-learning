import java.util.UUID

fun main(strings: Array<String>) {

    var user = User(UUID.randomUUID().toString());
    var user1 = User(UUID.randomUUID().toString(),"nic");

    println("Id:${user.id},\n user:${user.userId}\n passwrod:${user.password}")
    println("Id:${user1.id},\n user:${user1.userId}\n passwrod:${user1.password}")
}

class User(var id: String, var userId: String, var password: String) {

    //secondary constructor  this will call again primary constructor
    constructor(id: String) : this(id, "hector01", "annie");

    constructor(id: String, userId: String) : this(id, userId, "bridget");

}