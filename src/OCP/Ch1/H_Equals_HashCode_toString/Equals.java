package Ch1.H_Equals_HashCode_toString;

public class Equals {

    /*
     * EQUALS
     * .equals() è un metodo della classe object, di conseguenza viene automaticamente
     * ereditato da tutti gli oggetti. Di base, nella classe Object, la sua implementazione
     * è molto semplice: si tratta di una semplice operazione di comfronto ("==").
     * E' però possibile (come avviene nella classe String) sovrascrivere il metodo .equals()
     * per ottenere un confronto più preciso (confrontando ad esempio ogni singolo elemento di
     * un array, o eseguendo dei calcoli).
     */

    public static void main(String[] args) {
        String stringa = "ciao";
        //Utilizzo il metodo .equals() presente nella classe String, che confronta carattere per carattere
        System.out.println("ciao".equals(stringa));

        //Provo ora con l'oggetto StringBuilder, che non ha un metodo .equals()
        StringBuilder stringa1 = new StringBuilder("prova");
        StringBuilder stringa2 = new StringBuilder("prova");

        //utilizzo il metodo .equals() di Object, non essendo presente una versione sovrascritta
        System.out.println(stringa1.equals(stringa2));
        System.out.println(stringa1 == stringa2);

        /*
         * In entrambi i casi precedenti, l'operazione che viene fatta dal compilatore è
         * stringa1 == stringa2, che ritorna sempre false in questo caso, siccome
         * il paragone avviene sui riferimenti (che sono diversi essendo due oggetti
         * distinti) e non sul valore.
         */

        //Volessi confrontare il valore di due StringBuilder li dovrei trasformare prima in stringhe
        System.out.println(stringa1.toString().equals(stringa2.toString()));
    }
}
