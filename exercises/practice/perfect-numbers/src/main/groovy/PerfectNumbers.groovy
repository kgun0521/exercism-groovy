class PerfectNumbers {

    static Classification classify(int num) {
        if (num == 0) {
            throw new ArithmeticException()
        }
        def sum = (1..<num).findAll {
            num%it == 0
        }.sum()
        if (sum < num){
            return Classification.DEFICIENT
        } else if (sum > num) {
            return Classification.ABUNDANT
        } else {
            return Classification.PERFECT
        }
    }
}