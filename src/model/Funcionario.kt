package model

import controller.Banco

class Funcionario (nome : String, senha : String, cpf : String) : Pessoa(nome, senha, cpf)
{
    fun cadastrarCliente(nome: String, senha: String, cpf : String)
    {
        Banco.clientes.put(cpf, Cliente(nome, senha, cpf))
    }

    fun removerCliente(cpf: String)
    {
        Banco.clientes.remove(cpf)
    }
}