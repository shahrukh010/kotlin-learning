fun main(strings: Array<String>) {

    println(Direction.EAST);

    for (direction in Directions.values()) {
        println("$direction : ${direction.distance}")
    }

    var direction: String = Direction.SOUTH.name;

    when (direction) {

        "SOUTH" -> println("direction is ${direction}");
        "NORTH" -> println("direction is ${direction}");
        "EAST" -> println("direction is ${direction}")
        "WEST" -> println("direction is ${direction}");
        else -> println("not direction found");
    }
}

enum class Direction {

    NORTH,
    SOUTH,
    EAST,
    WEST

}

enum class Directions(var direction: String, var distance: Int) {

    NORTH("NORTH", 10),
    SOUTH("SOUTH", 15),
    EAST("EAST", 25),
    WEST("WEST", 99)
}