package model

class ContaCorrente (saldo : Double, conta : Int, nCartao : Int) : ContaBancaria(saldo, conta, nCartao)
{
    override fun aplicarJuros()
    {
        super.saldo += super.saldo * 0.02
    }
}