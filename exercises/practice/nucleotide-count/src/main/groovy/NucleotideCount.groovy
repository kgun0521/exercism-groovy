class NucleotideCount {
    static def validChars = ['A':0,'C':0,'G':0,'T':0]
    static count(String strand) {
        def total = 0
        validChars.each {
            validChars[it.key] = strand.count(it.key)
            total += strand.count(it.key)
        }
        if (total != strand.length()) {
            throw new Exception()
        }
        return validChars
    }
}