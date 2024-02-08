public class Salle {
    int numero;
    String Classe;
    int effectif;

    Apprenant liste = new Apprenant(null, null, null, null, null);

public Salle(int numero, String Classe, int effectif) {
            this.numero = numero;
            this.Classe = Classe;
            this.effectif = effectif;
    }

}
