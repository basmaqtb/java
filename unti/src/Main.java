import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Apprenant[] apprenant_1 = new Apprenant[50]; 
        byte index = 0;

        
    static void Menu(){
        Apprenant[] apprenant_1 = new Apprenant[50]; 
        byte index = 0;

        byte choix;

        Scanner scan = new Scanner(System.in);

        System.out.println("========== Menu ==========");
        System.out.println("< 1 > Pour Ajouter un nouvel apprenant");
        System.out.println("< 2 > Pour Supprimer un apprenant existant");
        System.out.println("< 3 > Pour Modifier les informations d'un apprenant existant");
        System.out.println("< 4 > Pour Consulter la liste des apprenants");
        System.out.println("< 5 > Rechercher un apprenant par nom, prénom ou numéro d'identifiant");
        System.out.println("< 0 > Pour Quitter!!");

        System.out.println("< 4 > ::::::::::::::::::: choix :");
        choix = scan.nextByte();

        do{
            switch (choix) {
                case 0:
                    System.out.println("Au revoir <3");
                case 1:
                    apprenant_1.Ajoute(apprenant_1,2);
                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    Affichage(apprenants, index);
                    break;

                case 5:

                    break;

                default:
                    System.out.println("Entrer un choix entre 0 et 5");

                    break;
            }
        }while(choix != 0);
    }
}


        
    
    }
}




