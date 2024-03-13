package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args){
        //instanciation statique
        DaoImpl dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Résultat="+metier.calcul());
    }
}
