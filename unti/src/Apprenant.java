import java.util.Scanner;

public class Apprenant {
    private String nom;
    private String prenom;
    private String phoneNum;
    private String DN;

    Salle classe = new Salle();

    // Constructor
    Apprenant(String Nom, String Prenom, Salle clasSalle, String PhoneNum, String DN) {
        this.nom = Nom;
        this.prenom = Prenom;
        this.classe = clasSalle;
        this.phoneNum = PhoneNum;
        this.DN = DN;
    }


    // Static method for adding Apprenant
    static void Ajoute() {
        Apprenant[] apprenants = new Apprenant[10]; // Change the size accordingly
        int index = 0; // Initialize index

        Scanner scan = new Scanner(System.in);
        boolean ApprenantAdded = false;

        System.out.println("Ajouter un nouvel apprenant : \n");
        System.out.println("Nom: \n");
        String nom = scan.nextLine();
        while (nom.equals("")) {
            System.out.println("Entrer un nom s'il vous plaît! ");
            System.out.println("Nom: \n");
            nom = scan.nextLine();
        }

        System.out.println("Prénom : \n");
        String prenom = scan.nextLine();

        System.out.println("Date de naissance : \n");
        String DN = scan.nextLine();

        System.out.println("Numéro de téléphone : \n");
        String phoneNum = scan.nextLine();

        byte classNum = 0;
        do {
            System.out.println("Numéro de classe : \n");
            classNum = Byte.valueOf(scan.nextLine());
    
            cla(classNum);  // Set the appropriate method to set the class number

        } while (classNum != 1 && classNum != 2);

        // The following line creates a new Apprenant instance and adds it to the array
        apprenants[index] = new Apprenant(nom, prenom, , phoneNum, DN);
        index++;

        ApprenantAdded = true;

        if (ApprenantAdded) {
            System.out.println("Apprenant ajouté avec succès!");
        }
    }

    // Static method for displaying Apprenant
    static void Affichage(Apprenant[] apprenants, byte index) {
        System.out.println("Liste des apprenants : \n");
        for (int i = 0; i < index; i++) {
            System.out.println("+++ Apprenant " + (i + 1) + " :");
            System.out.println("\t Nom et prénom : " + apprenants[i].nom + " " + apprenants[i].prenom);
            System.out.println("\t  Date de naissance : " + apprenants[i].DN);
            System.out.println("\t Téléphone : " + apprenants[i].phoneNum);
            System.out.println("\t Classe : " + apprenants[i].classe);
        }
    }
}


// // Getter and setter methods for properties
    // public String getNom() {
    //     return this.nom;
    // }

    // public void setNom(String var1) {
    //     this.nom = var1;
    // }

    // public String getPrenom() {
    //     return this.prenom;
    // }

    // public void setPrenom(String var1) {
    //     this.prenom = var1;
    // }

    // public Salle getClasse() {
    //     return this.classe;
    // }

    // public void setClasse(Salle var1) {
    //     this.classe = var1;
    // }

    // public String getPhoneNum() {
    //     return this.phoneNum;
    // }

    // public void setPhoneNum(String var1) {
    //     this.phoneNum = var1;
    // }

    // public String getDN() {
    //     return this.DN;
    // }

    // public void setDN(String var1) {
    //     this.DN = var1;
    // }
