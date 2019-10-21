
package tugaspraktikum;

public class bus4 {
    public double penumpang;
    public double maxpenumpang;
    public double counter;
    
    public bus4 (int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    
    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxpenumpang){
            System.out.println("Penumpang Melebihi Kuota");
           
        }else{
            this.penumpang = temp;
            counter++;
        }
        
    }
    public void getpenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
            addpenumpang(35.5);
        }else{
            System.out.println("Password Salah");
        }
    }
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus Sekarang="+penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah="+maxpenumpang);
    }
    public double getAverage(){
        return penumpang/counter;
    }
}
