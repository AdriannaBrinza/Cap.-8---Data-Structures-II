package com.itfactory;

import java.util.Scanner;

public class Utils {

    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static Persoana citestePersoana() {
        System.out.print("ID-ul persoanei: ");
        String id = scanner.nextLine();
        System.out.print("Numele persoanei: ");
        String nume = scanner.nextLine();
        return new Persoana(id, nume);
    }

    public static Departament citesteDepartament() {
        System.out.print("Introduceti numele departamentului: ");
        String numeDepartament = scanner.nextLine();
        return new Departament(numeDepartament);
    }

}