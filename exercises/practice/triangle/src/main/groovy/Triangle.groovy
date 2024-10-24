class Triangle {
    float a, b, c
    Triangle(a, b, c) {
            this.a = a
            this.b = b
            this.c = c
    }

    boolean isTriangle () {
        if (a==0 || b==0 || c==0) {
            return false
        } else if (a+b >= c && b+c>= a && a+c>=b){
            return true
        }
        return false
    }

    boolean isEquilateral() {
        if (isTriangle() && a == b && b == c) {
            return true
        }
        return false
    }

    boolean isIsosceles() {
        if (isTriangle() && (a==b || b==c || a==c)) {
            return true
        }
        return false
    }

    boolean isScalene() {
        if (isTriangle() && a!=b && b!=c && a!=c) {
            return true
        }
        return false
    }

}
