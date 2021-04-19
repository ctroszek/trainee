import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleApp {

    private Product product;
    private Store store;

    public static void main(String[] args) {
        RandomStorePopulator populator = new RandomStorePopulator();
        Map<String, List<Product>> products = populator.populate();

        Store store = new Store();
        store.addProducts(products);
        store.viewStore();

        Scanner scanner = new Scanner(System.in);
        String selectedName = scanner.nextLine();
        String selectedCategory = scanner.nextLine();
//        int selectedRate = scanner.nextInt();
//        int selectedPrice = scanner.nextInt();

//        store.addInBasket();
        store.viewBasket();
    }
}
