fun main(args: Array<String>) {

    // println("hello world");

    var text: String? = null;

    //how to get null pointer exception
//    println(text!!.length);

    text = "hector";
    println(text);
    println(text?.length);

    //assign new value if text value is null
    val newText = text ?: "text is null so im new value";
    println(newText);


}