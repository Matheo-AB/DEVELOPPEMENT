public class Calculator
    {
        public int add(int x, int y)
            {
                int r = x + y; // BUG ICI ?
                return r;
            }
        public int multiply(int x, int y)
            {
                int r = 0;
                for (int i = 0; i <= y; i++) // BUG ICI ?
                    { 
                        r += x;
                    }   
                    return r;
            }
        public int divide(int x, int y) // BUG ICI ?
            { 
                int r = x / y;
                return r;
            }
    }
