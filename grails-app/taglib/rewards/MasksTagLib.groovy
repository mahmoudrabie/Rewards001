package rewards

class MasksTagLib {
    static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'],
    // otherTagName: [taglib:'none']]

    def phone334 = { attrs ->
        String phone = attrs.phone

        def first3 = phone.substring(0,3)
        def second3 = phone.substring(3,6)
        def third4 = phone.substring(6)
        def formatted = "( $first3 ) $second3-$third4"

        out << formatted

    }
}
