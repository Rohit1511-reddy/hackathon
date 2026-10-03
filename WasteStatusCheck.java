 import java.util.Scanner;

public class WasteStatusCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter waste collected in kg: ");
        double wasteCollected = scanner.nextDouble();

        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}
  
    
