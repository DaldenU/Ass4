public class Main {
    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        Product product1 = factory1.createProduct();
        product1.display(); // Output: This is Concrete Product 1

        Factory factory2 = new ConcreteFactory2();
        Product product2 = factory2.createProduct();
        product2.display(); // Output: This is Concrete Product 2
    }
}
