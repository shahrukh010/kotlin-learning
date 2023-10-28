fun main(args: Array<String>) {

    val names: Array<String> = arrayOf("annie", "hector", "bridget", "nic");
    val friends = arrayOf("annie", "hector");

    for (data in names) {
        println(data);
    }

//    names.forEach {
//        print(it + ",");
//    }

    for (index in 0..names.size - 1) {

        println("$index : ${names[index]}");
    }
    //print reverse names array
    for (index in names.size - 1 downTo 0) {

        println("$index : ${names[index]}")
    }
//    println(names[0]);

    //mixed array datatypes
    val inputs = arrayOf("annie", "hector", 1200, 3000);
    inputs.forEach { println(it) }


    //print only number from array;

    for (data in inputs) {

        if (data is Int) {
            println("it is integer $data");
        }
    }


}