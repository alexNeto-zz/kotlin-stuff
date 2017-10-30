fun transcribeToRna(dna: String): String {
    var rna = dna.replace('G', 'c')
    rna = rna.replace('C', 'g')
    rna = rna.replace('T', 'a')
    rna = rna.replace('A', 'u')
    return rna.toUpperCase()
}