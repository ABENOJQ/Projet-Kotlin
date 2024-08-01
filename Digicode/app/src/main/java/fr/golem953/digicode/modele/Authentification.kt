package fr.golem953.digicode.modele

import android.util.Log
import fr.golem953.digicode.modele.client.Client
import fr.golem953.digicode.modele.reservation.Reservation
import fr.golem953.digicode.modele.salle.Salle_amphitheatre
import fr.golem953.digicode.modele.salle.Salle_avec_equipement
import fr.golem953.digicode.modele.salle.Salle_reunion

class authentification {

    private var utilValide: List<Client> = listOf(Client("test","test"),Client("admin","admin"))
    private var utila = Client("test","test")
    private val listeSalle: MutableList<Salle_reunion> = ArrayList()





    init {
        listeSalle.add(Salle_reunion(1, "Daum"))
        listeSalle.add(Salle_reunion(2, "Corbin"))
        listeSalle.add(Salle_reunion(3, "Baccarat"))
        listeSalle.add(Salle_reunion(4, "Longwy"))
        listeSalle.add(Salle_avec_equipement(5, "Multimédia"))
        listeSalle.add(Salle_amphitheatre(6, "Amphithéâtre"))
        listeSalle.add(Salle_reunion(7, "Lamour"))
        listeSalle.add(Salle_reunion(8, "Grüber"))
        listeSalle.add(Salle_reunion(9, "Majorelle"))
        listeSalle.add(Salle_avec_equipement(10, "Salle de restauration"))
        listeSalle.add(Salle_reunion(11, "Galerie"))
        listeSalle.add(Salle_avec_equipement(12, "Salle informatique"))
        listeSalle.add(Salle_avec_equipement(13, "Hall d\'accueil"))
        listeSalle.add(Salle_reunion(14, "Gallé"))

    }

    private var lesReservations: List<Reservation> = listOf(Reservation(1, utilValide[0],
        listeSalle[1],"10/02/2025",0))


    fun verifUtilisateur(id :String, mdp :String): String{

        var ok= "Mauvais identifiants"
        var fin = false
        var i = utilValide.listIterator()

        var utilisateur = Client(id,mdp)

        Log.i("id+mdp =","${utila.id} + ${utila.id}  /${utilisateur.id} + ${utilisateur.mdp}")

        var utilTemp:Client?=null

        while (!fin && ok != "true"){

            if (i.hasNext()){
                utilTemp=i.next()
                if (utilTemp.id == utilisateur.id && utilTemp.mdp == utilisateur.mdp) {
                    Log.i("id+mdp =","passe")

                    for (uneReserv in lesReservations){

                        if (uneReserv.unClient.id == utilisateur.id){
                            ok = "true"}
                        else
                        {
                            ok = "Aucune Reservation à ce nom"
                        }
                    }

                }

            }else{
                Log.i("id+mdp =","stop")
                fin = true
            }





        }



        /*if (utila.id == utilisateur.id && utila.mdp == utilisateur.mdp) {
            Log.i("id+mdp =","passe")

            for (uneReserv in lesReservations){

                if (uneReserv.unClient == utilisateur){
                    ok = true}
            }

        }*/

        return ok


    }

}