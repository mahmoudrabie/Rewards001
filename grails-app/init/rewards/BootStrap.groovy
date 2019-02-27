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
        new rewards.Customer(customerPhone: 8015551212, firstName: "Luther", lastName: "Allison", totalPoints: 1).save()
        new rewards.Customer(customerPhone: 2135551212, firstName: "Bessie", lastName: "Brown", totalPoints: 2).save()
        new rewards.Customer(customerPhone: 6055551212, firstName: "Bo", lastName: "Diddley", totalPoints: 3).save()
        new rewards.Customer(customerPhone: 6165551212, firstName: "Leroy", lastName: "Foster", totalPoints: 4).save()
        new rewards.Customer(customerPhone: 8015554321, firstName: "Earl", lastName: "Hooker", totalPoints: 5).save()
        new rewards.Customer(customerPhone: 7315551212, firstName: "Maggie", lastName: "Jones", totalPoints: 5).save()
        new rewards.Customer(customerPhone: 8185551212, firstName: "Nick", lastName: "Moss", totalPoints: 4).save()
        new rewards.Customer(customerPhone: 7085551212, firstName: "Odie", lastName: "Payne", totalPoints: 3).save()
        new rewards.Customer(customerPhone: 4155551212, firstName: "Jonny", lastName: "Shines", totalPoints: 2).save()
        new rewards.Customer(customerPhone: 7225551212, firstName: "Ethel", lastName: "Waters", totalPoints: 1).save()
        new rewards.Customer(customerPhone: 6045551212, firstName: "Scrapper", lastName: "Blackwell", totalPoints: 1).save()
        new rewards.Customer(customerPhone: 7315551122, firstName: "Archie", lastName: "Edwards", totalPoints: 2).save()
        new rewards.Customer(customerPhone: 5145551212, firstName: "Jessie", lastName: "Fuller", totalPoints: 3).save()
        new rewards.Customer(customerPhone: 4085551212, firstName: "Ida", lastName: "Goodson", totalPoints: 4).save()
        new rewards.Customer(customerPhone: 8015551234, firstName: "Bumble Bee", lastName: "Smith", totalPoints: 5).save()
        new rewards.Customer(customerPhone: 4315551212, firstName: "Sippie", lastName: "Wallace", totalPoints: 4).save()

    }

    def destroy = {
    }
}
