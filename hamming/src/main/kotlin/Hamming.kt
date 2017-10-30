class Hamming {
    companion object {
        fun compute(dna1: String, dna2: String): Int {
            if (dna1.equals(dna2)) {
                return 0
            }
            var distance: Int = 0
            var arrayDna1: List<String> = dna1.split("")
            var arrayDna2: List<String> = dna2.split("")
            for (i in arrayDna1.indices) {
                if (arrayDna1[i] != arrayDna2[i]) {
                    distance++
                }
            }
            return distance
        }
    }
}
