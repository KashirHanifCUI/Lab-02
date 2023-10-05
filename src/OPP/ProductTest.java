package OPP;

public class ProductTest {
    public static void main(String[] args) {
        Product p1=new Product("LCD", 50000, 5,new Date(20,2021,4));
        p1.setManufacturingDate(new Date(17,2023,2));
        Product p2 = new Product("Mobile", 20000,4,new Date(20,2021,3));
        Product p3 = new Product("LED",20000,3,new Date(21,2024,1));

        System.out.println(p1);
        System.out.println("Recent Product is : "+p1.getLatestDate(p3,p1));

    }
}
