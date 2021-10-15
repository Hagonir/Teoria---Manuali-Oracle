package Ch1.D_ClassiAstratte;

public abstract class Classi_Astratte {

    /*
     * CLASSE ASTRATTA
     * Una classe astratta è uno speciale tipo di classe avente almeno un metodo astratto.
     * Un metodo si definisce astratto quando non viene definita la sua implementazione:
     * si costringono cosi le classi che ereditano la classe astratta (classi concrete)
     *  ad implementare (tramite l'override) i metodi astratti della superclasse.
     */

    abstract void saluta();//   <--- Definisco il metodo ma non la sua implementazione
}