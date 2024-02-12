import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Salle> sallesList = new ArrayList<>();
    static byte index = 0;
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte choixMenu;

        do {
            System.out.println("============================= Menu Principal ==============================");
            System.out.println("< 1 > Pour le menu Apprenant");
            System.out.println("< 2 > Pour le menu Salle");
            System.out.println("< 0 > Pour Quitter");
            System.out.println("==========================================================================");
            System.out.print("Entrez votre choix : ");
            choixMenu = scan.nextByte();

            switch (choixMenu) {
                case 0:
                    System.out.println("Au revoir <3");
                    break;

                case 1:
                    menuApprenant();
                    break;

                case 2:
                    menuSalle();
                    break;

                default:
                    System.out.println("Entrer un choix entre 0 et 2");
                    break;
            }
        } while (choixMenu != 0);

        scan.close();
    }

    static void menuApprenant() {
        byte choix;

        Scanner scan = new Scanner(System.in);
        ArrayList<Apprenant> apprenantsList = new ArrayList<>();

        do {
            System.out.println("============================ Menu Apprenant ==============================");
            System.out.println("< 1 > Pour Ajouter un nouvel apprenant");
            System.out.println("< 2 > Pour Supprimer un apprenant existant");
            System.out.println("< 3 > Pour Modifier les informations d'un apprenant existant");
            System.out.println("< 4 > Pour Consulter la liste des apprenants");
            System.out.println("< 5 > Rechercher un apprenant par nom, prénom ou numéro d'identifiant");
            System.out.println("< 0 > Pour Quitter le menu Apprenant");
            System.out.println("==========================================================================");
            System.out.print("Entrez votre choix : ");
            choix = scan.nextByte();

            switch (choix) {
                case 0:
                    System.out.println("Retour au menu principal");
                    break;

                case 1:
                    Apprenant.Ajoute(apprenantsList);
                    break;

                case 2:
                    Apprenant.Supprime(apprenantsList);
                    break;

                case 3:
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

        scan.close();
    }

    static void menuSalle() {
        byte choixSalle;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("=============================== Menu Salle ================================");
            System.out.println("< 1 > Pour Ajouter une nouvelle classe");
            System.out.println("< 2 > Pour Supprimer une classe existante");
            System.out.println("< 3 > Pour Modifier les informations d'une classe existante");
            System.out.println("< 4 > Pour Filtrer les apprenants par classe");
            System.out.println("< 0 > Pour Quitter le menu Salle");
            System.out.println("==========================================================================");
            System.out.print("Entrez votre choix : ");
            choixSalle = scan.nextByte();

            switch (choixSalle) {
                case 0:
                    System.out.println("Retour au menu principal");
                    break;

                case 1:
                    Salle.ajouterClasse(sallesList);
                    break;

                case 2:
                    Salle.supprimerClasse(sallesList);
                    break;

                case 3:
                    Salle.modifierClasse(sallesList);
                    break;

                case 4:
                Salle.ajouterClasse(sallesList); // Add a new class
                sallesList.get(sallesList.size() - 1).filtrerApprenantsParClasse(); // Filter apprenants in the new class
                break;

                default:
                    System.out.println("Entrer un choix entre 0 et 4");
                    break;
            }
        } while (choixSalle != 0);

        scan.close();
    }
}
