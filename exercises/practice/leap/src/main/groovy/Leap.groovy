class Leap {
    int year
    Leap(Integer year) {
        this.year = year
    }

    def isLeapYear() {
        if (year%100 == 0) {
            if (year%400 == 0) {
                return true
            }
        } else if (year%4 == 0) {
            return true
        }
        return false
    }

}
