import java.util.ArrayList;

public class Bibliotheque
    {
        private ArrayList<Livre> collection;

        public Bibliotheque()
            {
                this.collection = new ArrayList<Livre>();
            }

        public void ajouterLivre(Livre livre)
            {
                this.collection.add(livre);
            }

        public void afficherTous()
            {
                System.out.println("\n--- Contenu de la Bibliothèque ---");
                for (Livre livre : this.collection)
                    {
                        livre.afficher();
                        System.out.println("---------------------------------");
                    }
            }

        public static void main(String[] args)
            {
                System.out.println("\nExercice 8:");
                
                Bibliotheque maBibliotheque = new Bibliotheque();
                
                Livre livre1 = new Livre("L'Étranger", "Albert Camus", 1942);
                Livre livre2 = new Livre("Germinal", "Émile Zola", 1885);
                
                maBibliotheque.ajouterLivre(livre1);
                maBibliotheque.ajouterLivre(livre2);
                
                maBibliotheque.afficherTous();
            }
    }