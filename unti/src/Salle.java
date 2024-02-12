import java.util.ArrayList;
import java.util.Scanner;

public class Salle {
    private int numero;
    private String classe;
    private int effectif;

    // Constructor for Salle
    public Salle(int numero, String classe, int effectif) {
        this.numero = numero;
        this.classe = classe;
        this.effectif = effectif;
    }

    // Getter and setter methods for Salle
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    // Method to add a class
    public static void ajouterClasse(ArrayList<Salle> sallesList) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ajouter une nouvelle classe : \n");

        System.out.println("Numéro de classe : ");
        int numero = Integer.parseInt(scan.nextLine());

        System.out.println("Nom de la classe : ");
        String nomClasse = scan.nextLine();

        System.out.println("Effectif de la classe : ");
        int effectif = Integer.parseInt(scan.nextLine());

        Salle nouvelleClasse = new Salle(numero, nomClasse, effectif);
        sallesList.add(nouvelleClasse);

        System.out.println("Classe ajoutée avec succès!");
    }

    // Method to delete a class
    public static void supprimerClasse(ArrayList<Salle> sallesList) {
        Scanner scan = new Scanner(System.in);
        afficherClasses(sallesList);

        System.out.println("Entrez le numéro de la classe que vous voulez supprimer : ");
        int numClasseSupp = Integer.parseInt(scan.nextLine());

        boolean classeTrouvee = false;

        for (int i = 0; i < sallesList.size(); i++) {
            Salle classe = sallesList.get(i);

            if (classe.getNumero() == numClasseSupp) {
                sallesList.remove(i);
                System.out.println("Classe supprimée avec succès!");
                classeTrouvee = true;
                break;
            }
        }

        if (!classeTrouvee) {
            System.out.println("Numéro de classe invalide!");
        }
    }

    // Method to modify a class
    public static void modifierClasse(ArrayList<Salle> sallesList) {
        Scanner scan = new Scanner(System.in);
        afficherClasses(sallesList);

        System.out.println("Entrez le numéro de la classe que vous voulez modifier : ");
        int numClasseModif = Integer.parseInt(scan.nextLine());

        boolean classeTrouvee = false;

        for (int i = 0; i < sallesList.size(); i++) {
            Salle classe = sallesList.get(i);

            if (classe.getNumero() == numClasseModif) {
                System.out.println("Entrez le nouveau nom de la classe : ");
                String nouveauNomClasse = scan.nextLine();
                classe.setClasse(nouveauNomClasse);

                System.out.println("Entrez le nouvel effectif de la classe : ");
                int nouvelEffectif = Integer.parseInt(scan.nextLine());
                classe.setEffectif(nouvelEffectif);

                System.out.println("Modification de la classe effectuée avec succès!");
                classeTrouvee = true;
                break;
            }
        }

        if (!classeTrouvee) {
            System.out.println("Numéro de classe invalide!");
        }
    }

    // Method to display all classes
    public static void afficherClasses(ArrayList<Salle> sallesList) {
        System.out.println("Liste des classes : \n");

        for (Salle classe : sallesList) {
            System.out.println("+++ Classe " + classe.getNumero() + ":");
            System.out.println("\t Nom : " + classe.getClasse());
            System.out.println("\t Effectif : " + classe.getEffectif());
        }
    }
    public void filtrerApprenantsParClasse() {
        System.out.println("Liste des apprenants pour la classe " + classe + " : \n");

        for (Apprenant apprenant : apprenantsList) {
            System.out.println("+++ Apprenant ID" + apprenant.getID() + ":");
            System.out.println("\t Nom et prénom : " + apprenant.getNom() + " " + apprenant.getPrenom());
            System.out.println("\t Date de naissance : " + apprenant.getDN());
            System.out.println("\t Téléphone : " + apprenant.getPhoneNum());
        }
    }
}

