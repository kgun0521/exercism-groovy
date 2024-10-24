class Raindrops {

    def convert(num) {
        def sound = []
        if (num%3 == 0) {
            sound.add("Pling")
        }
        if (num%5 == 0) {
            sound.add("Plang")
        }
        if (num%7 == 0) {
            sound.add("Plong")
        }
        return  sound.size() ? sound.join() : num.toString()
    }

}
