import java.util.Scanner;
public class Demenagement {
    // version fixe
    public static void versionFixe() {
        int totalCartons = 34;
        int camionCapacity = 9;

        int reste = totalCartons;

        while (reste > 0) {
            int charge = Math.min(reste, camionCapacity);
            System.out.println("un voyage de" + " " + charge + " " + "cartons");
            reste -= charge;
        }
    }
    public static void versionDynamique() {
        Scanner sc = new Scanner(System.in);

        int totalCartons = lireEntierPositif(sc, "Nombre total de cartons à déménager : ");
        int capaciteCamion = lireEntierPositif(sc, "Capacité du camion (en cartons) : ");

        int reste = totalCartons;
        while (reste > 0) {
            int chargement = Math.min(reste, capaciteCamion);
            System.out.println("un voyage de " + chargement + " cartons");
            reste -= chargement;
        }

        sc.close();
    }

    // Méthode utilitaire
    private static int lireEntierPositif(Scanner sc, String message) {
        int valeur;
        while (true) {
            System.out.print(message);
            if (sc.hasNextInt()) {
                valeur = sc.nextInt();
                sc.nextLine();
                if (valeur > 0) {
                    return valeur;
                } else {
                    System.out.println("Veuillez entrer un entier strictement positif.");
                }
            } else {
                System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
                sc.nextLine();
            }
        }
    }


    // Point entré principal

    public static void main(String[] args) {
        System.out.println("=== Exo 5 : Version statique ===");
        versionFixe();

        System.out.println("\n=== Exo 6 : Version dynamique ===");
        versionDynamique();
    }
}
