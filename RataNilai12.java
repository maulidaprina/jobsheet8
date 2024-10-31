import java.util.Scanner;

public class RataNilai12 {
    public static void main(String[] args) {
       
        Scanner Input12 = new Scanner(System.in);

int i, j, nilaiMhs;
float totalNilai, rataNilai;

i = 1;
while (i <= 5) {
totalNilai = 0;

System.out.println("Input Nilai Mahasiswa ke " + i);

for (j = 1; j <= 5; j++) {
    System.out.print("Nilai ke-" + j + " = ");
    nilaiMhs = Input12.nextInt();
    totalNilai += nilaiMhs;
}
    rataNilai = totalNilai / 5;
    System.out.println("Rata-rata nilai Mahasiswa ke-" + i + " = " + rataNilai);
    System.out.println();
    i++;
}
    
    }
}