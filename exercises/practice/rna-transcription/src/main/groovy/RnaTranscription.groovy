class RnaTranscription {

    static String toRna(String strand) {
        strand.collect {
            switch (it){
                case 'G':
                    return 'C'
                    break
                case 'C':
                    return 'G'
                    break
                case 'T':
                    return 'A'
                    break
                case 'A':
                    return 'U'
                    break
            }
        }.join()
    }
}
