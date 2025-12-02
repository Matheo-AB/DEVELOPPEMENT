import java.io.IOException;
public class Main {
public static void main(String[] args) {
System.out.println("=== TP Débogage - Partie 2 ===");
int[] values = {5, 15, 25, 35, 45};
Statistics stats = new Statistics();
FileLoader loader = new FileLoader();
UserInput ui = new UserInput();
System.out.println("Moyenne : " + stats.average(values)); // BUG
ICI ?↪
System.out.println("Maximum : " + stats.max(values)); // BUG
ICI ?↪
System.out.println("Minimum : " + stats.min(values)); // BUG
ICI ?↪
System.out.println("--- Lecture de fichier ---");
try {
String data = loader.load("data.txt"); // BUG ICI ?
System.out.println(data);
} catch (IOException e) {
System.out.println("Erreur lors de la lecture : " +
e.getMessage());↪
}
System.out.println("--- Entrée utilisateur ---");
String name = ui.askName(); // BUG ICI ?
System.out.println("Bonjour " + name + " !");
System.out.println("Programme terminé.");
}
}