package model

import java.sql.Connection
import java.sql.DriverManager
import java.sql.SQLException
import java.util.*

class Conexao{

    companion object
    {
        private var connectionProps = Properties()
        var conn : Connection? = null


        fun abrir() : Connection?
        {
            connectionProps.put("user", "root")
            connectionProps.put("password", "")

            try
            {
                Class.forName("com.mysql.jdbc.Driver")

                conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", connectionProps)
                return conn
            }
            catch (err : SQLException)
            {
                err.printStackTrace()
                return null
            }
        }

        fun fechar()
        {
            conn!!.close()
        }

    }



}