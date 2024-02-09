import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Apprenant[] apprenant_1 = new Apprenant[50];
    static byte index = 0;
    Apprenant ApprenantOutils = new Apprenant(0, null,null,null,null,null);

    public static void main(String[] args) {
        Menu();
    }

    static void Menu() {
        byte choix;

        Scanner scan = new Scanner(System.in);
        ArrayList<Apprenant> apprenantsList = new ArrayList<Apprenant>();

        do {
            System.out.println("================================ Menu ===================================");
            System.out.println("< 1 > Pour Ajouter un nouvel apprenant");
            System.out.println("< 2 > Pour Supprimer un apprenant existant");
            System.out.println("< 3 > Pour Modifier les informations d'un apprenant existant");
            System.out.println("< 4 > Pour Consulter la liste des apprenants");
            System.out.println("< 5 > Rechercher un apprenant par nom, prénom ou numéro d'identifiant");
            System.out.println("< 0 > Pour Quitter!!");
            System.out.println("==========================================================================");
            System.out.print("Entrez votre choix : ");
            choix = scan.nextByte();

            switch (choix) {
                case 0:
                    System.out.println("Au revoir <3");
                    break;

                case 1:
                    Apprenant.Ajoute(apprenantsList);
                    break;

                case 2:
                    Apprenant.Supprime(apprenantsList);
                    break;

                case 3:
                    // Implement modification logic
                    Apprenant.Modi(apprenantsList);
                    break;

                case 4:
                    Apprenant.Affichage(apprenantsList);
                    break;

                case 5:
                Apprenant.Recherche(apprenantsList);
                    break;

                default:
                    System.out.println("Entrer un choix entre 0 et 5");
                    break;
            }
        } while (choix != 0);
    }
}
