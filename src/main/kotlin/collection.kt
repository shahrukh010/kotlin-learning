
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

	
}

data class User(var id:Int,var name:String)
