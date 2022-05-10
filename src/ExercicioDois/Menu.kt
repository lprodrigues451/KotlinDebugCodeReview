package src.ExercicioDois

import src.estoque.Estoque
import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal() {

        println("O que deseja fazer?")
        println("1 - Cadastrar novo item")
        println("2 - Ver Livros que está disponíveis para compra")
        println("3 - Dar baixa em um item")
        println("4 - Sair do programa")


        val opcao = readln().toInt()

        when (opcao) {
            1 -> {

            }
            2 -> {

            }
            3 -> {

            }

            4 -> exitProcess(0)
            else -> {
                println("Opção inválida, tente novamente")
                menuPrincipal();
            }
        }
    }

    fun menuCadastro() {

        println("O que deseja cadastrar?")
        println("1 - livro")
        println("2 - Coleção")
        println("3 - Sair do programa")


        val opcao = readln().toInt()

        when (opcao) {
            1 -> {

            }
            2 -> {

            }
            3 -> exitProcess(0)
            else -> {
                println("Opção inválida, tente novamente")
                menuCadastro();
            }
        }
    }
}