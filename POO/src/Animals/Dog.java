package Animals;

public class Dog {

    public String name;
    public String color;
    public int height;
    public double weight;
    public int tailSize;
    public String stateOfMind;

    public void comer(){}
    public void latir() {
        System.out.println("Au, au!");
    }
    public String pegar() {
        return "bolinha";
        }

    public String interagir (String acao) { //referencia
        if (acao.equalsIgnoreCase("carinho")) {
            return this.stateOfMind = "feliz";
        } else if (acao.equalsIgnoreCase("senta")){
            this.stateOfMind = "obediente e curioso";
        }else {
            this.stateOfMind = "neutro";
        }
        return stateOfMind;
    }
    }

