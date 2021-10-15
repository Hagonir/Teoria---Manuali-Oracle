package Ch1.B_Overload;

public class Overload {

    /*
     * OVERLOAD
     * L'Overload è una tecnica che consente di definire più costruttori o metodi
     * aventi lo stesso nome ma parametri differenti (numero, tipo o ordine).
     * E' possibile fare l'overload di un metodo ereditato, attenzione a non
     * confonderlo con l'override, in cui i parametri sono gli stessi.
     * I metodi sovraccaricati possono differire nel tipo di ritorno.
     * Il compilatore, con i parametri:
     * 1 - Cerca la corrispondenza di tipo esatta
     * 2 - Cerca la corrispondenza di tipo con una superclasse
     * 3 - Converte il parametro in un tipo primitivo più grande
     * 4 - Converte il parametro in un tipo Autoboxato
     * 5 - Utilizza un eventuale varargs
     */

    //NB. Il nome del costruttore deve essere lo stesso della classe
    public Overload(){
        System.out.println("Costruttore vuoto");
    }
    public Overload(int valore1){
        System.out.println("Costruttore valore intero: " + valore1);
    }
    public Overload(String stringa1){
        System.out.println("Costruttore valore stringa: " + stringa1);
    }
    public Overload(int valore1, String stringa1){
        System.out.println("Costruttore valore intero + stringa: " + valore1 + " " + stringa1);
    }
    //NB. Attenzione alla posizione dei parametri
    public Overload(String stringa1, int valore1){
        System.out.println("Costruttore valore stringa + intero: " + stringa1 + " " + valore1);
    }

    public Overload(Object oggetto){
        System.out.println("Costruttore oggetto");
    }


    public static void main(String[] args) {
        //OVERLOAD COSTRUTTORE
        Overload test1 = new Overload();
        Overload test2 = new Overload(12);
        Overload test3 = new Overload("prova costruttore");
        Overload test4 = new Overload("prova costruttore", 12);
        Overload test5 = new Overload(12, "prova costruttore");
        /*
         * Il compilatore eseguirà automaticamente l'AUTOBOXING dei valori, utilizzando
         * il costruttore corretto. Nel caso in cui al costruttore venga passato un oggetto,
         * verrà eseguito, se possibile, il costruttore con il tipo di parametro più vicino
         * a quello dell'oggetto passato. Se non fosse presente, verrà utilizzato un costruttore
         * avente come parametro una superclasse dell'oggetto passato (se presente).
         */

        Overload test6 = new Overload((Integer) 12);

        /*
         * In questo ultimo caso ho tentato di passare un oggetto (grazie al casting)
         * al costruttore. Non è però presente alcun costruttore che si aspetti un oggetto Integer
         * (NB. Integer -> oggetto, classe wrapper di int). Esiste un costruttore che attende un
         * oggetto Object, dunque Integer viene AUTOBOXATO ad Object.
         * NB. Anche String è un oggetto, ma avendo il costruttore che si aspetta esattamente una
         * String, viene utilizzato quello.
         */

        //OVERLOAD METODI
        metodo1();
        metodo1(9);
        metodo1("prova metodo");
        metodo1(9, "prova metodo");
        metodo1("prova metodo", 9);
        metodo1((Integer) 9);
    }

    public static void metodo1(){
        System.out.println("Metodo vuoto");
    }
    public static int metodo1(int valore1){
        System.out.println("Metodo valore intero: " + valore1);
        return 0;
    }
    public static String metodo1(String stringa1){
        System.out.println("Metodo valore stringa: " + stringa1);
        return "";
    }
    public static boolean metodo1(int valore1, String stringa1){
        System.out.println("Metodo valore intero + stringa: " + valore1 + " " + stringa1);
        return false;
    }
    //NB. Attenzione alla posizione dei parametri
    public static void metodo1(String stringa1, int valore1){
        System.out.println("Metodo valore stringa + intero: " + stringa1 + " " + valore1);
    }
    public static void metodo1(Object oggetto){
        System.out.println("Metodo oggetto");
    }
}
