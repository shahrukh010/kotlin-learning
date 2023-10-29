fun main(strings: Array<String>) {

    var view = View();
    var button = Button("Login", "Center")
    var roundButton = RoundButton("SignUp", "Center", 5);
    view.draw();
    button.draw();
    roundButton.draw();

}

open class Cars(var name: String, var color: String) {


    //because of override we put opne move function
    open fun move() {

        println("$name is move");
    }

    fun stop() {
        println("$name is stop");
    }

}

class Vehicle(name: String, color: String, var engine: String, var doors: String) : Cars(name, color) {

    override fun move() {
        println("vechile is $name");
    }
}


open class View {

    open fun draw() {
        println("Drawing the view.");
    }
}

open class Button(var text: String, var orientation: String) : View() {

    override fun draw() {
        println("Drawing the view is override from button");
        super.draw();
    }
}

class RoundButton(text: String, orientation: String, var center: Int) : Button(text, orientation) {


    override fun draw() {
        println("Drawing the view with center");
        super.draw()//calling super function also
    }
}