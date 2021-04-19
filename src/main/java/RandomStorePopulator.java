import com.github.javafaker.Faker;

import java.util.*;


public class RandomStorePopulator {

    Faker faker = new Faker();

    public Map<String, List<Product>> populate() {
        Map<String, List<Product>> products = new HashMap<>();
        List<Product> fruits = new ArrayList<>();
        List<Product> dishs = new ArrayList<>();
        List<Product> sushis = new ArrayList<>();
        List<Product> vegetables = new ArrayList<>();
        List<Product> spices = new ArrayList<>();
        List<Product> ingredients = new ArrayList<>();
        Random random = new Random();


        for (int i = 0; i < 5; i++) {
            fruits.add(new Product(faker.food().fruit(), 5, random.nextInt(100)));
            dishs.add(new Product(faker.food().dish(), 5, random.nextInt(100)));
            sushis.add(new Product(faker.food().sushi(), 5, random.nextInt(100)));
            vegetables.add(new Product(faker.food().vegetable(), 5, random.nextInt(100)));
            spices.add(new Product(faker.food().spice(), 5, random.nextInt(100)));
            ingredients.add(new Product(faker.food().ingredient(), 5, random.nextInt(100)));

        }

        products.put(Category.FRUITS.nameCategory, fruits);
        products.put(Category.DISH.nameCategory, dishs);
        products.put(Category.SUSHI.nameCategory, sushis);
        products.put(Category.SPICE.nameCategory, spices);
        products.put(Category.VEGETABLE.nameCategory, vegetables);
        products.put(Category.INGREDIENT.nameCategory, ingredients);

        return products;
    }

}
