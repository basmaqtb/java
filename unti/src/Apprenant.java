import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant {
    
    private int ID;
    private String nom;
    private String prenom;
    private String phoneNum;
    private String DN;
    private Salle classe;

    // Constructor
    public Apprenant(int ID, String nom, String prenom, Salle classe, String phoneNum, String DN) {
        this.ID = ID;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
        this.phoneNum = phoneNum;
        this.DN = DN;
    }

    // Getter and setter methods for properties
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Salle getClasse() {
        return classe;
    }

    public void setClasse(Salle classe) {
        this.classe = classe;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDN() {
        return DN;
    }

    public void setDN(String DN) {
        this.DN = DN;
    }

    // Static method for adding Apprenant
    private static int lastID = 0;
    public static void Ajoute(ArrayList<Apprenant> apprenantsList) {
        Scanner scan = new Scanner(System.in);
        lastID++;
        
        System.out.println("Ajouter un nouvel apprenant : \n");
        System.out.println("Nom: ");
        String nom = scan.nextLine();
        while (nom.isEmpty()) {
            System.out.println("Entrer un nom s'il vous plaît! ");
            System.out.println("Nom: ");
            nom = scan.nextLine();
        }

        System.out.println("Prénom : ");
        String prenom = scan.nextLine();

        System.out.println("Date de naissance : ");
        String DN = scan.nextLine();

        System.out.println("Numéro de téléphone : ");
        String phoneNum = scan.nextLine();

        byte classNum;
        do {
            System.out.println("Numéro de classe (1 ou 2) : ");
            classNum = Byte.valueOf(scan.nextLine());
        } while (classNum != 1 && classNum != 2);

        Salle clasSalle = new Salle(classNum, "Nom de la classe", 30);

        apprenantsList.add(new Apprenant(lastID, nom, prenom, clasSalle, phoneNum, DN));
        
        System.out.println("Apprenant ajouté avec succès!");
    }

    public static void Supprime(ArrayList<Apprenant> apprenantsList) {
        Scanner scan = new Scanner(System.in);
        Affichage(apprenantsList);

        System.out.println("Entrer le numéro de l'apprenant que vous voulez supprimer : ");
        int NumAppreSupp = scan.nextInt();

        if (NumAppreSupp >= 1 && NumAppreSupp <= apprenantsList.size()) {
            Apprenant apprenantSupp = apprenantsList.remove(NumAppreSupp - 1);
            System.out.println("Apprenant supprimé avec succès!");
        } else {
            System.out.println("Numéro d'apprenant invalide!");
        }
    }

    public static void Affichage(ArrayList<Apprenant> apprenantsList) {
        System.out.println("Liste des apprenants : \n");
        for (int i = 0; i < apprenantsList.size(); i++) {
            Apprenant apprenant = apprenantsList.get(i);
            System.out.println("+++ Apprenant ID" + apprenant.getID() + ":");
            System.out.println("\t Nom et prénom : " + apprenant.getNom() + " " + apprenant.getPrenom());
            System.out.println("\t Date de naissance : " + apprenant.getDN());
            System.out.println("\t Téléphone : " + apprenant.getPhoneNum());
            System.out.println("\t Classe : " + apprenant.getClasse().getNumero());
        }
    }

    // Static method for modification
    public static void Modi(ArrayList<Apprenant> apprenantsList) {
        Scanner scan = new Scanner(System.in);
        Affichage(apprenantsList);

        System.out.println("Entrer le ID de l'apprenant que vous voulez modifier : ");
        int apprenantModi = scan.nextInt();

        if (apprenantModi >= 1 && apprenantModi <= apprenantsList.size()) {
            Apprenant apprenant = apprenantsList.get(apprenantModi - 1);

            System.out.println("< 1 > Nom :");
            System.out.println("< 2 > prénom :");
            System.out.println("< 3 > Date de naissance :");
            System.out.println("< 4 > Numéro de téléphone :");
            System.out.println("< 5 > Numéro de classe :");

            System.out.println("Entrer l'emplacement de votre modification (1 à 5) : ");
            byte place = scan.nextByte();

            if (place >= 1 && place <= 5) {
                System.out.println("Entrer la nouvelle valeur : ");
                String newValue = scan.next();

                switch (place) {
                    case 1:
                        apprenant.setNom(newValue);
                        break;

                    case 2:
                        apprenant.setPrenom(newValue);
                        break;

                    case 3:
                        apprenant.setDN(newValue);
                        break;

                    case 4:
                        apprenant.setPhoneNum(newValue);
                        break;

                    case 5:
                        System.out.println("Entrer le nouveau numéro de classe (1 ou 2) : ");
                        byte newClassNum = scan.nextByte();
                        Salle newClasSalle = new Salle(newClassNum, "Nom de la classe", 30);
                        apprenant.setClasse(newClasSalle);
                        break;

                    default:
                        System.out.println("Choix invalide!");
                        break;
                }

                System.out.println("Modification effectuée avec succès!");
            } else {
                System.out.println("Emplacement invalide!");
            }
        } else {
            System.out.println("Numéro d'apprenant invalide!");
        }
    }

    public static void Recherche(ArrayList<Apprenant> apprenantsList) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Rechercher un apprenant par (Nom, prénom , ID) : ");
        String ParRecherche = scan.nextLine().toLowerCase();

        boolean ApprenantTrouver = false;

        for (int i = 0; i < apprenantsList.size(); i++) {
            Apprenant apprenant = apprenantsList.get(i);

            if (String.valueOf(apprenant.getID()).contains(ParRecherche) ||
                apprenant.getNom().toLowerCase().contains(ParRecherche) ||
                apprenant.getPrenom().toLowerCase().contains(ParRecherche)) {

                System.out.println("+++ Apprenant ID" + apprenant.getID() + ":");
                System.out.println("\t Nom et prénom : " + apprenant.getNom() + " " + apprenant.getPrenom());
                System.out.println("\t Date de naissance : " + apprenant.getDN());
                System.out.println("\t Téléphone : " + apprenant.getPhoneNum());
                System.out.println("\t Classe : " + apprenant.getClasse().getNumero());

                ApprenantTrouver = true;
            }
        }

        if (!ApprenantTrouver) {
            System.out.println("Aucun apprenant trouvé pour la recherche : " + ParRecherche);
        }
    }
}
