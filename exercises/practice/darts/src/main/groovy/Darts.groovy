class Darts {

    static int score(x, y) {
        def distance = Math.sqrt(x**2 + y**2)
        def score = 10
        if (distance > 10) {
            score = 0
        } else if (distance > 5) {
            score = 1
        } else if (distance > 1) {
            score = 5
        }
        return score
    }
}