import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner n =new Scanner(System.in);
        String name = n.next();

        String color = n.next();
        n =new Scanner(System.in);
        int price = Integer.parseInt(n.next());
        FruitDetails f = new FruitDetails(name, color, price);
        System.out.println("Name: " + f.getName());
        System.out.println("Color: " + f.getColor());
        System.out.println("Price: " + f.getPrice());
        name = n.next();
        color = n.next();
        price = n.nextInt();
        f.setColor(color);
        f.setName(name);
        f.setPrice(price);
    }
}
