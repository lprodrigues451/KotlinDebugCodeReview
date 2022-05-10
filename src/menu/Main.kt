package src.menu

import src.estoque.Estoque

fun main() {
    val menu: Menu = Menu()
    val estoque: Estoque= Estoque()
    menu.menuPrincipal(estoque)
}