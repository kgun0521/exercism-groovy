class Pangram {

    static boolean isPangram(String sentence) {
        return ('a'..'z').every {
            sentence.toLowerCase().contains(it)
        }
    }

}