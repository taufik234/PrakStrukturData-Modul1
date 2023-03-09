package PrakTikum;

import java.util.Scanner;

public class hasil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int Alas, Tinggi;
        //double alas, tinggi;

        Segitiga<Integer, Integer> luasTipeInt = new Segitiga<Integer, Integer>();
        Segitiga<Double, Double> luasTipeDouble = new Segitiga<Double, Double>();
        System.out.println("=== Hitung Luas Segitiga ===");
        System.out.println("Mau Menampilkan Dalam Bentuk Apa kakak ? : ");
        System.out.println("1. Integer");
        System.out.println("2. Double");
        System.out.print("Pilih : ");
        int Pilih = sc.nextInt();
        if (Pilih == 1) {
            System.out.print("Masukkan Alas : ");
            luasTipeInt.setSegitiga(sc.nextInt(), sc.nextInt());
            // Alas = sc.nextInt();
            System.out.print("Masukkan Tinggi : ");
            // Tinggi = sc.nextInt();
            luasTipeInt.setSegitiga(luasTipeInt.getA(), luasTipeInt.geT());
            System.out.println("Hasil dari Int adalah: " + luasTipeInt.getResultAsInt());
        } else if (Pilih == 2) {
            System.out.print("Masukkan Alas : ");
            luasTipeDouble.setSegitiga(sc.nextDouble(), sc.nextDouble());
            // alas = sc.nextDouble();
            System.out.print("Masukkan Tinggi : ");
            // tinggi = sc.nextDouble();
            luasTipeDouble.setSegitiga(luasTipeDouble.getA(), luasTipeDouble.geT());
            System.out.println("Hasil dari Double adalah: " + luasTipeDouble.getResultAsDouble());
        } else {
            System.out.println("Pilihan Tidak Ada");
        }

        sc.close();

    }
}
