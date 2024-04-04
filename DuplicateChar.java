import java.util.Scanner;

public class DuplicateChar {
    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sring:");
        String str = sc.nextLine();
        char[] array = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[j] + " ");
                    break;
                }
            }
        }
    }
}