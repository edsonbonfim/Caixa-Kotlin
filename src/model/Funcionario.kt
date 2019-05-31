package model

open class Funcionario (nome : String, cpf : String, senha : String) : Pessoa(nome, cpf, senha)
{
    fun cadastrarCliente(cliente: Cliente)
    {
        Query.query("INSERT INTO cliente (nome, senha, cpf) VALUES" +
                " ('${cliente.nome}', '${cliente.senha}', '${cliente.cpf}')")
    }

    fun removerCliente(cpf: String)
    {
        Query.query("DELETE FROM cliente WHERE cpf = '$cpf'")
    }
}