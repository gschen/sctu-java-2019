package lab_03.Test_09;

public class Book {
    String id;
    String name;
    String edition;
    String price;
    String sale;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", edition='" + edition + '\'' +
                ", price=" + price +
                ", sale=" + sale +
                '}';
    }

    public Book(String id, String name, String edition, String price, String sale) {
        this.id = id;
        this.name = name;
        this.edition = edition;
        this.price = price;
        this.sale = sale;
    }

    public void increase(int increase){
        price+=increase;
    }
}
