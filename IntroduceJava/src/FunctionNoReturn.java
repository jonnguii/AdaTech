public class FunctionNoReturn {
    public static void main(String[] args) {
        String cumprimento = ("Belezas?");
        saudacao();
        cumprimento();

        int teste = somar(50, 2);
        System.out.println(teste);
    }

    public static void saudacao() {
        System.out.println("Hello, Billy!");
    }

    public static void cumprimento() {
        System.out.println("Belezas?");
    }

    public static int somar(int a, int b) {
        return a + b;
    }
}