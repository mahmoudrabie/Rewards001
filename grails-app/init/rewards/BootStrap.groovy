package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(productName: "Morning Blend",
                    productSKU: "MB01",
                    productPrice: 14.95).save()
        new Product(productName: "Dark Roast",
                    productSKU: "DR01",
                    productPrice: 12.95).save()
        new Customer(
                customerEmail: "mahmoudrabie2004@gmail.com",
                customerPhone: "966556246670",
                firstName: "Mahmoud",
                lastName: "Rabie",
                totalPoints: 10).save()

    }

    def destroy = {
    }
}
