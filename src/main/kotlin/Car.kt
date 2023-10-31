import java.util.UUID

fun main(args: Array<String>) {

    var car = Car();
    car.name = "Ford";
    car.model = "F2019";
    car.color = "Black";
    car.doors = "2";

    println("name: ${car.name}");
    println("model: ${car.model}");
    println("color: ${car.color}");
    println("doors: ${car.doors}");


    val product = Product(11111, "Iphone", "Iphone15-256Gb", 850000.00);
    println(product)

    //in this car Customer(...)object treating as properties not parameters because of if you see in Customer class var keyword are using but in Product treated as parameter
    var customer = Customers(UUID.randomUUID().toString(), "Annie", "Hyderabad");
    println(customer);
}


class Car {

    var name = "";
    var model = "";
    var color = "";
    var doors = "";


    fun move() {

        println("car is moving")
    }

    fun back() {
        println("car is backing");
    }


}

//declaring class using primary constructor
class Product(id: Int, name: String, description: String, amount: Double) {

    var id = id;
    var name = name;
    var description = description;
    var amount = amount;

    override fun toString(): String {
        return "Product(id=$id, name='$name', description='$description', amount=$amount)"
    }
}

//because of var it becomes propertes so no need to declare instance variable if you remove var then you have delcare instance variable also because of ttreated as constructor arrgument
class Customers(var id: String, var name: String, var location: String) {

    override fun toString(): String {

        return "id:${id}, name: $name, location: $location";
    }
}