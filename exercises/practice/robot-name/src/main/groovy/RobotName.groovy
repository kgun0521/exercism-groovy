class RobotName {

    String name
    static def givenNames = []
    def letters = 'A'..'Z'

    RobotName() {
        name = getUniqueName()
    }

    def getUniqueName () {
        def text = generateName()
        while (text in givenNames) {
            text = generateName()
        }
        return text
    }

    def generateName(){
        return letters[getRandomInt()%26] + letters[getRandomInt()%26] + getRandomInt(3).toString()
    }

    def getRandomInt(int size=2) {
        return Math.random()*(10**size) as int
    }

    def reset(){
        this.name = getUniqueName()
    }

}
