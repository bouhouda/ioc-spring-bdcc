package pres;


import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();//instanciation statique
      MetierImpl metier =new MetierImpl(d);//injection via le constructeur
        metier.setDao(d);//injection des dependances
        System.out.println("RES="+ metier.calcul());
    }
}
