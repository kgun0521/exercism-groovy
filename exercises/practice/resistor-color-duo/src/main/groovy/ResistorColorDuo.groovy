class ResistorColorDuo {
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
    static int value(List<String> colorsInput) {
        return colorsInput[0..1].collect {
            colors.indexOf(it)
        }.join().toInteger()
    }
}