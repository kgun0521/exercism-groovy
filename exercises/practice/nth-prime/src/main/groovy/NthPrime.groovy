class NthPrime {

    static nth(int n) {
        if (n == 0) {
            throw new ArithmeticException()
        }
        def (i, j)= [0,1]
        while (i < n) {
            j++
            if (isPrime(j)) {
                i++
            }
        }
        return j
    }

    static def isPrime (int num) {
        if (num == 2) {
            return true
        }
        for (int i=2;i<Math.sqrt(num)+1;i++) {
            if (num%i == 0) {
                return false
            }
        }
        return true
    }

}