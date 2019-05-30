package model

import java.sql.SQLException

class Query
{
    companion object
    {
        fun executarQuery(query : String)
        {
            val conn = Conexao.abrir()

            try
            {
                val stmt = conn!!.createStatement()
                val resultSet = stmt!!.executeQuery(query)

                println(resultSet)
            }
            catch (err : SQLException)
            {
                err.printStackTrace()
            }

            Conexao.fechar()
        }
    }
}