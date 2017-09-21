package homework3_4.entity;

public class Goods {
    private int id;
    private String name;
    private double price;
    private String merchant;

    public Goods() {
    }

    public Goods(int id) {
        this.id = id;
    }

    public Goods(int id, String name, double price, String merchant) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.merchant = merchant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", merchant='" + merchant + '\'' +
                '}';
    }

}
