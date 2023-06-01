import java.util.Scanner;

class UppercaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        // Takes the string as input
        String a = sc.nextLine();
        int b = UppercaseLetter(a);
        System.out.println("Number of Uppercase letters Present in String: " + b);
    }

    // Make a function name UppercaseLetter
    public static int UppercaseLetter(String a) {
        int b = 0;

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                b++;
            }
        }

        return b;
    }
}
