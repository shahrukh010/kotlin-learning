
fun main(strings:Array<String>){

	var numberList = mutableListOf("one","two","three","four","five");

	var filterIndex1 = numberList.filterIndexed{index,s -> (index !=0 && s.length<5)};
	var filterIndex2 = numberList.filterIndexed{index,s -> (index !=0 && s.length<=3)};
	var filterNots = numberList.filterNot{ it.length<=3};

	println(filterIndex1);
	println(filterIndex2);
	println(filterNots);



	var numbers = listOf(1,"one",2.0,"two",3,"three");

	numbers.filterIsInstance<String>().forEach{

		println(it.uppercase());
	}
	numbers.filterIsInstance<Double>().forEach{
		println(it);
	}

	var user1 = User(1111,"annie");
	var user2 = User(2222,"bridget");
	var user3 = User(3333,"nic");

	var customer1 = Customer(101,"hector");
	var customer2 = Customer(102,"alex");
	var customer3 = Customer(103,"alex");

	var user_customer = mutableListOf(user1,user2,customer1,customer2,user3,customer3);

	user_customer.filterIsInstance<User>().forEach{
		println(it);
	}

	user_customer.filterIsInstance<Customer>().forEach{
		println(it);
	}

	var (match,rest) = numberList.partition{it.length<=3};
	println(match);
	println(rest);

	var (user,customer) = user_customer.partition{it is User};
	println(user);
	println(customer);
}

data class User(var id:Int,var name:String)

data class Customer(var id:Int,var name:String)
