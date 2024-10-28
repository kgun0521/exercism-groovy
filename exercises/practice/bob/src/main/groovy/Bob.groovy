class Bob {
    static response(String input) {
        input = input.strip()
        if (input.endsWith("?") && input.toUpperCase() == input && input.toLowerCase() != input){
            return "Calm down, I know what I'm doing!"
        } else if (input.endsWith("?")){
            return "Sure."
        } else if (input.length() == 0) {
            return "Fine. Be that way!"
        } else if (input.toUpperCase() == input && input.toLowerCase() != input) {
            return "Whoa, chill out!"
        } else {
            return "Whatever."
        }
    }
}