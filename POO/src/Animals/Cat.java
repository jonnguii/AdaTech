package Animals;

public class Cat extends Animal {


    public Cat(String name, String color, double weight, int height) {
        super(name, color, weight, height);
    }

    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
