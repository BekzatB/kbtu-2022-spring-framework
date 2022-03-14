package com.example.sis_1

import java.io.IOException
import java.net.URISyntaxException
import java.nio.file.Files
import java.nio.file.Paths

object FileApp {
    @JvmStatic
    fun main(args: Array<String>) {
        val fileName = ""
        try {
            val file = FileApp::class.java.getResource(fileName)
            val uri = file.toURI()
            val path = Paths.get(uri)
            val reader = Files.newBufferedReader(path)
            while (true) {
                val line = reader.readLine() ?: break
                val items = line.split(",".toRegex()).toTypedArray()
                //  -- to be fixed in lab --
//        MealOrder mealOrder = new MealOrder(items[0], items[1]);
//        mealOrder.display();
            }
        } catch (e: URISyntaxException) {
            e.printStackTrace()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }
}
