package com.dk.matchcase

object OptionMatch {
    def main(args: Array[String]): Unit = {
        val capitals = Map("FRANCE"->"PARIS","KOERA"->"SEOUL")

        println("show(capitals.get(\"KOERA\")):"+show(capitals.get("KOERA")))
        println("show(capitals.get(\"INDIA\")):"+show(capitals.get("INDIA")))
    }

    def show(x:Option[String]) = x match {
        case Some(s) => s
        case None => "Nothing"
    }

}
