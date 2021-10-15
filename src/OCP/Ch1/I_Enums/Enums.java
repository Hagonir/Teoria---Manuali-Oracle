package Ch1.I_Enums;

public class Enums {
    /*
     * ENUMS
     * Una enumerazione è un gruppo finito di costanti.
     * In Java Enum è una classe che rappresenta le enumerazioni.
     * E' preferibile utilizzare la classe enum piuttosto che un gruppo di costanti, siccome
     * prevede un controllo "a prova di tipo": se tramite le costanti numeriche è possibile
     * utilizzare un valore non valido e non scoprirlo prima del runtime, con un enum è
     * impossibile senza ottenere un errore del compilatore.
     * E' inoltre impossibile estendere la classe enum, siccome non è consentito aggiungere
     * altre costanti alla classe.
     */

    //Gli attributi di un Enum sono statici
    enum Enumeratore{
        LUNEDI, MARTEDI, MERCOLEDI, GIOVEDI, VENERDI, SABATO, DOMENICA
    }
    //E' possibile aggiungere costruttore, attributi e metodi ad un enum:
    enum Enumeratore1{
        UNO("1"), DUE("2"), TRE("3");
        private String numero;
        private Enumeratore1(String numero){
            this.numero = numero;
            System.out.println(numero);
            System.out.println("Costruttore enum");
        }
        public void stampa(){
            System.out.println("Richiamato:" + numero);
        }
    }
    //Ogni costante può avere il suo blocco di codice: come fossere sottoclassi.
    enum Enumeratore2{
        TERRA{
            @Override
            public void stampa() {
                System.out.println("Siamo sulla terra");
            }
            @Override
            public void nuovaStampa(){
                System.out.println("Siamo da qualche parte sulla terra");
            }
        },
        MARTE{
            @Override
            public void stampa() {
                System.out.println("Siamo su marte");
            }
        },
        GIOVE{
            @Override
            public void stampa() {
                System.out.println("Siamo su giove");
            }
        };
        //Inserendo un metodo astratto, si obbligano le costanti "sottoclassi" ad implementarlo
        public abstract void stampa();
        //Possiamo anche creare un metodo di default
        public void nuovaStampa(){
            System.out.println("Non si sa");
        }
    }

    public static void main(String[] args) {
        System.out.println("ENUMERATORE");
        System.out.println(".name()");
        //.name() Ritorna esattamente il nome della costante (è preferibile usare il toString)
        System.out.println(Enumeratore.LUNEDI.name());
        System.out.println(Enumeratore.LUNEDI.toString());
        //.toString() implicito, come nelle classi
        System.out.println(Enumeratore.LUNEDI);

        System.out.println(".values()");
        //.values() Ritorna il riferimento ad un array delle costanti di enum
        System.out.println(Enumeratore.values());
        for(Enumeratore test : Enumeratore.values()){
            System.out.println(test.name());
        }

        System.out.println(".ordinal()");
        //.ordinal() Ritorna la posizione nell'array della costante
        System.out.println(Enumeratore.values());
        for(Enumeratore test : Enumeratore.values()){
            System.out.println(test.ordinal());
        }

        System.out.println(".valueOf()");
        //.valueOf() Ritorna il valore della costante indicata dalla stringa passata.
        //NB. Java è case sensitive
        System.out.println(Enumeratore.valueOf("LUNEDI"));

        //Switch
        Enumeratore test = Enumeratore.LUNEDI;
        switch (test){
            /*
             * Utilizziamo direttamente un enum nei vari case: lo switch sa che le uniche
             * corrispondenze possibili sono con un enum, avendone uno come argomento
             */
            case LUNEDI:
                System.out.println("E' lunedi!");
                break;
            case MARTEDI:
                System.out.println("E' martedi!");
                break;
            default:
                System.out.println("default");
        }

        System.out.println("\n\nENUMERATORE1");
        /*
         * Utilizzando un enumeratore che contiene dei parametri, obbligatoriamente
         * dobbiamo dichiarare un costruttore che prenda in esame i parametri segnati.
         * Quando richiamo per la prima volta un enum, implicitamente creo una istanza
         * della classe per ogni costante che possiede, inizializzandone il costruttore
         * con il corrispettivo parametro, che viene lavorato. Questo succede solamente
         * la prima volta che viene richiamato l'enumeratore. Nel caso di Enumeratore1
         * (vedi sopra) passo una stringa che contiene un valore numerico, e tramite
         * un metodo (.stampa()) la restituisco. Attenzione: richiamando il metodo stampo
         * solo il valore dell'istanza desiderata.
         */
        Enumeratore1.UNO.stampa();

        System.out.println("\n\nENUMERATORE2");
        Enumeratore2.TERRA.stampa();
        Enumeratore2.TERRA.nuovaStampa();
        Enumeratore2.GIOVE.stampa();
        //Stavolta utilizza il metodo di default, non avendone una propria implementazione
        Enumeratore2.GIOVE.nuovaStampa();
    }
}