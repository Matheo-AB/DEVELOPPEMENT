public class TextTools
    {
        public String reverse(String input)
            {
                String out = "";
                for (int i = 0; i < input.length(); i++)  // BUG ICI ?
                    {
                        out = input.charAt(i) + out;
                    }
                return out;
            }
        public String toUpper(String input)
            {
                String result = "";
                for (char c : input.toCharArray()) // BUG ICI ?
                    {
                        result += Character.toUpperCase(c);
                    }
                return result;
            }
    }