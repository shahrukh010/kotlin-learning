import java.util.*

fun main(strings: Array<String>) {

    var user = InitializeBlock("nic", "uk", true);
}

class InitializeBlock(user: String, var location: String, var flag: Boolean) {

    var user: String;

    init {
        if (user.lowercase(Locale.getDefault()).startsWith("a")) {

            this.user = user;
        } else {
            this.user = "user does not start with a";
            println(user);
        }
    }
}