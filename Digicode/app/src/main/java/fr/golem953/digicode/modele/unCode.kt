package fr.golem953.digicode.modele

import android.util.Log


class unCode() {

    fun codeEnFcntDate(_date: String?): String {

        var code: String = "0000"

        if(_date != "null"){

            Log.i("la Date chosis", "$_date")
            code = "1781"
        }else{

            Log.i("la Date chosis", "pas de date")
        }

        return code

    }

}