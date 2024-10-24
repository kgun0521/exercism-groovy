class Matrix {
    def matrix
    Matrix(String asString) {
        this.matrix = []
        asString.eachLine {
            this.matrix.add(it.split(" ").collect{it.toInteger()})
        }
    }

    int[] row(int rowNumber) {
        return this.matrix[rowNumber]
    }

    int[] column(int columnNumber) {
        return matrix.collect {
            it[columnNumber]
        }
    }
}
