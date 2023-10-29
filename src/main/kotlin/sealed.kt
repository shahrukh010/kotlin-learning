fun main(strings: Array<String>) {

    var success = Result.Success("Success");
    var error = Result.Error("error");
    getData(error);
}

fun getData(result: Result) {

    when (result) {
        is Result.Success -> result.showMessage();
        is Result.Error -> result.showMessage();
    }
}


sealed class Result(var message: String) {

    fun showMessage() {
        println("Result: $message")
    }

    class Success(message: String) : Result(message);
    class Error(message: String) : Result(message);
}
