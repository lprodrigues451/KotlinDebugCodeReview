package src.estoque

import src.item.Item
import java.math.BigDecimal

class Estoque {
    private val listaItem: ArrayList<Item> = ArrayList()
    var codigo1 : Int = 0
    var nomeItem: String = ""
    var preco: BigDecimal= BigDecimal.ZERO
    var item = Item(codigo = codigo1, nome = nomeItem, preco = preco)

    fun registrarItem() {
        println("Digite o código do produto: ")
        codigo1 = readln().toInt()
            println("Digite o nome do produto: ")
            nomeItem = readln()
            println("Digite o preco do produto: ")
            preco = readln().toBigDecimal()
            verificarItemRepetido()
    }

    fun verificarItemRepetido() {
        if(item.codigo== codigo1){
           println("Produdo ja cadastrado")
            registrarItem()
        }
        else{
            item = Item(codigo = codigo1, nome = nomeItem, preco = preco)
            listaItem.add(item)
            println("Item registrado com sucesso\n")
        }
    }

    fun listarItens() {
        if (listaItem.isEmpty()) {
            println("Não temos nenhum item cadastrado no momento")
        } else {
            println("Atualmente temos os seguintes itens: ${listaItem}");
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