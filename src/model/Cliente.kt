package model

class Cliente (nome : String, cpf : String, senha: String) : Pessoa(nome, cpf, senha)
{
    fun addConta(conta : ContaBancaria)
    {
        Query.query("INSERT INTO conta (nConta, nCartao, saldo, tipo)" +
                "VALUES (${conta.nConta} , ${conta.nCartao}, ${conta.saldo}, '${conta.getTipo()}'")
    }

    fun removeConta (nConta : Int)
    {
        Query.query("DELETE FROM conta WHERE nConta = $nConta")
    }
}