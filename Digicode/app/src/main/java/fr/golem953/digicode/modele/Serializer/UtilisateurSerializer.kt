package fr.golem953.digicode.modele.Serializer

import android.content.Context
import outils.Serializer

private val nomFichier = "saveUtilisateur"

abstract class UtilisateurSerializer {
    companion object Factory {
        fun enregistrerUtilisateur(utilisateur: Array<String>?, context: Context){

            Serializer.serialize(nomFichier, utilisateur, context)
        }

        fun recupererUtilisateur(context: Context): Array<String>?{

            return Serializer.deSerialize(nomFichier, context) as Array<String>?


        }

    }

}