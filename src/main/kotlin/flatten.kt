fun main(strings: Array<String>) {


    var numberList = listOf<Set<Int>>(setOf<Int>(10, 20, 30), setOf<Int>(40, 50, 60), setOf<Int>(70, 80, 90));

    for (number in numberList) {

        for (num in number) {
            println(num);
        }
    }
    //two daimensional array.

    var listNumbers = numberList.flatten();
    for (number in listNumbers) {
        println(number);
    }
}

