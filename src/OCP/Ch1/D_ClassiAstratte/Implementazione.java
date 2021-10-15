package Ch1.D_ClassiAstratte;

public class Implementazione extends Classi_Astratte{
        @Override//                                 <--- Sovrascrivo il metodo astratto
        void saluta() {
            System.out.println("ciao!");
        }

        public static void main(String[] args) {
            Classi_Astratte test = new Implementazione();
            test.saluta();//                        <--- Richiamando il metodo della
                                                        //superclasse ottengo il metodo
                                                        //sovrascritto
        }
}
