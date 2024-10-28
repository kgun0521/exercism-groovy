class RomanNumerals {
    RomanNumerals() {
        Integer.metaClass.getRoman = { ->
            def vals = [1000:'M', 900:'CM', 500:'D', 400:'CD', 100:'C', 90:'XC', 50:'L', 40:'XL', 10:'X',  9:'IX', 5:'V', 4:'IV', 1:'I']
            def romanStr = ''
            int curNum = delegate as int
            def val = 0
            vals.eachWithIndex { entry, index ->
                val = curNum.intdiv(entry.key)
                curNum = curNum%(entry.key)
                romanStr += entry.value*val
            }
            return romanStr
        }
    }
}
