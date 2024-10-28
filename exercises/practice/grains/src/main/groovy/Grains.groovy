class Grains {
    static square(num) {
        if (num <= 0 || num > 64) {
            throw new ArithmeticException()
        }
        return 2**(num-1)
    }

    static total() {
        return (1..64).collect {2**(it-1)}.sum()
    }
}
