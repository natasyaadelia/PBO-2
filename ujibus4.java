
package tugaspraktikum;


public class ujibus4 {
    public static void main(String[] args) {
        bus4 tata = new bus4(75);
        
        tata.getpenumpang(24);
        tata.cetakpenumpang();
        
        tata.getpenumpang(21);
        tata.cetakpenumpang();
        
        tata.getpenumpang(14);
        tata.cetakpenumpang();
        
        tata.getpenumpang(11);
        tata.cetakpenumpang();
        
        tata.getpenumpang(31);
        tata.cetakpenumpang();
        
        System.out.println("Rata - Rata Berat Penumpang Sekarang:" + tata.getAverage() );
    }
}
