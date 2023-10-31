
fun main(args: Array<String>){

	var user1 = User(1111,"annie");
	var user2 = User(2222,"hector");

	//list example
	val userList = mutableListOf(user1,user2);
//	println(userList);

	for(user:User in userList){
		println(user);

	}
	//set example
	
	
	var user3 = User(3333,"bridget");
	var user4 = User(4444,"nic");
	var user5 = User(2222,"hector");

	val userSet = mutableSetOf(user1,user2,user3,user4,user5);

	println("Iterate set element.");
	for(user:User in  userSet){
		println(user);
	}

	val maps = mutableMapOf(1 to "one",2 to "two", 3 to "three");
//	println(maps.keys);


	val numbersMap = mutableMapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11);

	var result = numbersMap.filter{(key,value) -> key.endsWith("1") && value > 10};
	println(result);
	numbersMap.putAll(setOf("four" to 4,"five" to 5));
	numbersMap.put("six",6);
	println(numbersMap);


	//transformation.
	
	println("Transformation");
	val numbers = setOf(1,2,3);
	println(numbers.map{it * 3});

	//zip
	println("ZIP");

	val color = listOf("red","brown","yellow");
	val animal = listOf("fox","cow","dog");
	println(color zip animal);

}

data class User(var id:Int,var name:String)
