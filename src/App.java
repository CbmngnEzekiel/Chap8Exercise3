import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Food> foodList = new ArrayList<>();
        Food hamburger = new Food("hamburger", 1.85, 9, 33, 1);
        Food salad = new Food("salad", 2.00, 1, 11, 5);
        Food frenchFries = new Food("french fries", 1.30, 11, 36, 4);
        Food soda = new Food("soda", 0.95, 0, 38, 0);

        foodList.add(hamburger);
        foodList.add(salad);
        foodList.add(frenchFries);
        foodList.add(soda);
        
        int quantity = 0;
        double total = 0;

        clearScreen();
        
        System.out.printf("%-8s\t\t%s\t%s\t%s\t%s\n", "Item", "Price", "Fat(g)", "Carbohydrates(g)", "Fiber(g)");
        foodList.forEach((n) -> {
            System.out.printf("%-8s\t\t%.2f\t%.0f\t%.0f\t\t\t%.0f\n", n.getItem(), n.getPrice(), n.getFat(), n.getCarbs(), n.getFiber());
        });
        
        System.out.print("Enter number of hamburgers: ");
        quantity = sc.nextInt();
        hamburger.displayInfo();
        total += hamburger.getSubtotal(quantity);

        System.out.print("Enter number of salads: ");
        quantity = sc.nextInt();
        salad.displayInfo();
        total += salad.getSubtotal(quantity);

        System.out.print("Enter number of fries: ");
        quantity = sc.nextInt();
        frenchFries.displayInfo();
        total += frenchFries.getSubtotal(quantity);

        System.out.print("Enter number of sodas: ");
        quantity = sc.nextInt();
        soda.displayInfo();
        total += soda.getSubtotal(quantity);
        sc.close();

        System.out.printf("Your order comes to: $%.2f", total);
    }
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }
}
