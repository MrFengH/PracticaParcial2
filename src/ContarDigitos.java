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

    public int getImpares() {
        return impares;
    }
    public int getPares() {
        return pares;
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

    }

}
