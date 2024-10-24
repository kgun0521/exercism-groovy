class Queen {
    int row
    int column
    Queen(int row, int column) {
        this.setRow(row)
        this.setColumn(column)
    }

    def setRow(row) {
        if (row > 7 || row < 0) {
            throw new Exception()
        }
        this.row = row
    }

    def setColumn(column) {
        if (column > 7 || column < 0) {
            throw new Exception()
        }
        this.column = column
    }

}
