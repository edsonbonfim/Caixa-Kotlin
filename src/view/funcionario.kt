package view

import controller.FuncionarioController

fun main()
{
    var cpf: String
    var senha: String
    var nome : String

    println("Login Funcionario")

    do
    {
        print("CPF: ")
        cpf = readLine()!!.toString()

        print("Senha: ")
        senha = readLine()!!.toString()

        if (FuncionarioController.loginFuncionario(cpf, senha))
            break

        println("Usuario nao cadastrado.")

    } while (true)

    do
    {
        println("1. Cadastrar cliente")
        println("2. Remover cliente")
        println("3. Listar cliente")
        println("4. Sair")

        when (readLine()!!.toInt())
        {
            1 -> {
                print("Nome: ")
                nome = readLine()!!.toString()

                print("CPF: ")
                cpf = readLine()!!.toString()

                print("Senha: ")
                senha = readLine()!!.toString()

                FuncionarioController.cadastrarCliente(nome, cpf, senha)
            }

            2 -> {
                print("CPF: ")
                cpf = readLine()!!.toString()

                FuncionarioController.removerCliente(cpf)
            }

            3 -> FuncionarioController.listarCliente()

            4 -> return
        }

    } while (true)
}