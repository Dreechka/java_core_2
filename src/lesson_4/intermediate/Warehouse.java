package lesson_4.intermediate;

public class Warehouse {
    private final String goods;
    private int availableProduct;

    public Warehouse(String goods, int availableProduct) {
        this.goods = goods;
        this.availableProduct = availableProduct;
    }

    public String getGoods() {
        return goods;
    }

    public int getAvailableProduct() {
        return availableProduct;
    }

    public void setAvailableProduct(int availableProduct) {
        this.availableProduct = availableProduct;
    }
}
