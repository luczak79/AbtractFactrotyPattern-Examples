package Example1;

public class Clinet {
    public static void createFurniture(FurnitureFactory furnitureFactory) {
        Chair chair = furnitureFactory.createChair();
        Table table = furnitureFactory.createTable();
        chair.sit();
        table.eat();
    }

    public static void main(String[] args) {
        System.out.println("Creating modern furniture.");
        createFurniture(new ModernFurnitureFactory());
        System.out.println("\nCreating vintage furniture.");
        createFurniture(new VintageFurnitureFactory());
    }
}
