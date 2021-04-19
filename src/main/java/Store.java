import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
//    products - все продукты, которые хранятся в магазине
    private Map<String, List<Product>> products = new HashMap<>();
    private List<Product> basket = new ArrayList<>();
//    private List<Product> selectedProduct = new ArrayList<>();

    Product buy(String categoryName, String productName) {
        Product product = null;
        for (Map.Entry<String, List<Product>> categoryWithProducts : products.entrySet()) {
            if(categoryWithProducts.getKey().equals(categoryName)) {
               List<Product> listProducts = categoryWithProducts.getValue();
                for (Product productToBuy : listProducts) {
                    if(productToBuy.getName().equals(productName)) {
                        productToBuy.setRate(productToBuy.getRate() - 1);
                        product = productToBuy;
                    }
                }
            }
        }
        System.out.println(products);
        return product;
    }

    public void addInBasket(Category category, Product product) {
//        buy();
        basket.add(product);
    }

    public void deleteInBasket(Product product) {
        basket.remove(product);
    }

    public void viewBasket() {
        System.out.println(basket);
    }

    public void addProducts(Map<String, List<Product>> products) {
        this.products = products;
    }

    public void viewStore() {
        System.out.println(products);
    }
}
