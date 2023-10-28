fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    useOfWhen(21);
    whenToUse(7);
}


fun useOfWhen(alarm: Int) {

//    var alarm = 12;
    when (alarm) {
        12, 15, 9, 8, 7 -> {
            println("this alaram is ${alarm}")
        };
        10 -> println("this alaram is ${alarm}");
        in 20..30 -> println("range is between 20 ... 30")
        else -> println("this alaram is ${alarm}");
    }
}

fun whenToUse(alarm: Int) {

    var description = when {
        alarm == 7 || alarm == 11 -> "the range is ${alarm}"
        alarm <= 10 -> "the range between less or equal ${alarm}"
        else -> "out of range ${alarm}"
    }
    println(description);
}
