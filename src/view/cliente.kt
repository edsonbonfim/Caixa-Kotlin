package view

import controller.ClienteController
import model.Cliente

fun main()
{
    println("Bem vindo ao Banco\n")

    print("Cartão: ")
    val cartao = readLine()!!.toInt()

    print("Senha: ")
    val senha = readLine()!!.toString()

    if (ClienteController.login())
    {

    }
}
