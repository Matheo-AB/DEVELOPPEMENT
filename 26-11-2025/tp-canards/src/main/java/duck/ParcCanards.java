package duck;

import java.util.ArrayList;
import java.util.List;

public class ParcCanards
    {
        private List<Canard> canards = new ArrayList<>();
        /** TODO : documenter */
        
        public void ajouter(Canard c)
            {
                canards.add(c);
            }
        /** TODO : documenter */

        public int compterCanardsFlottants()
            {
                int n = 0;
                for (Canard c : canards)
                    {
                        if (c.flotte()) n++;
                    }
                return n;
            }
            /** TODO : documenter */
        public boolean estVide()
            {
                return canards.size() == 0;
            }
        /** TODO : documenter */
        public List<Canard> getCanards()
            {
                return canards;
            }
    }