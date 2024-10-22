class ArmstrongNumber {

    static isArmstrongNumber(number) {
        def strNumber = number.toString()
        return strNumber.collect {it as int ** strNumber.length()}.sum() == number
    }

}