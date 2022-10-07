package Tugas;

public class CarCleaning {
    String nama, alamat, email, noTelp;
    int pilihJasa,pilihTeam;
 
    public CarCleaning(String nama, String alamat, String email, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.noTelp = noTelp;
    }
 
    public String getNama() {
        return nama;
    }
 
    public String getAlamat() {
        return alamat;
    }
 
    public String getNoTelp() {
        return noTelp;
    }
    
     public String getEmail() {
        return email;
    }
 
 
}