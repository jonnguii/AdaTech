import Animals.Bird;
import Animals.Cat;
import Animals.Dog;
import Shops.PetShop;
import Training.HumorDoDia;
import Training.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Dog cachorro1 = new Dog("Billy", "Black", 30, 20);

        Cat gato1 = new Cat("Anastor", "Orange", 20, 15);

        Bird passaro1 = new Bird("Pepsi", "White", 10, 5);

        PetShop petShop = new PetShop();

        petShop.darBanho(passaro1);
        System.out.println(passaro1.getStateOfMind());

        petShop.tosar(cachorro1);
        System.out.println(cachorro1.getStateOfMind());

        petShop.deixarNoHotel(gato1);
        System.out.println(gato1.getStateOfMind());


//        cachorro1.setName("Billy");
//        cachorro1.setColor("Black");
//        cachorro1.setHeight(30);
//        cachorro1.setWeight(20.5);
//        cachorro1.setTailSize(20);

//        System.out.println(cachorro1.getName());
//        System.out.println(cachorro1.getTailSize());
//        cachorro1.latir();
//        System.out.println(cachorro1.pegar());
//
//        System.out.println(cachorro1.interagir("carinho"));

        /*
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 19;
        pessoa1.genero = "Masculino";

        /* System.out.println("Como está o clima hoje? ");
        String clima = scanner.nextLine();
        String humor = pessoa1.definirHumor(clima);

        System.out.println(pessoa1.nome + " está se sentindo " + humor + ", pois está " + clima);


        System.out.println("Como está o clima hoje? ");
        String clima = scanner.nextLine();
        String humor = HumorDoDia.medirHumor(clima);

        System.out.println(pessoa1.nome + " está se sentindo " + humor + ", pois está " + clima + " hoje");
        }
        */

    }
}
