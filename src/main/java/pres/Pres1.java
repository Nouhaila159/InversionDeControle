package pres;

import dao.DaoImpl;
import dao.DaoImplV2;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 dao = new DaoImplV2(); //Instanciation statique
        MetierImpl metier = new MetierImpl(dao); //Injection via le constructeur
        //metier.setDao(dao);  // Injection des dépendances
        System.out.println("Res :"+metier.calcul());
    }
}


