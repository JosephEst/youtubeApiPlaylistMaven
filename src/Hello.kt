package example

import java.sql.DriverManager
import java.util.*

fun main(args: Array<String>) {
    println("Hello, World")
    val properties = Properties()

    //Populate the properties file with user name and password
    with(properties){
        put("user", "admin")
        put("password", "pw")
    }

    //Open a connection to the database
    DriverManager.getConnection("jdbc:derby:example;create=true", properties).use {
        println("Connected to the DB")
    }

    println("Connection closed")

}

