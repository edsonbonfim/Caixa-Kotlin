package view

import controller.GerenteController

fun main()
{
    var cpf: String
    var senha: String

    println("Login Gerente\n")

    do {
        print("CPF: ")
        cpf = readLine()!!.toString()

        print("Senha: ")
        senha = readLine()!!.toString()

        if (GerenteController.loginGerente(cpf, senha)) {
            break
        }

        println("Usuário não encontrado.")
    } while (true)

    do
    {
        println("1. Cadastrar Funcionário")
        println("2. Remover Funcionario")
        println("3. Listar Funcionarios")
        println("4. Sair")

        when(readLine()!!.toInt()) {

            1 -> {

                print("Nome: ")
                val nome = readLine()!!.toString()

                print("CPF: ")
                cpf = readLine()!!.toString()

                print("Senha: ")
                senha = readLine()!!.toString()

                GerenteController.cadastrarFuncionario(nome, cpf, senha)
            }

            2 -> {

                print("CPF: ")
                cpf = readLine()!!.toString()

                GerenteController.removerFuncionario(cpf)
            }

            3 -> GerenteController.listarFuncionarios()

            4 -> return
        }
    } while (true)
}
