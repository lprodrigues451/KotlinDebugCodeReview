package src.menu

import src.estoque.Estoque
import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(estoque: Estoque) {

        println("O que deseja fazer?")
        println("1 - Cadastrar novo item")
        println("2 - Ver lista de itens disponíveis para compra")
        println("3 - Dar baixa em um item")
        println("4 - Sair do programa")

        //TODO:deixar sem o try/catch para avaliar se a galera percebe que dá problema de entrada de dado se for string
        val opcao = readln().toInt()
    try {
        when (opcao) {
            1 -> {
                estoque.registrarItem()
                menuPrincipal(estoque)
            }
            2 -> {
                estoque.listarItens()
                menuPrincipal(estoque)
            }
            3 -> {
                estoque.darBaixaItem()
                menuPrincipal(estoque)
            }

            4 -> exitProcess(0)
            else -> {
                println("Opção inválida, tente novamente")
                menuPrincipal(estoque);
            }
        }

    } catch (exception: Exception){
        exception.message
    } finally {
        println("Opção invalida")
        menuPrincipal(estoque)
    }
    }
}