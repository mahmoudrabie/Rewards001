package rewards

class BootStrap {

    def init = { servletContext ->
        new Product(productName: "Morning Blend",
                    productSKU: "MB01",
                    productPrice: 14.95).save()
        new Product(productName: "Dark Roast",
                    productSKU: "DR01",
                    productPrice: 12.95).save()
    }
    def destroy = {
    }
}
