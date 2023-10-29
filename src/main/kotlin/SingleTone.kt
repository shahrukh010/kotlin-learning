fun main(strings: Array<String>) {

    var instance = Database.getInstance();
    println(instance);
    instance = Database.getInstance();
    println(instance);
}

class Database private constructor() {

    companion object {

        private var instance: Database? = null;

        fun getInstance(): Database? {

            if (instance == null) {
                instance = Database();
            }
            return instance;
        }

    }
}

