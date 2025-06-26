import Animals.Dog;
import Training.HumorDoDia;
import Training.Pessoa;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Dog cachorro1 = new Dog();

        cachorro1.name = "Billy";
        cachorro1.color = "Black";
        cachorro1.height = 30;
        cachorro1.weight = 20.5;
        cachorro1.tailSize = 20;

        cachorro1.latir();
        System.out.println(cachorro1.pegar());

        System.out.println(cachorro1.interagir("carinho"));
        */
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 19;
        pessoa1.genero = "Masculino";

        /* System.out.println("Como está o clima hoje? ");
        String clima = scanner.nextLine();
        String humor = pessoa1.definirHumor(clima);

        System.out.println(pessoa1.nome + " está se sentindo " + humor + ", pois está " + clima);
        */

        System.out.println("Como está o clima hoje? ");
        String clima = scanner.nextLine();
        String humor = HumorDoDia.medirHumor(clima);

        System.out.println(pessoa1.nome + " está se sentindo " + humor + ", pois está " + clima + " hoje");
        }
    }
