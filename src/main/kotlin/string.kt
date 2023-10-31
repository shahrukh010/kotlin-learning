fun main(strings: Array<String>) {

    var numberStrings = listOf("one", "two", "three");
    println(numberStrings);

    println(numberStrings.joinToString());

    println(numberStrings.joinToString(separator = " | ", prefix = "start:", postfix = ": end"));

    var number = (1..10).toList();
    println(number);
}