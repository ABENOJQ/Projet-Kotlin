package fr.golem953.digicode.controleur

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import fr.golem953.digicode.R
import fr.golem953.digicode.modele.unCode

class codeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code)

        val txtCode = findViewById<TextView>(R.id.txtViewCodeDonne)
        val btRetour = findViewById<Button>(R.id.btRetour_code)

        val bundle =intent.extras

        val dateChoisis = bundle?.getString("dateChoisis").toString()?:null

        Log.i("la Date Choisis ", "$dateChoisis")

        val leCodeDate = unCode()

        val code = leCodeDate.codeEnFcntDate(dateChoisis)

        txtCode.text = code

        btRetour.setOnClickListener(){
            val  intention = Intent(this,DateCodeActivity::class.java)
            startActivity(intention)
            finish()


        }

    }
}