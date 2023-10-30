fun main(strings: Array<String>) {

}

abstract class Users(var id: Int, var name: String) {

    abstract fun getId();
    abstract fun getUserName(): String
}

class UserImpl(id: Int, name: String) : Users(id, name) {
    override fun getId() {
        TODO("Not yet implemented")
    }

    override fun getUserName(): String {
        TODO("Not yet implemented")
    }

}