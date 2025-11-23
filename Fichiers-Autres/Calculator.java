public class Calculator
    {
        public int add(int premierNombre, int secondNombre)
            {
                return premierNombre + secondNombre;
            }

        public int subtract(int premierNombre, int secondNombre)
            {
                return premierNombre - secondNombre;
            }

        public int multiply(int premierNombre, int secondNombre)
            {
                return premierNombre * secondNombre;
            }

        public int divide(int premierNombre, int secondNombre)
            {
                if (secondNombre == 0)
                    {
                        throw new IllegalArgumentException("Impossible de diviser par zéro.");
                    }
                return premierNombre / secondNombre;
            }
    }
