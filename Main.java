package tes_push_git;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;

        System.out.println("Selamat datang di Kalkulator Sederhana!");
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();
        System.out.print("Pilih operator (+, -, *, /): ");
        operator = input.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Tidak bisa membagi dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid.");
                return;
        }

        System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
