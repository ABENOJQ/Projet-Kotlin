package fr.golem953.digicode.modele.Serializer

import android.content.Context
import outils.Serializer

private val nomFichier = "saveDate"

abstract class DateSerializer {
    companion object Factory {
        fun enregistrerDate(laDate: String, context: Context){

            Serializer.serialize(nomFichier, laDate, context)
        }

        fun recupererDate(context: Context): String?{

            return Serializer.deSerialize(nomFichier, context) as String?


        }

    }

}