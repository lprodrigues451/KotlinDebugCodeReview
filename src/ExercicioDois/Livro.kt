package src.ExercicioDois

abstract class Livro {
    abstract var tipo : String
    var codigo : Int = 0
    var titulo : String = ""
    var anoLançamento: Int = 0
    var autorLivro: String = ""
    var estoque : Int = 0
}