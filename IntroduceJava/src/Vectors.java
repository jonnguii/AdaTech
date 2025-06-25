import java.util.Arrays;

public class Vectors {
    public static void main(String[] args) {
        int [] numeros = {10, 12, 33, 64, 5};

        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) { //percorre os 5 indices do vetor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media = media + numeros[i];
            System.out.println(media);
        }
        System.out.println("O maior numero é: " + maior);
        System.out.println("O menor numero é: " + menor);
        System.out.println("A media dos numeros é: " + media/ numeros.length);

        /* String[] letras = {"A", "B", "F", "J", "Z"};
        for (int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);

            System.out.println(Arrays.toString(letras));
        } */
    }
}