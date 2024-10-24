class ProteinTranslation {

    static proteins(String strand) {
        def proteins = []
        def match = strand =~ /[A-Z][A-Z][A-Z]/
        for (item in match){
            switch (item) {
                case "AUG":
                    proteins.add("Methionine")
                    break
                case "UUC":
                case "UUU":
                    proteins.add("Phenylalanine")
                    break
                case "UUA":
                case "UUG":
                    proteins.add("Leucine")
                    break
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    proteins.add("Serine")
                    break
                case "UAU":
                case "UAC":
                    proteins.add("Tyrosine")
                    break
                case "UGU":
                case "UGC":
                    proteins.add("Cysteine")
                    break
                case "UGG":
                    proteins.add("Tryptophan")
                    break
                case "UAA":
                case "UAG":
                case "UGA":
                    return proteins
            }
        }
        return proteins
    }

    def x = [].collate()
}