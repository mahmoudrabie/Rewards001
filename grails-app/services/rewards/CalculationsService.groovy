package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

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
