
public class Salle {
    int numero;
    String Classe;
    int effectif;

    Apprenant liste = new Apprenant(null, null, null, null, null);

    // Constructor for Salle
    public Salle(int numero, String Classe, int effectif) {
        this.numero = numero;
        this.Classe = Classe;
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
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }
}