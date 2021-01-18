package tda;
/**
 *
 * @author Noemi
 */
public class TDA {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Balon_fut balon=new Balon_fut (5);
        
        System.out.println("El radio del balón es: "+ balon.getRadio());
        System.out.println("EL diámetro del balón es: "+ balon.getdiametro());
        System.out.println("La circuferencia del balón es: "+ balon.getcircuferencia());
        System.out.println("EL área del balón es: "+ balon.getarea());
        System.out.println("EL volumen del balón es: "+ balon.getvolumen());  
    }    
}
