package rewards

class Customer {
    String firstName
    String lastName
    Long customerPhone
    String customerEmail
    Integer totalPoints

    static hasMany = [awards:Award, orders:OnlineOrder]

    static constraints = {
        customerPhone(max: 99999999999, unique: true)
        firstName(maxSize: 30)
        lastName(maxSize: 30)
        customerEmail( nullable: true,
                       email: true,
                       unique: true,
                       maxSize: 100)
        totalPoints(min: 0, max: 10)
    }
}

