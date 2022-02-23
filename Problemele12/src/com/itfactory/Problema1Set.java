package com.itfactory;
/* Se da un text citit de la tastatura (sau dintr-o variabila String). Pentru delimitarea cuvintelor se vor folosi doar spatii.
Se cere sa se determine cate cuvinte distincte sunt in textul dat.
Exemplu de text. "mar mar par par cireasa". Sunt 3 cuvinte distincte in acest text. (mar, par, cireasa).
Pentru toata lumea: Pentru a sparge un text in cuvinte ne folosim de metoda split din String. metoda split ne va returna un array
de string-uri (vezi documentatie).
String[] cuvinte = textulMeu.split("\\s+") (O sa spargem textul in cuvinte in functie de spatiile dintre cuvinte).

https://www.geeksforgeeks.org/split-string-java-examples/
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)

Sugestie:
O sa avem nevoie de un Set pentru problema asta deoarece o sa evitam sa adaugam duplicate astfel sa vedem cate cuvinte distincte avem in text.
Array-ul rezultat de la split il vom parcurge si vom insera in set fiecare string. Mai apoi afisam lungimea setului. */

import javax.sound.midi.Soundbank;
import java.util.*;

public class Problema1Set {
    public static void main(String[] args) {
        Set<String> setulMeu = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un sir de cuvinte delimitate doar prin spatii: ");
        String text = scanner.nextLine();
        String[] cuvinte = text.split(" ");
        System.out.println("\nArray-ul de cuvinte este: " + Arrays.toString(cuvinte) + ", \niar lungimea array-ului este: " + cuvinte.length);

        Collections.addAll(setulMeu, cuvinte);
        System.out.println("\nSetul de cuvinte este: ");
        for (String cuvant : setulMeu) {
            System.out.println(cuvant);
        }
    }
}