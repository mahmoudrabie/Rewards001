package rewards

import org.grails.datastore.mapping.model.types.Custom

class OnlineOrder {
    Date orderDate
    Integer orderNumber
    Float orderTotal

    static belongsTo = [customer: Customer]
    static hasMany = [orderItems:OrderItem]

    static constraints = {
    }
}
