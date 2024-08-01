package fr.golem953.digicode.controleur

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import fr.golem953.digicode.R
import fr.golem953.digicode.repository.UtilisateurSerializer
import fr.golem953.digicode.modele.Authentification

class ConnectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connection)

        val txtID = findViewById<TextView>(R.id.editText_id)
        val iDRepository = UtilisateurSerializer.recupererUtilisateur(this)?.get(0)
        txtID.text = iDRepository?:""

        val txtMDP = findViewById<TextView>(R.id.editText_password)

        val mdPRepository = UtilisateurSerializer.recupererUtilisateur(this)?.get(1)
        txtMDP.text = mdPRepository?:""


        val btValider = findViewById<Button>(R.id.btValider_connection)
        val checkBox = findViewById<CheckBox>(R.id.checkBoxConnection)

        var utilisateur: Array<String>


        val bundle =intent.extras

        val authent = Authentification()

       btValider.setOnClickListener(){

           utilisateur= arrayOf(txtID.text.toString(),txtMDP.text.toString())
           Toast.makeText(this.applicationContext,
               "${txtID.text} + ${txtMDP.text}",
               Toast.LENGTH_LONG
           ).show()

           var ident = txtID.text.toString()





            val ok:String = authent.verifUtilisateur(txtID.text.toString(),txtMDP.text.toString())

           if(checkBox.isChecked){
               UtilisateurSerializer.enregistrerUtilisateur(utilisateur,this)
           }else{
               UtilisateurSerializer.enregistrerUtilisateur(null,this)
           }

           if (ok == "true"){
                Toast.makeText(this.applicationContext,
                    "success ",
                    Toast.LENGTH_LONG
                ).show()

               val  intention = Intent(this,DateCodeActivity::class.java)
               intention.putExtra("identifiant",ident)
               startActivity(intention)
               finish()
            }else{
                Toast.makeText(this.applicationContext,
                    "$ok",
                    Toast.LENGTH_LONG
                ).show()

            }


        }}
}