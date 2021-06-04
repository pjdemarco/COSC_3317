import java.util.Scanner;

public class InvoiceTest {
    Scanner scanner = new Scanner(System.in);
    Invoice inv = new Invoice("12345", "Processor", 0, 0);

    public static void main(String[] args) {
        InvoiceTest invoiceTest = new InvoiceTest();
        invoiceTest.actions();
    }

    public void actions() {
        System.out.println("-------------------------------------");
        System.out.println("Choose an Action: ");
        System.out.println("Press 1 to View Part Number.");
        System.out.println("Press 2 to Change Part Number.");
        System.out.println("Press 3 to View Part Description.");
        System.out.println("Press 4 to Change Part Description.");
        System.out.println("Press 5 to View Part Quantity.");
        System.out.println("Press 6 to Change Part Quantity.");
        System.out.println("Press 7 to View Part Price.");
        System.out.println("Press 8 to Change Part Price.");
        System.out.println("Press 9 to Get Total Invoice Amount.");
        System.out.println("Press 0 to Exit.");

        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice < 0 || choice > 9) {
            System.out.println("Invalid Selection...");
            actions();
        } else if (choice == 0) {
            System.exit(0);
        } else if (choice == 1) {
            System.out.println("Part Number: " + inv.getPartNumber());
            actions();
        } else if (choice == 2) {
            System.out.println("Enter new Part Number.");
            String pn = scanner.nextLine();
            inv.setPartNumber(pn);
            System.out.println("Entered: " + inv.getPartNumber());
            actions();
        } else if (choice == 3) {
            System.out.println("Part Description: " + inv.getPartDescription());
            actions();
        } else if (choice == 4) {
            System.out.println("Enter new Part Description.");
            String pd = scanner.nextLine();
            inv.setPartDescription(pd);
            System.out.println("Entered: " + pd);
            actions();
        } else if (choice == 5) {
            System.out.println("Part Quantity: " + inv.getQuantity());
            actions();
        } else if (choice == 6) {
            System.out.println("Enter part quantity.");
            int qty = scanner.nextInt();
            inv.setQuantity(qty);
            System.out.println("Part Quantity set to: " + inv.getQuantity());
            actions();
        } else if (choice == 7) {
            System.out.println("Part Price: $" + inv.getPrice());
            actions();
        } else if (choice == 8) {
            System.out.println("Enter new Part Price: ");
            double pr = scanner.nextDouble();
            inv.setPrice(pr);
            System.out.println("Part Price set to: $" + inv.getPrice());
            actions();
        } else {
            System.out.println("Total Invoice Amount: $" + inv.getInvoiceAmount());
            actions();
        }
    }
}
