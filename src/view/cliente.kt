package view

import model.Query

fun main()
{
    val result = Query.select("SELECT * FROM cliente;")

    result!!.next()

    println(result.getString("nome"))
}
