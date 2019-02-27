package rewards

class CustomerController {
    static scaffold = Customer

    def customerBusinessService

    def checkin(){

    }


    def lookup(){
//        def customerInstance = Customer.list(sort: "totalPoints",
//                                                order: "desc")
        /*customerInstanceList is the used variable
        in the view equals to customerInstance*/

        def customers = Customer.findAllByTotalPointsBetween(2,4,[sort:"totalPoints",order:"desc"])
        [customerInstanceList: customers]
    }

    def index(){
//        params.max = 10
        def allCustomers = Customer.list()
        respond allCustomers
    }

    def create(){
        respond new Customer(params)
    }

    def show() {
        def customer = Customer.get(params.id)
        respond customer

    }

    def edit(Long id) {
        def customer = Customer.get(params.id)
        respond customer
    }

    def profile(){
        def customer = Customer.findByCustomerPhone(params.id)

        [customerInstance: customerBusinessService.getTotalPoints(customer)]
    }


}
