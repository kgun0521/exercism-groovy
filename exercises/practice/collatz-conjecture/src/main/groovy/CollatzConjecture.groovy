class CollatzConjecture {

    static int steps(int number) {
        if (number <= 0) {
            throw new ArithmeticException()
        }
        int val = number
        def count = 0
        while (val > 1) {
            if (val%2 == 0){
                val = (val/2) as int
            } else {
                val = 3*val + 1
            }
            count++
        }
        return count
    }
}