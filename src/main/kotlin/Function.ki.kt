fun main(string: Array<String>) {

    sayHello("annie", 25);

    var list: List<String> = listOf("10", "20", "30", "40", "50");
//    println(list)
    for (data in list) {
        println(data);
    }

    var hasInternetConnection = true;

    if (hasInternetConnection) {
        getData("some data")
    } else {
        showMessage();
    }
    println(max(101, 66));
    defaultFunction("annie", "");
    defaultFunction("annie");
    defaultFunction();
    passNumbers(1, 2, 3, 4, 5)

}

fun sayHello(name: String, age: Int) {
    println("You'r name is $name and age is $age");
}

fun getData(data: String) {

    println("data:$data");
}

fun showMessage() {
    println("no internect connection....");
}


fun max(num1: Int, num2: Int): Int {

    var max = if (num1 < num2) num2 else num1
    max = Math.max(num1, num2);

    return max;

//    return Math.max(num1,num2);
    // return max;
}


//function overloading
fun toString(input: Int): Int {

    return 0;
}

fun toString(input: String, nums: Int): Int {

    return 0;
}


fun defaultFunction(name: String = "hector", message: String = "how are you") {

    println("$name and $message")
}

fun passNumbers(vararg number: Int) {

    var sum = 0;
    for (data in number) {
        sum += data;
    }

    println(sum);
    number.forEach{println(it)};
//    println(number);
}
