package rewards

import grails.gorm.services.Service

@Service(Customer)
class CalculationsService {

    def getTotalPoints(Customer aCustomer){
        def totalAwards = 0
        aCustomer.awards.each {
            totalAwards = totalAwards + it.points
        }
        aCustomer.totalPoints = totalAwards
        return aCustomer
    }

    def hi(){
        render "hi"
    }

    def welcome(passedParams) {
        def firstName = passedParams.first
        def totalPoints = passedParams.points.toInteger()
        def welcomeMessage = "Welcome $firstName"

        switch (totalPoints){
            case 5:
                welcomeMessage = "$welcomeMessage. This drink is on us."
                break
            case 4:
                welcomeMessage = "$welcomeMessage. Your next drink is free."
                break
            default:
                welcomeMessage = "$welcomeMessage. You have $totalPoints points."
                break;

        }
    }
}
