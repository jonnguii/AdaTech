package Animals;

public class Bird extends Animal {


    public Bird(String name, String color, double weight, int height) {
        super(name, color, weight, height);
    }

    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
}

