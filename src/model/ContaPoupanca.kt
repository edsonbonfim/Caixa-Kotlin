package model

class ContaPoupanca (saldo : Double, conta : Int, nCartao : Int) : ContaBancaria(saldo, conta, nCartao)
{
    override fun aplicarJuros()
    {
        super.saldo += super.saldo * 0.1
    }

    override fun getTipo()  : Char = 'P'
}