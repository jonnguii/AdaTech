public class Booleans {
    public static void main(String[] args) {

        boolean fazSolHoje = true;
        boolean temosDinheiroSobrando = false;
        boolean vamosAPraiaHoje = fazSolHoje && temosDinheiroSobrando;

        System.out.println(vamosAPraiaHoje);



        //OPERADOR && (AND)
        //true && true = true
        //false && true = false
        //true && false = false
        //false && false = false

        //OPERADOR || (OR)
        //true || false = true
        //false || true = true
        //true || false = true
        //false || false = false
    }
}
