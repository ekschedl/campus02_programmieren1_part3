import java.util.Arrays;
import java.util.Random; // Importiert die Klasse Random für Zufallszahlen
import java.util.concurrent.TimeUnit; // Importiert die Klasse TimeUnit für die Steuerung der Verzögerung
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //ArrayNichtAufEinmal();
        //ArrayMaxGleitkommazahl();
        //ArrayLength8Strings();
        //ArraySummeOf12Elemente();
        Array15Zufalls();
        //Array20GeradeZufalls();
        //Array10SpezialStart();
        //Array10ZahlenMax();

    }

    //1. Schreibe ein Programm, das ein Array von 10 Ganzzahlen erzeugt und diese
    //anschließend, Element für Element (nicht alles auf einmal), in der Konsole ausgibt.
    public static void ArrayNichtAufEinmal() throws InterruptedException {
        Random random = new Random(); // Erstellt ein Random-Objekt für Zufallszahlen
        int[] numbers = new int[10]; // Erstellt ein Array mit 10 Ganzzahlen

        // Füllt das Array mit Zufallszahlen zwischen 0 und 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        // Durchläuft das Array und gibt jede Zahl mit Verzögerung aus
        for (int number : numbers) {
            System.out.println(number);// Gibt die aktuelle Zahl aus
            TimeUnit.MILLISECONDS.sleep(300);  // Wartet 300 Millisekunden vor der nächsten Ausgabe
        }
    }
    /*----------------------------------------------------------------------*/

    //2. Schreibe ein Programm, das ein Array von 5 Gleitkommazahlen erzeugt (Kein
    //Einlesen aus der Konsole) und das größte Element im Array findet und ausgibt.
    public static void ArrayMaxGleitkommazahl() {
        //float[] numbers = {1.3f, 2.3f, 3.4f, 0.3f, -4f, 54f, 1.43f, 1.5f, 0f};   // Initialisiert das Array mit 10 Gleitkommazahlen in float typ
        //double[] numbers = {1.3, 2.3, 3.4, 0.3, -4}; // Initialisiert das Array mit 10 Gleitkommazahlen in double typ
        Random random = new Random();
        double[] numbers = new double[5];// Erstellt ein Array mit 5 Gleitkommazahlen

        //Befüllt Array mit Zufallszahlen
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextDouble();
        }

        // Setzt das erste Element als Startwert für max (größte Zahl) und min (kleinste Zahl)
        double max = numbers[0];
        double min = numbers[0];
        // Durchläuft das Array, um das größte und kleinste Element zu finden
        for (double number : numbers) {
            if (number > max) {
                max = number;  // Aktualisiert die größte Zahl
            } else if (number < min) {
                min = number; // Aktualisiert die kleinste Zahl
            }
        }
        // Gibt die Ergebnisse aus
        System.out.println("Das größte Element im Array ist: " + max);
        System.out.println("Das kleinste Element im Array ist: " + min);
    }
    /*----------------------------------------------------------------------*/

    //3. Schreibe ein Programm, das ein Array von 8 Strings erzeugt (Kein Einlesen von
    // der Konsole) und die Länge jedes Strings im Array ausgibt.
    public static void ArrayLength8Strings() {
        Random random = new Random(); // Erstellt ein Random-Objekt für zufällige Zahlen

        String[] words = new String[8]; // Erstellt ein Array mit 8 Strings
        String[] wordList = { // Liste mit möglichen Wörtern
                "Apfel", "Banane", "Orange", "Traube", "Mango", "Erdbeere", "Kirsche", "Melone",
                "Ananas", "Pfirsich", "Birne", "Zitrone", "Himbeere", "Johannisbeere", "Kiwi",
                "Granatapfel", "Feige", "Dattel", "Papaya", "Passionsfrucht"
        };

        //Befüllen Array mit zufälligen Wörtern aus der wordList
        for (int i = 0; i < words.length; i++) {
            //Wählt ein zufälliges Wort aus wordList und speichert es im Array words
            words[i] = wordList[random.nextInt(wordList.length)];  // random.nextInt(wordList.length) gibt eine Zufallszahl zwischen 0 und wordList.length-1 zurück
        }

        // Durchläuft das Array und gibt die Länge jedes Wortes aus (Variante 1):
        for (String word : words) {
            System.out.println("Die Länge von \"" + word + "\" : " + word.length() + " Zeichen.");
        }

        // Durchläuft das Array und gibt die Länge jedes Wortes aus (Variante2 -  mit innerer Schleife):
        // Äußere Schleife zählt die Wörteranzahl in Array
        /*for (int i = 0; i < words.length; i++) {
            int length = 0; // Speichern der Wortlänge

            // Innere Schleife durchläuft jedes Zeichen des aktuellen Wortes
            for (int j = 0; j < words[i].length(); j++) {
                length++; // Erhöht die Länge für jedes Zeichen im Wort
            }
            System.out.println("Das Word \"" + words[i] + "\" hat " + length + " Buchstaben");
        }*/
    }
    /*----------------------------------------------------------------------*/

    //4. Schreibe ein Programm, das ein Array von 12 Ganzzahlen erzeugt (Kein Einlesen
    //von der Konsole) und eine Summe aller Elemente im Array berechnet.
    public static void ArraySummeOf12Elemente() {
        Random random = new Random(); // Erstellt ein Random-Objekt für die Generierung von Zufallszahlen
        int[] numbers = new int[12]; // Erstellt ein Array mit 12 Ganzzahlen
        int sum = 0;     // Variable zur Speicherung der Summe

        // Befüllt das Array mit zufälligen Zahlen zwischen 0 und 99
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generiert eine Zufallszahl zwischen 0 und 99 und speichert sie im Array
        }
        System.out.println("Zufälliges Array ist: " + Arrays.toString(numbers));

        // Durchläuft das Array und addiert jedes Element zur Summe
        for (int number : numbers) {
            sum += number;
        }
        // Gibt die berechnete Summe aus
        System.out.println("Die Summe der 12 Elemente beträgt: " + sum);
    }
    /*----------------------------------------------------------------------*/

    //5. Schreibe ein Programm, das ein Array von 15 Zufallszahlen zwischen 1 und 100
    //erzeugt (Kein Einlesen von der Konsole) und alle Elemente, einzeln (nicht alles
    //auf einmal) im Array ausgibt.
    public static void Array15Zufalls() {
        //Variante 1 - Math.random
        /*int[] numbers = new int[15]; // Erstellt ein Array mit 15 Ganzzahlen

        // Befüllen und Ausgeben des Arrays mit Zufallszahlen:
        for (int i = 0; i < numbers.length; i++) {
                //Math.random() → Zahl zwischen 0.0 und 1.0.
                //	* 100 → Zahl zwischen 0.0 und 99.9999.
                //	(int) → Ganze Zahl zwischen 0 und 99.
                //	+1 → Ganze Zahl zwischen 1 und 100.
            numbers[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numbers[i] + " "); //  Ausgabe
        }*/

        //Variante 2 - Random
        Random random = new Random(); // Erstellt ein Random-Objekt
        int[] numbers = new int[15];  // Erstellt ein Array mit 15 Ganzzahlen

        // Befüllen und Ausgeben des Arrays mit Zufallszahlen:
        for (int i = 0; i < numbers.length; i++) {
            // random.nextInt(1, 101) erzeugt eine Zahl zwischen 1 (inkl.) und 101 (exkl.), also >= 1 und <= 100.
            numbers[i] = random.nextInt(1, 101);
            System.out.println("Element an Index " + i + ": " + numbers[i]);

            // Zeitverzögerung (0.3 sec)
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /*----------------------------------------------------------------------*/

    //6. Schreibe ein Programm, das ein Array von 20 Ganzzahlen erzeugt (Kein Einlesen
// von der Konsole) und nur die geraden Zahlen im Array ausgibt.
    public static void Array20GeradeZufalls() {
        Random random = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = random.nextInt(101) * 2;
                System.out.println(arr[i]);
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    /*----------------------------------------------------------------------*/

    //7. Schreibe ein Programm, das ein Array von 10 Strings erzeugt (Kein Einlesen von
// der Konsole) und diejenigen Strings im Array ausgibt, die mit einem bestimmten
// Buchstaben beginnen.
    public static void Array10SpezialStart() {
        String[] arr = {
                "Ich Satz",
                " Satz",
                " der ",
                "Ich b Satz",
                "liebe",
                "Topfen",
                "Wolken",
                "Essen"
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte eine Buchstabe ein: ");
        char buchstabe = scanner.next().charAt(0);

    }
    /*----------------------------------------------------------------------*/

    //Schreiben Sie ein Programm, das die Elemente eines Arrays mit 10 ganzen Zahlen
//von der Konsole durch den Benutzer einliest und dann das größte Element findet
//und ausgibt.
    public static void Array10ZahlenMax() {
        Scanner scanner = new Scanner(System.in);


        // int[] arr= new int[10];
        // for(number : arr) {
        // System.out.println("Gib eine ganze Zahlen ein:");
        // arr[number]= scanner.nextInt();

    }

    /*----------------------------------------------------------------------*/

}



