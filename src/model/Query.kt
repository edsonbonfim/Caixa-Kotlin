package model

import java.sql.ResultSet
import java.sql.SQLException
import java.sql.Statement

class Query
{
    companion object
    {


        fun select(query : String) : ResultSet?
        {
            val conn = Conexao.abrir()

            try
            {
                val stmt = conn!!.createStatement()

                return stmt!!.executeQuery(query)
            }
            catch (err : SQLException)
            {
                err.printStackTrace()
            }

            Conexao.fechar()

            return null
        }

        fun query (query: String)
        {
            val conn = Conexao.abrir()

            try
            {
                val stmt : Statement = conn!!.createStatement()

                stmt.executeUpdate(query)

            }
            catch (err : SQLException)
            {
                err.printStackTrace()
            }

            Conexao.fechar()
        }

    }

}