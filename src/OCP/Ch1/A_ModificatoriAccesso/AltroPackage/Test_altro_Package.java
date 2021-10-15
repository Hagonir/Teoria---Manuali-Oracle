package Ch1.A_ModificatoriAccesso.AltroPackage;

//NB. Sto importando la classe Modificatori_di_Accesso
import Ch1.A_ModificatoriAccesso.Modificatori_di_Accesso;

public class Test_altro_Package {

    public static void main(String[] args) {
        //Valore1 non è visibile
        //System.out.println(Modificatori_di_Accesso.valore1);//    <--- PRIVATE
        System.out.println(Modificatori_di_Accesso.valore2);//      <--- PUBLIC
        //Valore3 non è visibile
        //System.out.println(Modificatori_di_Accesso.valore3);//    <--- PROTECTED
        //Valore4 non è visibile
        //System.out.println(Modificatori_di_Accesso.valore4);//    <--- DEFAULT
        //Metodo1 non è visibile
        //Modificatori_di_Accesso.metodo1();//                      <--- PRIVATE
        Modificatori_di_Accesso.metodo2();//                        <--- PUBLIC
        //Metodo3 non è visibile
        //Modificatori_di_Accesso.metodo3();//                      <--- PROTECTED
        //Metodo4 non è visibile
        //Modificatori_di_Accesso.metodo4();//                      <--- DEFAULT
        Modificatori_di_Accesso.metodoBonus();//                    <--- PUBLIC
    }
}
