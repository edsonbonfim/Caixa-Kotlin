package controller

import model.*

class GerenteController
{
    companion object {

        var gerente : Gerente? = null

        fun loginGerente(cpf: String, senha: String) : Boolean
        {
            gerente = Gerente.loginGerente(cpf, senha)

            if (gerente == null)
                return false

            return true
        }

        fun cadastrarFuncionario(nome: String, cpf: String, senha: String)
        {
            gerente!!.cadastrarFuncionario(Funcionario(nome, cpf, senha))
        }

        fun removerFuncionario(cpf: String)
        {
            gerente!!.removerFuncionario(cpf)
        }

        fun listarFuncionarios()
        {
            Gerente.listarFuncionarios()
        }
    }
}
