package Praktikum;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        dictionary();
    }

    public static void dictionary() {
        String search;
        HashMap<String, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        map.put("Sleep", "Tidur");
        map.put("Table", "Meja");
        map.put("Chair", "Kursi");
        map.put("Bed", "Tempat Tidur");

        System.out.print("Find Word: ");
        search = sc.next();

        if (map.keySet().contains(search)) {
            System.out.println(search + " = " + map.get(search));
        } else {
            System.out.println("Kata tidak ada di kamus");
        }

        System.out.print("\nIngin Mengulang Program ? (y/n) : ");
        char pilih = sc.next().charAt(0);
        System.out.println();
        if (pilih == 'y' || pilih == 'Y') {
            dictionary();
        } else {
            System.out.println("Bye");
        }
    }
}
