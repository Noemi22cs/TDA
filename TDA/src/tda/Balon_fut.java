package tda;
/**
 *
 * @author Noemi
 */
public class Balon_fut {
    private double radio;
    
    //Constructores
    public Balon_fut(double radioinicial){
        if(radioinicial>0){
            this.radio=radioinicial;
        }else{
            this.radio=0.0;
        }
    }
    //Métodos
    public double getRadio(){
        return this.radio;
    }
        public double getdiametro(){
        return (radio*2);
    }
        public double getcircuferencia(){
        return (Math.PI*getdiametro());
    }
        public double getarea(){
        return (4*Math.PI*radio*radio);
    }
        public double getvolumen(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }
}
