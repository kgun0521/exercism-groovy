class PrimeFactors {

    static factors(value) {
        if (value == 1) {
            return []
        }
        long val = value
        long i = 2
        def factorsVals = []
        while (true) {
            if (val%i == 0) {
                factorsVals.add(i)
                val /= i
                factorsVals = factorsVals.plus(factors(val))
                break
            }
            i++
        }
        return factorsVals
    }
}