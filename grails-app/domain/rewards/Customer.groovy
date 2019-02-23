package rewards

class Customer {
    String firstName
    String lastName
    Long customerPhone
    String customerEmail
    Integer totalPoints

    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
    }
}
