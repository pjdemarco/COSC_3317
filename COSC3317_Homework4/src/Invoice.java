public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(String partNumber, String partDescription, int quantity, double price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
            quantity = 0;
            this.quantity = quantity;
        } else {
            this.quantity = quantity;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative.");
            price = 0.0;
            this.price = price;
        }
        this.price = price;
    }

    public double getInvoiceAmount() {
        int quantity = getQuantity();
        double price = getPrice();
        if (quantity < 0) {
            quantity = 0;
        }
        if (price < 0.0) {
            price = 0.0;
        }
        return quantity * price;
    }
}
