package animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public String makeSound() {
                return null;
            }
        };

    }
}
