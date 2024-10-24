class Anagram {

    def subject

    Anagram(subject) {
        this.subject = subject.toLowerCase()
    }

    def isAnagram (word) {
        return (word.toLowerCase().collect().sort() == subject.collect().sort() && word.toLowerCase() != subject)
    }

    def find(candidates) {
        return candidates.findAll {
            isAnagram(it)
        }
    }
}