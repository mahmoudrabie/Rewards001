package rewards

class CustomerController {
    static scaffold = Customer

    def checkin(){

    }

    def lookup(){
        def customerInstance = Customer.list(sort: "totalPoints",
                                                order: "desc")
        /*customerInstanceList is the used variable
        in the view equals to customerInstance*/
        [customerInstanceList: customerInstance]
    }

    def index(){
        params.max = 10

    }
}
