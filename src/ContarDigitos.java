import java.math.BigInteger;

public class ContarDigitos {

    BigInteger numero;
    int pares;
    int impares;

    public ContarDigitos(BigInteger numero){
        this.numero = numero;
        this.pares = 0;
        this.impares = 0;
    }

    public void contarDigitos(){
        String numeros = numero.toString();

        for(int i = 0; i < numeros.length();i++){
            if(Integer.parseInt(String.valueOf(numeros.charAt(i))) % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("Cantidad de pares: "+pares);
        System.out.println("Cantidad de impares: "+impares);

    }

}
