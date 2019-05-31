package model

class Cliente (nome : String, cpf : String) : Pessoa(nome, cpf)
{
    companion object
    {
        fun login(nCartao : Int, senha: Int)
        {
            Query.select("SELECT * FROM cliente, conta" +
                    " WHERE cliente.id_cliente = conta.id_cliente" +
                    " AND conta.nCartao = $nCartao" +
                    " AND conta.senha = $senha")


        }
    }

    fun addConta(conta : ContaBancaria)
    {
        Query.query("INSERT INTO conta (nConta, nCartao, saldo, senha, tipo)" +
                "VALUES (${conta.nConta} , ${conta.nCartao}, ${conta.saldo}, ${conta.senha}, '${conta.getTipo()}'")
    }

    fun removeConta (nConta : Int)
    {
        Query.query("DELETE FROM conta WHERE nConta = $nConta")
    }
}