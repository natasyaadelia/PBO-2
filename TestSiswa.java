
package Siswa;
public class TestSiswa {
    public static void main(String[] args) {       
        EncapSiswa siswa = new EncapSiswa();
        siswa.setNama("Tata");
        siswa.setUmur(15);
        siswa.setAlamat("Blitar");
        
        System.out.println("Nama :"+siswa.getNama());
        System.out.println("Umur :"+siswa.getUmur());
        System.out.println("Alamat :"+siswa.getAlamat());
    }
    
}
