import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Contraseña contraseña = new Contraseña();

        Temperatura validarTemp = new Temperatura();

        int opcion;
        try{
            System.out.println("-------ELIJE UN PROBLEMA-------");
            System.out.println("1. Contraseña");
            System.out.println("2. Temperatura");
            opcion = Integer.parseInt(br.readLine());

            switch(opcion){
                case 1:
                    contraseña.validarContraseña();
                    break;
                case 2: validarTemp.ejecutar();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}