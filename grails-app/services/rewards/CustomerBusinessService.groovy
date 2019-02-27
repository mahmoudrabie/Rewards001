package rewards

import grails.gorm.transactions.Transactional

@Transactional
class CustomerBusinessService {

    def getTotalPoints(Customer aCustomer) {
        def totalAwards = 0
        aCustomer.awards.each {
            totalAwards = totalAwards + it.points
        }
        aCustomer.totalPoints = totalAwards
        return aCustomer
    }

}
