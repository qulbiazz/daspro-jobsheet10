import java.util.Scanner;

public class BioskopWithScanner23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next, menu, kursi;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("--------------------");
            System.out.println("----PILIHAN MENU----");
            System.out.println("--------------------");
            System.out.println("Menu 1: input data penonton");
            System.out.println("Menu 2: tampilkan data penonton");
            System.out.println("Menu 3: exit");

            System.out.print("Pilih menu: ");
            menu = input.nextLine();

            if (menu.equalsIgnoreCase("1")) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan baris (0-3): ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom (0-1): ");
                    kolom = input.nextInt();
                    input.nextLine();

                    if (penonton[(baris)][(kolom)] != null) {
                        System.out.println("kursi sudah terisi");
                        break;
                    }

                    if (baris >= 0 && baris < penonton.length && kolom >= 0 && kolom < penonton[baris].length) {
                        penonton[baris][kolom] = nama;
                        System.out.println("Penonton berhasil diinput.");
                    }
                    else {
                        System.out.println("Input baris atau kolom tidak tersedia.");

                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = input.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
                break;
            } else if (menu.equalsIgnoreCase("2")) {
                System.out.println("Daftar Penonton");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            penonton[i][j] = "***"; 
                        }
                    }
                    System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
                }
                break;
            } else if (menu.equalsIgnoreCase("3")) {
                System.out.println("Terimakasih");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid");
                break;
            }
        }
    }
}
