package com.yagmur.scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Taranacak IP adresini giriniz:");
        String ip = scanner.nextLine();

        ScannerEngine engine = new ScannerEngine();

        engine.scan(ip, 1, 1024);
    }
}

