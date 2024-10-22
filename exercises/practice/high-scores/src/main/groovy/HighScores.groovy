class HighScores {

    List scores

    HighScores(scores) {
        this.scores = scores
    }

    def latest() {
        return scores[-1]
    }

    def personalBest() {
        return scores.max()
    }

    def personalTopThree() {
        return scores.sort(false){-it}.take(3)
    }
}