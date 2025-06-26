public class FunctionReturn {
    public static void main(String[] args) {
        int resultado1 = somaEMulti(2, 10, 1);
        System.out.println(resultado1);

    }
    public static int somaEMulti (int a,int b, int c) {
        return a + b * c;

    }
}
