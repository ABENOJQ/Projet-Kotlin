package fr.golem953.digicode.controleur

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import fr.golem953.digicode.R
import fr.golem953.digicode.modele.DateComp
import fr.golem953.digicode.modele.Serializer.DateSerializer
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.regex.Pattern

class DateCodeActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datecode)
        val editDate = findViewById<EditText>(R.id.editDate_code)
        val btValiderDate = findViewById<Button>(R.id.btnValider_code)
        val btDecoDate = findViewById<Button>(R.id.bt_deconnecter_Date)
        val dateRepository = DateSerializer.recupererDate(this)
        editDate.setText(dateRepository?:"")

        val bundle =intent.extras


        btValiderDate.setOnClickListener(){
            val pattern = Pattern.compile("((0[1-9]|[12][0-9]|3[01])[-/](0[1-9]|1[012]))[-/]((19|20)[0-9]{2})")


                val matcher = pattern.matcher(editDate.text.toString())
                val laDate = if (editDate.text.toString() != null){
                                if (matcher.find()){ editDate.text.toString()} else { null}}
                            else{ null}


                val formatDateAjd = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                val dateAjd = LocalDateTime.now().format(formatDateAjd)

            Toast.makeText(this.applicationContext,
                "${dateAjd}",
                Toast.LENGTH_LONG
            ).show()

            val dateValide = if (laDate!= null){DateComp.dateValide(laDate) } else{false}

            Log.i("dateComparaison","$dateValide")

            if (laDate==null || !dateValide){
                Toast.makeText(this.applicationContext,
                    "Reecrivez la date",
                    Toast.LENGTH_LONG
                ).show()

                Log.i("la Date ", "null")
            } else{
                Toast.makeText(this.applicationContext,
                    "success $laDate ",
                    Toast.LENGTH_LONG
                ).show()
                Log.i("la Date ", laDate)

                DateSerializer.enregistrerDate(laDate,this)

                val  intention = Intent(this,codeActivity::class.java)
                intention.putExtra("dateChoisis", laDate)
                startActivity(intention)
                finish()
            }

        }
        btDecoDate.setOnClickListener(){

            val  intention = Intent(this,ConnectionActivity::class.java)
            startActivity(intention)
            finish()
        }




    }
}