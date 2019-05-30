package model

class Cliente (nome : String, senha : String, cpf: String) : Pessoa(nome, senha, cpf)
{
    var contas : HashMap<Int, ContaBancaria> = HashMap()

    fun addConta(conta : ContaBancaria)
    {
        this.contas.put(conta.nConta, conta)
    }

    fun removeConta (nConta : Int)
    {
        this.contas.remove(nConta)
    }
}