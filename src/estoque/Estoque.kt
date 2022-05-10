package src.estoque

import src.item.Item
import java.math.BigDecimal

class Estoque {
    private val listaItem: ArrayList<Item> = ArrayList()

    fun registrarItem() {
        println("Digite o código do produto: ")
        var codigo1 = readln().toInt()
        verificarItemRepetido(codigo1)
        println("Digite o nome do produto: ")
        var nomeItem = readln()
        println("Digite o preco do produto: ")
        var preco = readln().toBigDecimal()
        var item = Item(codigo = codigo1, nome = nomeItem, preco = preco)
        listaItem.add(item)
        println("Item registrado com sucesso\n")

    }

    fun verificarItemRepetido(codigo1:Int) {
        listaItem.forEachIndexed(){index, item1 ->
            if(codigo1==listaItem[index].codigo){
                println("Produdo ja cadastrado")
                registrarItem()
            }
        }

    }

    fun listarItens() {
        if (listaItem.isEmpty()) {
            println("Não temos nenhum item cadastrado no momento")
        } else {
            println("Atualmente temos os seguintes itens: $listaItem");
        }
    }
    fun darBaixaItem() {
        print("Qual o código do item a dar baixa? ")
        val codigoItemADarBaixa = readln().toInt()
        for (item in listaItem) {
            if (codigoItemADarBaixa == item.codigo) {
                listaItem.remove(item)
                println("Item removido com sucesso")
                break
            } else {
                println("Codigo não encontrado")
            }
        }
    }
}