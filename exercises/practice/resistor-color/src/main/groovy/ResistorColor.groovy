class ResistorColor {
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
    static colorCode(color) {
        return this.colors.indexOf(color)
    }

}
