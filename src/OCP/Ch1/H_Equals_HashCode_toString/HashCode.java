package Ch1.H_Equals_HashCode_toString;

public class HashCode {

    /*
     * HASHCODE
     * Un hashcode è un valore numerico intero generato da un algoritmo, utilizzato come
     * chiave di una mappa quando si memorizza un oggetto. Utilizzando il metodo
     * .hascode() su un attributo, si ottiene sempre lo stesso valore, a meno che l'attributo
     * non cambi.
     * Ogni qualvolta che il metodo .equals() viene sovrascritto, anche il metodo .hashcode()
     * andrebbe modificato.
     */
    public static void main(String[] args) {
        String test = "prova";

        //Verificando l'hashcode del valore notiamo che sono uguali
        System.out.println(test.hashCode());
        System.out.println("prova".hashCode());

        //Modificando il valore ne modifichiamo l'hashcode
        System.out.println("prova1".hashCode());

        //Due oggetti differenti, dunque due differenti hashcode
        StringBuilder test1 = new StringBuilder("prova2");
        StringBuilder test2 = new StringBuilder("prova2");
        System.out.println(test1.hashCode());
        System.out.println(test2.hashCode());

        //Ora hanno lo stesso hashcode
        System.out.println(test1.toString().hashCode());
        System.out.println(test2.toString().hashCode());
    }
}
