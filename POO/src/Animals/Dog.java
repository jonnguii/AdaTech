package Animals;

public class Dog extends Animal {


    public Dog(String name, String color, int weight, int height) {
        super(name, color, weight, height);
    }

    @Override
    public void soar() {
        System.out.println("AU AU");
    }

    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) { //referencia

        switch (acao) {
            case "carinho": this.stateOfMind = "feliz";
                break;
            case "senta": this.stateOfMind = "obediente e curioso";
                break;
            default: this.stateOfMind = "neutro";
        }
        return this.stateOfMind;
    }

//        if (acao.equalsIgnoreCase("carinho")) {
//            return this.stateOfMind = "feliz";
//        } else if (acao.equalsIgnoreCase("senta")){
//            this.stateOfMind = "obediente e curioso";
//        }else {
//            this.stateOfMind = "neutro";
//        }
//        return stateOfMind;
//    }
    }

