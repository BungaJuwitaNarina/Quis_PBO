package Tugas;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
 
public class deklarasi_PBO {
 
        public static void main(String[] args) throws java.io.IOException {
            ArrayList<CarCleaning> p = new ArrayList();
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String nama, alamat, email,noTelp,pilihan,pemesanan;
            int jj, pj;
           
            System.out.println("---- Car Cleaning.. Anda Pesan Kami Datang ----");
            System.out.println("***********************************************");
            System.out.println("----------------------oOo----------------------");
            
            System.out.println("*Masukan Data Pemesanan*");
            System.out.print("Masukan Nama ");
            nama = sc.nextLine();
            System.out.print("Masukan Alamat ");
            alamat = sc.nextLine();
            System.out.print("Masukan No. Tlp ");
            noTelp = sc.nextLine();
            System.out.print("Masukan Email ");
            email = sc.nextLine();

            System.out.println(" ");
            System.out.println("*Jenis Jasa*");
            System.out.println("1. Cuci Mobil");
            System.out.println("2. Salon Mobil Interior");
            System.out.println("3. Salon Mobil Eksterior");
            System.out.println(" ");
            System.out.print("Pilih Jasa : ");
            jj = sc.nextInt();
           
            System.out.println(" ");
            System.out.println("*Team Penyedia Jasa*");
            System.out.println("1. Team Sea [2 orang]");
            System.out.println("2. Team Mountain [4 orang]");
            System.out.println("3. Team Foreast [5 orang]");
            System.out.println(" ");
            System.out.print("Pilih Team : ");
            pj = sc.nextInt();
            
            System.out.println(" ");
            
            System.out.println("Berikan Keterangan Pemesanan: ");
            pemesanan = br.readLine();
           
            int jasa, alat, bahan, transportasi,total;
            System.out.println(" ");
            System.out.print("Masukan Biaya Penyedia Jasa ");
            jasa = sc.nextInt();
 
            System.out.print("Masukan Biaya Jasa Alat ");
            alat = sc.nextInt();
 
            System.out.print("Masukan Biaya Bahan Jasa ");
            bahan = sc.nextInt();
        
            System.out.print("Masukan Biaya Transportasi ");
            transportasi = sc.nextInt();
           
        
            total=jasa + alat + bahan + transportasi;
            System.out.println("----------------------oOo----------------------");
            System.out.println("***************************************************************");

            System.out.print("Jasa yang di Pesan    : ");
            if (jj == 1) {
            System.out.println("Cuci Mobil");
            } else if (jj == 2) {
            System.out.println("Salon Mobil Interior");
            } else if (jj == 3) {
            System.out.println("Salon Mobil Eksterior");
            }
            System.out.print("Nama Penyedia Jasa    : ");
            if (pj == 1) {
            System.out.println("1.Team Sea[2 orang]");
            } else if (pj == 2) {
            System.out.println("2.Team Mountain[4 orang]");
            } else if (pj == 3) {
            System.out.println("3.Salon Mobil Eksterior");
            }
        System.out.print("Keterangan            : ");
        System.out.println(pemesanan);
        System.out.println("");
        System.out.print("Total Biaya yang di Bayar Pemesanan : Rp.");
        System.out.println(total);
        System.out.println("");
        System.out.println("Salam Bersih Andre Terimakasih");
    }
}