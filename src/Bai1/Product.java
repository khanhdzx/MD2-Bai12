package Bai1;

public class Product {
    private int id;
    private String nameOfProduct;
    private double price;

    public Product() {
    }

    public Product(int id, String nameOfProduct, double price) {
        this.id = id;
        this.nameOfProduct = nameOfProduct;
        this.price = price;
    }

    public Product(Product product) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nSản phẩm{" +
                "Thứ tự =" + id +
                ", Tên Sản Phẩm='" + nameOfProduct + '\'' +
                ", Giá bán=" + price +
                "}\n";
    }

}
