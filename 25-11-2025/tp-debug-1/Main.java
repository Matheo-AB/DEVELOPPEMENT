public class Main
    {
    public static void main(String[] args)
        {
           System.out.println("=== TP Débogage - Partie 1 ===");
            Calculator calc = new Calculator();
            TextTools tools = new TextTools();
            int a = 12;
            int b = 4;
            int resultAdd = calc.add(a, b); // BUG ICI ?
            int resultMul = calc.multiply(a, b); // BUG ICI ?
            int resultDiv = calc.divide(a, b); // BUG ICI ?
            System.out.println("Addition : " + resultAdd);
            System.out.println("Multiplication : " + resultMul);
            System.out.println("Division : " + resultDiv);
            String phrase = "Bonjour tout le monde";
            String reversed = tools.reverse(phrase); // BUG ICI ?
            String upper = tools.toUpper(phrase); // BUG ICI ?
            System.out.println("Phrase inversée : " + reversed);
            System.out.println("Majuscules : " + upper);
            System.out.println("Programme terminé.");
        }
}