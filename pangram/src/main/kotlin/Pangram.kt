class Pangram {
    companion object {
        fun isPangram(text: String): Boolean {
            var x = 'a'
            while (x <= 'z') {
                if (x !in text) {
                    return false
                }
                x++
            }
            return true
        }
    }
}