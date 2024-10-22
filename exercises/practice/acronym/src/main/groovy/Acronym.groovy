class Acronym {

    static String abbreviate(String phrase) {
        return phrase.replace("_", "")
        .split(/[\s\-]/)
        .findAll {it.length() > 0}
        .collect {it[0]}
        .join("")
        .toUpperCase()
    }
}