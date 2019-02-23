package rewards

class Product {
    String productName
    String productSKU
    Float productPrice

    static hasMany = [orderItems:OrderItem]

    static constraints = {
    }
}
