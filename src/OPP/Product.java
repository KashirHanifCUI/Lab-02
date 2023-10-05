package OPP;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 1;
    private Date manufacturingDate;

    public Product(String name,double price,int quantity,Date manufacturingDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.id = counter++;
       this.manufacturingDate = manufacturingDate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public void setManufacturingDate() {

    }

    public String toString() {
        String productDetails = String.format("%04d\t%-20s%,.2f\t%d %s",id,name,price,quantity,manufacturingDate);
        return productDetails;
    }
    public Product getLatestDate(Product p1, Product p2) {
        Date temp =  manufacturingDate.isGreater(p1.manufacturingDate,p2.manufacturingDate);
        if(temp == p1.manufacturingDate)
            return p1;
        else
            return p2;
    }
}
