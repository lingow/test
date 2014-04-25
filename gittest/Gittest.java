package gittest;

public class Gittest {
    public Gittest() {
        super();
    }

    public static void main(String[] args) {
        Gittest gittest = new Gittest();
        gittest.HelloWorld();
        // This comment was added in the prev branch
    }

    private void HelloWorld() {
        System.out.println("Hello World!");
        System.out.println("Added the feature!");
    }
}
