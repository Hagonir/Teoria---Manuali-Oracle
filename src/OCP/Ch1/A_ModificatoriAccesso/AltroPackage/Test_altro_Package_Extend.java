package Ch1.A_ModificatoriAccesso.AltroPackage;

import Ch1.A_ModificatoriAccesso.Modificatori_di_Accesso;

//NB. Sto estendendo la classe Modificatori_di_Accesso
public class Test_altro_Package_Extend extends Modificatori_di_Accesso{

    public static void main(String[] args) {
        //Valore1 non è visibile
        //System.out.println(Modificatori_di_Accesso.valore1);//    <--- PRIVATE
        System.out.println(Modificatori_di_Accesso.valore2);//      <--- PUBLIC
        System.out.println(Modificatori_di_Accesso.valore3);//      <--- PROTECTED
        //Valore4 non è visibile
        //System.out.println(Modificatori_di_Accesso.valore4);//    <--- DEFAULT
        //Metodo1 non è visibile
        //Modificatori_di_Accesso.metodo1();//                      <--- PRIVATE
        Modificatori_di_Accesso.metodo2();//                        <--- PUBLIC
        Modificatori_di_Accesso.metodo3();//                        <--- PROTECTED
        //Metodo4 non è visibile
        //Modificatori_di_Accesso.metodo4();//                      <--- DEFAULT
        Modificatori_di_Accesso.metodoBonus();//                    <--- PUBLIC
    }
}
