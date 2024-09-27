import java.util.Objects;
import java.util.Scanner;

public class Activat3 {
    static final int NUMBER = 12;
    static  final  String NAME= "Rustam";

    public static void main(String[] args) {
        System.out.println("I use someimmutable value " + NUMBER);
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        int number = scanner.nextInt();
        System.out.println(title + NAME);
        if ((Objects.equals(title, NAME)) && (number > NUMBER)){ //and
            System.out.println("!");
        } else if ((Objects.equals(title, NAME)) || (number == NUMBER)){ // or
            System.out.println("!!");
        }




    }
}
