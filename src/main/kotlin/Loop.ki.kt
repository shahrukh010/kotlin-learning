fun main(input: Array<String>) {

    useOfLoop()
}

fun useOfLoop() {

    for (i in 1..5) {
        println("i:" + i);
    }
    //until exclude 10
    for (i in 1 until 10) {
        println(i);
    }

    //reverse print number...
    for (i in 10 downTo 1) {
        println(i);
    }

    for (i in 1 until 10 step 2)
        println(i);

    var number = 1;

    while (number < 10) {
        println("while:" + number);
        number++;
    }
}