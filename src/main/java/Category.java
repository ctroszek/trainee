public enum Category {

    FRUITS("fruits"), DISH("dish"),
    VEGETABLE("vegetable"), SUSHI("sushi"),
    SPICE("spice"), INGREDIENT("ingredient");

    public final String nameCategory;

    Category(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
