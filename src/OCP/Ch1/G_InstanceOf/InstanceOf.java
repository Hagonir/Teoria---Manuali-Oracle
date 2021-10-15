package Ch1.G_InstanceOf;

public class InstanceOf implements Comparable{

    /*
     * INSTANCEOF
     * instanceof è un operatore binario utilizzato per verificare l'esistenza di una
     * relazione di dipendenza tra una classe ed un altra. Restituisce un valore booleano
     * in base all'esito del confronto. E' possibile verificare che un oggetto sia
     * un'istanza di una classe oppure che una classe ne estenda (direttamente o
     * indirettamente) un altra. E' inoltre possibile utilizzare instanceof per verificare
     * se una classe implementa una determinata interfaccia.
     */

    public static void main(String[] args) {
        InstanceOf test = new InstanceOf();//               <--- Creo un nuovo oggetto
        System.out.println(test instanceof InstanceOf);//   <--- Verifico che l'oggetto sia stato
                                                                //istanziato da questa classe
        System.out.println(test instanceof Object);//       <--- Verifico che l'oggetto derivi
                                                                //da Object: stampa true.
        System.out.println(test instanceof Comparable);//   <--- Verifico che l'oggetto implementi
                                                                //quella interfaccia
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
