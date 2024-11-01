import java.util.Scanner;

public class Porseni12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        int jumlahPoliteknik, i, k;
        String namaPoliteknik, dataAtlet, namaAtlet;

        System.out.print("Masukkan Jumlah Politeknik yang Mendaftar: ");
        jumlahPoliteknik = sc12.nextInt();
        sc12.nextLine(); 

        String[] cabangOlahraga = { "Badminton", "Tenis Meja", "Basket", "Bola Voli" };
        dataAtlet = "";

        for (i = 1; i <= jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama politeknik ke-" + i + ": ");
            namaPoliteknik = sc12.nextLine();
            dataAtlet += "Politeknik " + i + " (" + namaPoliteknik + "):\n";

            for (String cabang : cabangOlahraga) {
                dataAtlet += "Cabang " + cabang + ":\n";

                for (k = 1; k <= 5; k++) {
                    System.out.print("Masukkan nama atlet ke-" + k + " untuk cabang " + cabang + ": ");
                    namaAtlet = sc12.nextLine();
                    dataAtlet += "- Atlet " + k + ": " + namaAtlet + "\n";
                }
            }
            dataAtlet += "\n"; 
        }
        System.out.println("\n----- Informasi Nama Atlet Porseni 2024-----");
        System.out.println(dataAtlet); 
    }

}