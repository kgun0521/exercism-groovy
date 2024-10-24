class PascalsTriangle {

    static rows(count) {
        def triangle = []
        for (def i=1; i<=count; i++) {
            def innerList = []
            for (def j=1; j<=i; j++) {
                if (i == 1 || j==1 || j==i) {
                    innerList.add(1)
                } else {
                    innerList.add(triangle[i-2][j-2] + triangle[i-2][j-1])
                }
            }
            triangle.add(innerList)
        }
        return triangle
    }
}
