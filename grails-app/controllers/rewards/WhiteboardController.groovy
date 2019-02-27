package rewards

class WhiteboardController {
    CalculationsService calculationsService

    def index() {
        render"Hello from Whiteboard controller."
    }

    def variables(){
        def myTotal = 1
        render("<p><b>Total</b> : "+myTotal)
        render("</br>"+myTotal.class)
        myTotal = myTotal + 1
        render("</br> New Total : "+myTotal)

        def firstName = "Mahmoud"
        render("<p><b>First Name</b> : "+firstName)
        render("</br>"+firstName.class)
        firstName = firstName + 1
        render("</br> New First Name : "+firstName)

        def today = new Date()
        render("<p><b>Today</b> : "+today)
        render("</br>"+today.class)
        today = today + 1
        render("</br> New Date : "+today)
    }

    def strings(){
        def first = "Mahmoud"
        def last = "Rabie"
        def fullName = "$first $last"
        def points = 10

        render "<p>Today is ${new Date()}"
        render "</br>Your name $fullName has ${fullName.length()} characters."
        render "</br>Your name in captial letters is ${fullName.toUpperCase()}"
    }

    def conditions(){
        def welcomeMessage = calculationsService.welcome(params)
        render welcomeMessage
    }
}
