class FlattenArray {
    static List flatten(List l) {
        def output = []
        for (def item in l) {
            if (item != null) {
                if (item instanceof List) {
                    output += flatten(item)
                } else {
                    output += item
                }
            }
        }
        return output
    }
}
