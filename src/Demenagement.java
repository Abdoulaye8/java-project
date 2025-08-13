import java.util.Scanner;

/**
 * la classe {demenagement}, simuler un demenagement en fonction en fonction de :
 * nombre de carton
 * la capacité du camion
 * on a deux version: fixe et dynamique(l'utilisateurs met les valeurs)
 */
public class Demenagement {
    /**
     * version fixe avec 34 cartons et une capacité 9 cartons pour le camion
     */
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

    /**
     * ici c'est la version dynamique avec l'utilisatateur.
     */
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

    /**
     * Lit est un entier positif dont l'utilisateur a entré
     * @param sc scanner utiliser pour lire l'entier
     * @param message qui est affiché pour demander à saisir
     * @return retourne un entier
     */
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


    /**
     * ici c'est la méthode principale qui execute les deux versions
     */

    public static void main(String[] args) {
        System.out.println("=== Exercice 5 : Version statique ===");
        versionFixe();

        System.out.println("\n=== Exercice 6 : Version dynamique ===");
        versionDynamique();
    }
}
