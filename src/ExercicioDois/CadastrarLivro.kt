package src.ExercicioDois

class CadastrarLivro: Livro() {
    override var tipo: String
        get() = "Livro"
        set(value) {}

    fun informaOsDados() : MutableList<Livro> {
        val listaDeModa = mutableListOf<Livro>()

        println("Informe a título do $tipo:")
        titulo = readln()
        println("Informe o autor do $tipo:")
        autorLivro = readln()
        println("Informe o ano do $tipo:")
        anoLançamento = readln().toInt()
        println("Informe o ano do $tipo:")
        estoque = readln().toInt()

        val cadastrarLivro = CadastrarLivro()
        cadastrarLivro.titulo = titulo
        cadastrarLivro.autorLivro = autorLivro
        cadastrarLivro.anoLançamento = anoLançamento
        cadastrarLivro.estoque = estoque
        listaDeModa.add(cadastrarLivro)
        return listaDeModa

    }
}