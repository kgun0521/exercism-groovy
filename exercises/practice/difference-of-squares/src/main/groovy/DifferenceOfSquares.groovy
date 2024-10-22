class DifferenceOfSquares {

    private int num

    DifferenceOfSquares(num) {
       this.num = num
    }

    def squareOfSum() {
        return (1..num).sum()**2
    }

    def sumOfSquares() {
        return (1..num).collect {it**2}.sum()
    }

    def difference() {
        return squareOfSum() - sumOfSquares()
    }

}
