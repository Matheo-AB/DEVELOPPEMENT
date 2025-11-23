import java.util.ArrayList;

public class Etang
    {
        private ArrayList<Canard7> listeDeCanards; 

        public Etang()
            {
                this.listeDeCanards = new ArrayList<Canard7>();
            }

    public void ajouterCanard(Canard7 c)
        {
            this.listeDeCanards.add(c);
            System.out.println(c.getCouleur() + " a rejoint l'étang.");
        }

    public void cancanerTous()
        {
            System.out.println("\nL'étang fait du bruit :\n");
            for (Canard7 canard : this.listeDeCanards)
                {
                    System.out.print(canard.getCouleur() + " : ");
                    canard.cancaner();
                }
        }
    
    public static void main(String[] args)
        {
            System.out.println("\nExercice 7:\n");
            
            Etang monEtang = new Etang();
            
            Canard7 c1 = new Canard7("Canard Bleu");
            Canard7 c2 = new Canard7("Canard Rose");
            Canard7 c3 = new Canard7("Canard Blanc");
            
            monEtang.ajouterCanard(c1);
            monEtang.ajouterCanard(c2);
            monEtang.ajouterCanard(c3);

            monEtang.cancanerTous();
        }
    }