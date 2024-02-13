import java.util.Scanner;

public class ValidationMail {


    public static boolean validerEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(regex);
    }

    public static void main(String[] args) {
        String email ;
              Scanner scanner = new Scanner(System.in);
          System.out.println("entrer un mail ");
          email = scanner.next();
        boolean estValide = validerEmail(email);
        System.out.println(estValide);
    }
}