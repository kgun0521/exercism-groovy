class RotationalCipher {
    private int key

    RotationalCipher(int key) {
        this.key = key
    }

    String rotate(String cipherText) {
        cipherText.collect {
            def c = it as char
            def base = c.isUpperCase() ? 'A' as char : 'a' as char
            return  c.isLetter()? ((c-base+key)%26 + base) as char : c
        }.join()
    }
}
