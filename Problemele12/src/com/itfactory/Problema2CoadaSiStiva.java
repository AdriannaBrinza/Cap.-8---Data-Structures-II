package com.itfactory;

/* Sa se verifice daca un numar citit de la tastatura este palindrom sau nu.
Exemplu: 991199 este palindrom, deoarece numarul citit invers este ca cel initial. Alte exemple de palindrom: 121, 22322, 556655, 4432344
In clasa Utils aveti o metoda ajutatoarea care va transforma un numar de tip int in array de String continand fiecare cifra in ordine.
Puteti rula metoda main din clasa Utils sa va convingeti.

Sugestie:
Pentru aceasta verificare va fi util sa folositi un Queue si un Stack.
Prima data puneti fiecare cifra (parcurgand array-ul) in Queue si in Stack (in acelasi timp).
Apoi parcurgeti Queue-ul si Stack-ul si fiecare element scos din Queue trebuie sa fie egal cu fiecare element scos din Stack.
Daca 2 elemente scoase nu sunt egale, numarul nu este palindrom.
Exemplul palindrom
1 2 3 4 3 2 1 (citit normal)
1 2 3 4 3 2 1 (citit invers)

Exemplul care nu este palindrom
1 2 3 4 5 6 7 (citit normal)
7 6 5 4 3 2 1 (citit invers) */

import java.util.*;

public class Problema2CoadaSiStiva {
    public static void main(String[] args) {

        Queue<String> coada = new LinkedList<>();
        Stack<String> stiva = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un numar pentru a verifica daca este palindrom: ");
        Long numar = Long.parseLong(scanner.nextLine());
        char[] array = String.valueOf(numar).toCharArray();
        String[] stringArray = new String[array.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
            coada.add(stringArray[i]);
            stiva.push(stringArray[i]);
        }

        int contor = 0;

        while (!coada.isEmpty()) {
            while (!stiva.isEmpty()) {
                if (coada.poll().equals(stiva.pop())) {                        // Method invocation 'equals' may produce NullPointerException
//                if (Objects.equals(coada.poll(), stiva.pop())) {           // Recomandarea IntelliJ pentru a evita exceptia de mai sus
                    contor++;
                }
            }
        }
        if (contor == stringArray.length) {
            System.out.println("\nRaspuns: numarul " + numar + " este palindrom.");
        } else {
            System.out.println("\nRaspuns: numarul " + numar + " NU este palindrom.");
        }
    }
}