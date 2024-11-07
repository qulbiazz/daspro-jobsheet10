import java.util.Scanner;

public class SIAKAD23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah MHS: ");
        int jmlMhs = input.nextInt();
        System.out.print("Masukkan jumlah Matkul: ");
        int jmlMataKuliah = input.nextInt();

        int[][] nilai = new int[jmlMhs][jmlMataKuliah];

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Input nilai mahasiswa ke-" +(i+1));
            double totalPerSiswa = 0;
            for (int j = 0; j < jmlMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " +(j+1)+ ": ");
                nilai[i][j] = input.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata rata: " +totalPerSiswa/jmlMataKuliah);
        }
        System.out.println("\n====================================");
        System.out.println("Rata rata nilai setiap mata kuliah");

        for (int j = 0; j < jmlMataKuliah; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jmlMhs; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " +(j+1) + ": " +totalPerMatkul/jmlMhs);
        }
    }
}
