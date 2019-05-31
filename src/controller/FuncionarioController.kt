package controller

import model.Cliente
import model.Funcionario

class FuncionarioController
{
    companion object
    {
        var funcionario : Funcionario? = null

        fun loginFuncionario(cpf: String, senha: String) : Boolean
        {
            funcionario = Funcionario.loginFuncionario(cpf, senha)

            if (funcionario == null)
                return false

            return true
        }

        fun cadastrarCliente(nome: String, cpf: String, senha: String)
        {
            funcionario!!.cadastrarCliente(Cliente(nome, cpf, senha))
        }

        fun removerCliente(cpf: String)
        {
            funcionario!!.removerCliente(cpf)
        }

        fun listarCliente()
        {
            funcionario!!.listarCliente()
        }
    }
}