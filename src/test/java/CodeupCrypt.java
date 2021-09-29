public class CodeupCrypt {

    public static double version;

    public static String hashPassword(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i += 1) {
            switch (Character.toLowerCase(input.charAt(i))) {
                case 'a':
                    output += 4;
                    break;
                case 'e':
                    output += 3;
                    break;
                case 'i':
                    output += 2;
                    break;
                case 'o':
                    output += 0;
                    break;
                case 'u':
                    output += 9;
                    break;
                default:
                    output += input.charAt(i);

            }
        }
        return output;
    }

    public static boolean checkPassword(String hashed, String original) {
        return hashed.equals(hashPassword(original));
    }
}
