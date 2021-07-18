package one.digitalinnovation.digionebank

abstract class Pessoa (
    open val nome: String,
    open val cpf: String
)

/*
class Pessoa {
    var nome: String = "Bruno"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome CPF: $cpf"
}

/*
fun main() {
    val bruno = Pessoa()

    println("Nome: " + bruno.nome)
    println("CPF: " + bruno.cpf)
    println(bruno.pessoaInfo())
}
 */

 */