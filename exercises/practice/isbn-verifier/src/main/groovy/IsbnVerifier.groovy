class IsbnVerifier {
    static boolean isValid(String isbn) {
        def total = 0
        def val = isbn.replace("-","")
        if (val.length() != 10) {
            return false
        }
        try{
            val.take(9).reverse().eachWithIndex { String entry, int i ->
                total += entry.toInteger() * (i + 2)
            }
        } catch (Exception e) {
            return false
        }

        int check
        if (val[-1] == 'X') {
            check = 10
        } else if ((val[-1] as char).isLetter()) {
            return false
        } else {
            check = val[-1].toInteger()
        }
        return (total+check)%11 == 0
    }

}