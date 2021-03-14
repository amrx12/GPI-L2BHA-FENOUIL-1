public class ToStringConnexion {
    private String selection, mdp;
    Fenetre fen;
    Mdp motDePasse = new Mdp();
    BaseDeDonnee b;

    public ToStringConnexion() {
    }

    public ToStringConnexion(String selection, String mdp, Fenetre fen, BaseDeDonnee b) {
        this.selection = selection;
        this.mdp = mdp;
        this.fen = fen;
        this.b = b;
    }

    public String toString() {
        String str;

        if ((this.selection.equals("Membre du departement \"Prospection\""))
                && (this.mdp.equals(motDePasse.getMdpDepartementProspection()))) {
            str = "Connexion en temps que Membre du departement \"Prospection\"";
            this.fen.dispose();
            InterfaceGraphique.CreationCibleDeRoutage(b);
        } else if ((this.selection.equals("Directeur de la strategie"))
                && (this.mdp.equals(motDePasse.getMdpDirecteurStrategie()))) {
            str = "Connexion en temps que Directeur de la strategie";
            InterfaceGraphique.ValidationCibleDeRoutage(b);
            this.fen.dispose();
        } else if ((this.selection.equals("Responsable du routage")
                && this.mdp.equals(motDePasse.getMdpResponsableRoutage()))) {
            str = "Connexion en temps que Responsable du routage";
            this.fen.dispose();
        } else {
            str = "Erreur de connexion";
        }

        return str;

    }
}
