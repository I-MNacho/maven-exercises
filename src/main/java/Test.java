import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");

        String userInput = sc.nextLine();
        System.out.println(StringUtils.isNumeric(userInput));
        System.out.println(StringUtils.swapCase(userInput));
        System.out.println(StringUtils.reverse(userInput));

    }
}
