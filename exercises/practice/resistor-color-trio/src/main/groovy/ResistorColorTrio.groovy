class ResistorColorTrio {
    static def colors = ['black',
                         'brown',
                         'red',
                         'orange',
                         'yellow',
                         'green',
                         'blue',
                         'violet',
                         'grey',
                         'white']
    static String label(List<String> colorsInput) {
        def val = colorsInput[0..1].collect {
            colors.indexOf(it)
        }.join().toInteger() * (10 ** colors.indexOf(colorsInput[2]))
        return val < 1000 ? "$val ohms" : "${val/1000} kiloohms"
    }

}