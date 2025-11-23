public class Calculateur
    {
        public void CalculerSomme(int[] nombres)
            {
                int somme = 0;
                for (int nombre : nombres)
                    {
                        somme += nombre;
                    }
            }
        public void CalculerProduit(float[] nombres)
            {
                float produit = 1;
                for (int nombre : nombres)
                    {
                        produit *= nombre;
                    }
            }
        public void CalculerMoyenne(double[] nombres)
            {
                int nombre : nombres;
                double moyenne = (double) somme / nombres.length;
            }
        public void Afficher(nombres,nombre, moyenne, produit, somme)
            {
                System.out.println("Somme : " + somme);
                System.out.println("Moyenne : " + moyenne);
                System.out.println("Produit : " + produit);
            }
    }