package Ch1.H_Equals_HashCode_toString;

public class ToString {

    /*
     * TOSTRING
     * .toString() è un metodo della classe object, di conseguenza viene automaticamente
     * ereditato da tutti gli oggetti. Consente di ottenere una stringa leggibile che
     * descrive il contenuto di un oggetto. Quando tentiamo di stampare la variabile in cui
     * è contenuto il riferimento di un oggetto, otteniamo la stampa di una stringa
     * poco comprensibile contenente il suo hashcode (secondo le direttive del .toString()
     * di Object). E' possibile (e suggerito) sovrascrivere questo metodo, implementando
     * una logica di stampa che realizzi una stringa piu leggibile dall'occhio umano.
     */

    public static void main(String[] args) {
        System.out.println(new ToString());//   <--- Utilizza il metodo toString sovrascritto
        System.out.println(new Object());//     <--- Utilizza il metodo toString originale
    }

    @Override
    public String toString() {
        return "Nuovo toString sovrascritto";
    }
}
