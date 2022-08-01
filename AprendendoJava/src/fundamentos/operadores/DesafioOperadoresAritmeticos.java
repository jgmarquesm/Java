package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {

    public static void main(String[] args) {

        /*
        Resolver a expressão: (((6*(3+2))²/(3*2))-(((1-5)*(2-7))/(2))²)³/10³;
        a = 6*(3+2);
        b = 3*2;
        c = (1-5)*(2-7))/2
        d = 10^3
        */

        int a = 6*(3+2);
        double a2 = Math.pow(a, 2);
        int b = 3*2;
        int c = (1-5)*(2-7)/2;
        double c2 = Math.pow(c, 2);
        int d = (int) Math.pow(10, 3);
        double upside = a2/b - c2;
        double upside3 = Math.pow(upside, 3);

        var exp = upside3/d;

        System.out.println(exp);


    }
}
