package model

class Gerente(nome : String, cpf: String, senha: String) : Funcionario(nome, senha, cpf)
{
    companion object
    {
        fun loginGerente(cpf: String, senha: String) : Gerente?
        {
            val result = Query.select("SELECT * FROM funcionario " +
                    "WHERE tipo = 'G' and cpf = '$cpf' and senha = '$senha';") ?: return null

            if (!result.next())
                return null

            return Gerente(
                result.getString("nome"),
                result.getString("cpf"),
                result.getString("senha")
            )
        }

        fun listarFuncionarios()
        {
            val result = Query.select("SELECT nome, cpf FROM funcionario;")

            println("Funcionarios:\n")
            while (result!!.next())
            {
                println("Nome: ${result.getString("nome")}")
                println("CPF: ${result.getString("cpf")}\n")
            }
        }
    }

    fun cadastrarFuncionario(func : Funcionario)
    {
        Query.query("INSERT INTO funcionario (nome, senha, cpf, tipo)" +
                " VALUES ('${func.nome}', '${func.senha}', '${func.cpf}', 'F');")
    }

    fun removerFuncionario(cpf: String)
    {
        Query.query("DELETE FROM funcionario WHERE cpf = '$cpf';")
    }
}