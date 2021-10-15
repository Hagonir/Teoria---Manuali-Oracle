package Ch1.A_ModificatoriAccesso;

public class Modificatori_di_Accesso {

    /*
     * MODIFICATORI DI ACCESSO
     * I modificatori di accesso sono KEYWORDS applicabili ad attributi e metodi della classe.
     * Servono ad indicare l'ambito di visibilità.
     */

    //Un attributo (o metodo) "private" è visibile ed utilizzabile solamente nella classe in cui viene definito.
    private static int valore1 = 1;
    private static void metodo1(){
        System.out.println("metodo " + valore1);
    }

    /*
     * Un attributo (o metodo) "public" è visibile ed utilizzabile nella classe in cui viene definito,
     * nelle classi presenti nello stesso package della classe in cui viene definito
     * e in qualsiasi classe che importa la classe in cui viene definito.
     */
    public static int valore2 = 2;
    public static void metodo2(){
        System.out.println("metodo " + valore2);
    }


    /*
     * Un attributo (o metodo) "protected" è visibile ed utilizzabile nella classe in cui viene definito,
     * nelle classi presenti nello stesso package della classe in cui viene definito
     * e nelle classi che estendono (ereditano) la classe in cui viene definito.
     */
    protected static int valore3 = 3;
    protected static void metodo3(){
        System.out.println("metodo " + valore3);
    }

    /*
     * Nel caso in cui un attributo (o metodo) non possegga alcun modificatore di accesso, è implicito che
     * sia un attributo (o metodo) di "default" (package), cioè visibile ed utilizzabile nella classe in cui
     * viene definito e nelle classi presenti nello stesso package della classe in cui viene definito.
     */
    static int valore4 = 4;
    static void metodo4(){
        System.out.println("metodo " + valore4);
    }

    /*
     * E' inoltre possibile rendere visibile un metodo che utilizzi un attributo "private". Ogni altra
     * classe che chiamerà il metodo, avrà la possibilità di accedere indirettamente all'attributo.
     */
    public static void metodoBonus(){
        System.out.println("private " + valore1);
    }

    public static void main(String[] args) {
        //Testiamone la veridicità

        System.out.println(valore1);
        System.out.println(valore2);
        System.out.println(valore3);
        System.out.println(valore4);
        metodo1();
        metodo2();
        metodo3();
        metodo4();
        metodoBonus();
    }
}
