package Ch1.C_Override_Annotation_VirtualMethods;

import java.lang.*;

public class Override {

    /*
     * OVERRIDE
     * L'override è una tecnica che consente di sovrascrivere un metodo avente la stessa
     * firma ("method signature"). Per firma si intende l'insieme di modificatore di accesso,
     * specificatore (se presente), tipo di ritorno, nome del metodo e parametri.
     * 1 - Il modificatore di accesso deve essere lo stesso del metodo sovrascritto
     *      o più accessibile (protected -> public)
     * 2 - Il tipo di ritorno deve essere lo stesso o più restrittivo ("covariant return types")
     * 3 - Se il metodo sovrascritto ha delle eccezzioni, è possibile utilizzare solamente le
     *      stesse eccezzioni o delle sottoclassi di esse.
     * 4 - Il metodo sovrascritto non deve essere static: in caso contrario il metodo viene
     *      nascosto e non sovrascritto.
     */

    @java.lang.Override//               <--- Annotazione
    public String toString() {//        <--- Sovrascrivo un metodo ereditato da Object
        return "Oggetto";
    }

    /*
     * ANNOTATION
     * Una annotazione "@" serve ad indicare al compilatore le tue intenzioni:
     * è utile in caso di errore, siccome comunica in modo più diretto qual'è il problema.
     * Se ad esempio stiamo tentando di sovrascrivere qualcosa che non può essere sovrascritto,
     * oppure se l'errore nella scrittura del codice è solamente di tipo grammaticale.
     */

    @java.lang.Override
    public boolean equals(Object obj) {
        System.out.println("Questo metodo è stato sovrascritto");
        return false;
    }

    public static void main(String[] args) {
        Override test = new Override();
        System.out.println(test);//     <--- visualizzo il tostring sovrascritto
        test.equals(test);//            <--- utilizzo il metodo sovrascritto

        /*
         * L'override viene utilizzato da una sottoclasse per ridefinire i metodi della
         * superclasse. In particolare durante l'utilizzo di classi astratte ed interfacce,
         * in cui non è definita l'implementazione di un metodo, si costringono le sottoclassi
         * a sovrascriverlo.
         */
    }

    /*
     * VIRTUAL METHODS
     * I metodi virtuali sono metodi non statici, non final e non private che hanno quindi
     * la possibilità di venir sovrascritti. Si definiscono virtuali siccome non è possibile
     * stabilire se a runtime verrà eseguito il metodo dichiarato oppure una sua versione
     * sovrascritta da un altra classe.
     */
}
