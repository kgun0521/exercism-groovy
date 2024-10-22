class Hamming {

    def distance(strand1, strand2) {
        def distance = 0
        if (strand1.length() != strand2.length()) {
            throw new ArithmeticException()
        }
        strand1.eachWithIndex { String entry, int i ->
            if (entry != strand2[i]) {
                distance++
            }
        }
        return distance
    }

}