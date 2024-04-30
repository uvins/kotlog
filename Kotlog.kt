package org.example

import java.text.SimpleDateFormat
import java.util.*

class Jalog {
    // Colors
    private var ansiReset = "\u001B[0m"
    private var ansiRed = "\u001B[31m"
    private var ansiGreen = "\u001B[32m"
    var ansiYellow = "\u001B[33m"
    var ansiBlue = "\u001B[34m"

    private var date = Date()

    // Data format, USA or EURO
    private var usaFormat = true

    fun euroFormat(euroFormat: Boolean) {
        usaFormat = !euroFormat
    }

    fun info(msg: String) {
        // Format check
        val formater: SimpleDateFormat = if (usaFormat) {
            SimpleDateFormat("MM.dd HH:mm:ss")
        } else {
            SimpleDateFormat("dd.MM HH:mm:ss")
        }

        val result = ansiGreen + "[INFO | ${formater.format(date)}] $msg" + ansiReset

        println(result)
    }

    fun warn(msg: String) {
        // Format check
        val formater: SimpleDateFormat = if (usaFormat) {
            SimpleDateFormat("MM.dd HH:mm:ss")
        } else {
            SimpleDateFormat("dd.MM HH:mm:ss")
        }

        val result = ansiYellow + "[WARN | ${formater.format(date)}] $msg" + ansiYellow

        println(result)
    }

    fun error(msg: String) {
        // Format check
        val formater: SimpleDateFormat = if (usaFormat) {
            SimpleDateFormat("MM.dd HH:mm:ss")
        } else {
            SimpleDateFormat("dd.MM HH:mm:ss")
        }

        val result = ansiRed + "[ERROR | ${formater.format(date)}] $msg" + ansiReset

        println(result)
    }

    fun custom(option: String, msg: String) {
        // Format check
        val formater: SimpleDateFormat = if (usaFormat) {
            SimpleDateFormat("MM.dd HH:mm:ss")
        } else {
            SimpleDateFormat("dd.MM HH:mm:ss")
        }

        val result = ansiBlue + "[${option} | ${formater.format(date)}] $msg" + ansiReset

        println(result)
    }
}
