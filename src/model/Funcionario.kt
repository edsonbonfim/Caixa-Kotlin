package model

open class Funcionario (nome : String, cpf : String, var senha : String) : Pessoa(nome, cpf)
{
    companion object
    {
        fun loginFuncionario(cpf: String, senha: String) : Funcionario?
        {
            val result = Query.select("SELECT * FROM funcionario WHERE " +
                    "cpf = '$cpf' AND senha = '$senha';") ?: return null

            if (result.next())
                return Funcionario(
                    result.getString("nome"),
                    result.getString("cpf"),
                    result.getString("senha")
                )

            return null
        }
    }

    fun cadastrarCliente(cliente: Cliente)
    {
        Query.query("INSERT INTO cliente (nome, cpf) VALUES" +
                " ('${cliente.nome}', '${cliente.cpf}')")
    }

    fun removerCliente(cpf: String)
    {
        Query.query("DELETE FROM cliente WHERE cpf = '$cpf'")
    }

    fun listarCliente()
    {
        val result = Query.select("SELECT nome, cpf FROM cliente;")

        while (result!!.next())
        {
            println("Nome: ${result.getString("nome")}" +
                    "\nCPF: ${result.getString("cpf")}\n")
        }
    }
}