public class ConditionalStructures {
    public static void main(String[] args) {

        /*
        float nota = 5.5f;
        nota = 8.0f;
        if (nota <= 6.0) {
            System.out.println("Aluno Reprovado");
        } else {
            System.out.println("Aluno Aprovado");
        }
        */
        int nota2 = -65;
        String aprovacao = "";
        //Aprovação A = 80, B = 70, C = 40, D = 0

        if (nota2 >= 80) {
            System.out.println("Aprovação A");
        } else if (nota2 >= 70 && nota2 < 80) {
            System.out.println("Aprovação B ");
        } else if (nota2 >= 40 && nota2 < 70) {
            System.out.println("Aprovação C ");
        } else if (nota2 < 40 && nota2 >= 0 || nota2 < 0) {
            System.out.println("Aprovação D ");
        }

        if (nota2 >= 80) {
            aprovacao = "A";
        } else if (nota2 >= 70 && nota2 < 80) {
            aprovacao = "B";
        } else if (nota2 >= 40 && nota2 < 70) {
            aprovacao = "C";
        } else if (nota2 < 40 && nota2 >= 0 || nota2 < 0) {
            aprovacao = "D";
        }

        switch (aprovacao) {
            case "A":
            case "B":
            case "C":
                System.out.println("Aluno Aprovado");
                break;
            case "D":
                System.out.println("Aluno Reprovado");
                break;
            default:
                System.out.println("Entrada Inválida");
        }

    }
}