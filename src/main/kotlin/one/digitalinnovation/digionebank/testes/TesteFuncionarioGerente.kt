package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val dexter = Gerente("Dexter", "666-666", 8000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(dexter)

    TesteAutenticacao().autentica(dexter)
}

