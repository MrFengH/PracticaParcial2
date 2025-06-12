import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumaDigitos {

    BigInteger numero;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public SumaDigitos(){
    }
    public void ejecutar(){
        boolean valido = false;
        do {
            try {

                System.out.println("Introduzca un número entero positivo: ");
                numero = new BigInteger(br.readLine());
                if (numero.compareTo(BigInteger.ZERO) <= 0) {
                    throw new NumberFormatException();
                }
                valido = true;
                ContarDigitos contarDigitos = new ContarDigitos(numero);
                contarDigitos.contarDigitos();
                System.out.println("Cantidad de pares: "+contarDigitos.getPares());
                System.out.println("Cantidad de impares: "+contarDigitos.getImpares());

            } catch (NumberFormatException e) {
                System.err.println("Introduzca un número entero positivo.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while(!valido);
    }

}
