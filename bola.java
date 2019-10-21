
package tugaspraktikum;
public class bola {
    public double jarijari;
    
    public void setjarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public void showdiameter(){
        System.out.println("Diameter = " + jarijari*2);
    }
    public void showluaspermukaan(){
            System.out.println("Luas Permukaan = " + 4*Math.PI*jarijari);
    }
    public void showvolume(){
        System.out.println("Volume = " + 4/3*Math.PI*jarijari*jarijari*jarijari);
    }
}
