fun main(args: Array<String>) {

    var user1 = Userss(1111, "annie");
    var user2 = Userss(2222, "hector");

    //list example
    val userList = mutableListOf(user1, user2);
//	println(userList);

    for (user: Userss in userList) {
        println(user);

    }
    //set example


    var user3 = Userss(3333, "bridget");
    var user4 = Userss(4444, "nic");
    var user5 = Userss(2222, "hector");

    val userSet = mutableSetOf(user1, user2, user3, user4, user5);

    println("Iterate set element.");
    for (user: Userss in userSet) {
        println(user);
    }

    val maps = mutableMapOf(1 to "one", 2 to "two", 3 to "three");
//	println(maps.keys);


    val numbersMap = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11);

    var result = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10 };
    println(result);
    numbersMap.putAll(setOf("four" to 4, "five" to 5));
    numbersMap.put("six", 6);
    println(numbersMap);


    //transformation.

    println("Transformation");
    var numbers = setOf(1, 2, 3);
    println(numbers.map { it * 3 });

    //zip
    println("ZIP");

    var color = listOf("red", "brown", "grey");
    var animal = listOf("fox", "cow", "dog");
    println(color zip animal);

    animal = listOf("fox", "bear", "wolf");

    println(color.zip(animal) { col, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $col" });


    //list iterator.
    var number = listOf("one", "three", "five", "seven", "nine", "eleven");

    var numberIterator = number.iterator();

    while (numberIterator.hasNext()) {

        println(numberIterator.next());
    }

    //ranges and progressions.
    println(1 in 1..4);

    for (index in 1..10) {
        println(index);
    }

    for (index in 0..8 step 2) {
        println(index);
    }


}

data class Userss(var id: Int, var name: String)
