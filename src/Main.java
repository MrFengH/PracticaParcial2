import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Contraseña contraseña = new Contraseña();

        Temperatura validarTemp = new Temperatura();

        SumaDigitos digitos = new SumaDigitos();

        Fecha validarFecha = new Fecha();
        int opcion;
        try{
            System.out.println("-------ELIJE UN PROBLEMA-------");
            System.out.println("1. Contraseña");
            System.out.println("2. Temperatura");
            System.out.println("3. Contar Digitos");
            System.out.println("4. Validar Fecha");

            opcion = Integer.parseInt(br.readLine());

            switch(opcion){
                case 1:
                    contraseña.validarContraseña();
                    break;
                case 2:
                    validarTemp.ejecutar();
                    break;
                case 3:
                    digitos.ejecutar();
                    break;
                case 4:
                    validarFecha.ejecutar();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}