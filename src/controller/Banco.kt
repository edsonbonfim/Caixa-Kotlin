package controller

import model.Cliente
import model.ContaBancaria
import model.Funcionario

class Banco
{
    companion object {

        val clientes : HashMap<String, Cliente> = HashMap()
        private val funcionarios : HashMap<String, Funcionario> = HashMap()

        fun loginFuncionario(senha : String, cpf : String) : Funcionario?
        {
            val funcionario : Funcionario? = funcionarios[cpf]

            if (funcionario!!.senha == senha)
                return funcionario

            return null
        }

        fun loginCliente(cpf: String, senha : String) : Cliente?
        {
            val cliente : Cliente? = clientes[cpf]

            if (cliente!!.senha == senha)
                return cliente

            return null
        }

        fun pesquisarConta(nConta : Int, cliente : Cliente) : ContaBancaria?
        {
            return cliente.contas[nConta]
        }

    }
}
