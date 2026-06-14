class Book {
    private String title;
    private String auther;
    private double price;

    Book(String t, String a, double p) {
        title = t;
        auther = a;
        price = p;
    }

    public void setPrice(double p) {
        if (p > 0) {
            price = p;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuther() {
        return auther;
    }

    public void DisplayBook() {
        System.out.println("title:" + title);
        System.out.println("auther :" + auther);
        System.out.println("price:Ksh " + price);

    }

}

public class Library {
    public static void main(String[] args) {

        Book b1 = new Book("oop1", "pharese kavee", 1500.00);
        Book b2 = new Book("java", "fredric othiambo", 122.50);
        Book b3 = new Book("propability", "john anthony", 1200.00);

        b1.display();
        b2.display();
        b3.display();

        // Increase price of one book using setter
        b2.setPrice(1700); // new price for java

        System.out.println("After updating price of b2:\n");

        // Display updated details
        b1.display();
        b2.display();
        b3.display();
    }

}
