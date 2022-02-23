package com.itfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<Persoana, Departament> map = new HashMap<>();

        Departament departamentIT = new Departament("IT");
        Departament departamentFIN = new Departament("IT");

        Persoana persoana1 = new Persoana("101", "Allison Weiner");
        Persoana persoana2 = new Persoana("102", "Tammy Ashcraft");
        Persoana persoana3 = new Persoana("103", "Paul Oswald");
        Persoana persoana4 = new Persoana("104", "Benjamin Troupe");

        map.put(persoana1, departamentIT);
        map.put(persoana2, departamentIT);
        map.put(persoana3, departamentIT);
        map.put(persoana4, departamentFIN);

        System.out.println("\nUrmeaza sa introduceti detaliile unui angajat.");
        Persoana persoana = Utils.citestePersoana();
        if (map.containsKey(persoana)) {
            System.out.print("Aceasta persoana " + persoana + " exista printre angajatii nostri. " +
                    "Introduceti numele departartamentului pentru a verifica daca persoana este asignata acestuia: ");
            String numeDepartamentNou = scanner.nextLine();
            if (map.get(persoana).getNumeDepartament().equals(numeDepartamentNou)) {
                System.out.println("Persoana " + persoana + " exista deja in departamentul " + numeDepartamentNou);
            } else {
                System.out.println("Persoana " + persoana + " va fi adaugata in departamentul " + numeDepartamentNou);
                Departament departamentNou = new Departament(numeDepartamentNou);
                map.put(persoana, departamentNou);
            }
        } else {
            System.out.println("Aceasta persoana nu se numara printre angajatii nostri.");
        }

        System.out.println("\nElementele din Map / lista de angajati: ");
        for (Map.Entry<Persoana, Departament> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}