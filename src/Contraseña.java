import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Contraseña {
    String contraseña;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public Contraseña(){
    }

    public void validarContraseña(){

        boolean valida = false;
        do {
            try {
                System.out.println("Introduzca la contraseña a validar: ");
                contraseña = br.readLine();
                if (validaciones(contraseña)) {
                    System.out.println("Contraseña válida");
                    valida = true;
                }
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }while(!valida);
    }
    public boolean validaciones(String contraseña){
        if(contraseña.length() >= 8 && mayuscula(contraseña) && numero(contraseña)){
            return true;
        }else{
            throw new IllegalArgumentException("Mínimo 8 carácteres.");
        }
    }

    public boolean mayuscula(String contraseña){

        for(int i = 0; i < contraseña.length(); i++){
            if (Character.isUpperCase(contraseña.charAt(i))){
                return true;
            }
        }
        throw new IllegalArgumentException("Debe contener una mayúscula.");
    }

    public boolean numero(String contraseña){
        for(int i = 0; i < contraseña.length(); i++){
            if (Character.isDigit(contraseña.charAt(i))){
                return true;
            }
        }
        throw new IllegalArgumentException("Debe contener un número.");
    }
}
