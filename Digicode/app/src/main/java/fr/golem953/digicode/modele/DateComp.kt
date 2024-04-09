package fr.golem953.digicode.modele

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Integer.parseInt
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateComp {
    companion object {

        @RequiresApi(Build.VERSION_CODES.O)
        fun dateValide(dateAComparer: String):Boolean{
            var ok = false

            val dateAComp = dateAComparer.split("/")
            val formatDateAjd = DateTimeFormatter.ofPattern("dd/MM/yyyy")

            val dateAjd = LocalDateTime.now().format(formatDateAjd).split("/")


            if (parseInt(dateAComp[1]) <= 12 && parseInt(dateAComp[0]) <= 31) {

                if (parseInt(dateAComp[2]) == parseInt(dateAjd[2])) {

                    if (parseInt(dateAComp[1]) == parseInt(dateAjd[1])) {

                        if (parseInt(dateAComp[0]) >= parseInt(dateAjd[0])) {
                            ok = true

                        }

                    } else {
                        if (parseInt(dateAComp[1]) > parseInt(dateAjd[1])) {
                            ok = true
                        }
                    }

                } else {
                    if (parseInt(dateAComp[2]) > parseInt(dateAjd[2])) {
                        ok = true
                    }
                }}



                return ok



        }
    }

}