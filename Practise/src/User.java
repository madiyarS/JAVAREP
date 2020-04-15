import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        UserDetails User = new UserDetails();
        Scanner n =new Scanner(System.in);

        String input = n.next();
        User.setName(input);

        input = n.next();
        User.setEmail(input);// very good code I agree

        System.out.println("Name: " + User.getName());

        System.out.println("Email: " + User.getEmail());
    }
}
