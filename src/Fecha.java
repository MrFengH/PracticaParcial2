import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fecha {

    String fecha;

    public Fecha(){

    }
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void ejecutar(){

        try{
            System.out.println("Introduzca la fecha a validar en formato DD/MM/AAAA (Ej: 01/01/2025): ");
            fecha = br.readLine();
            excepcion(fecha);
            ValidarFecha validarFecha = new ValidarFecha(fecha);
            validarFecha.validarFecha();

        }catch (NumberFormatException e) {
            System.err.println("Introduzca una fecha válida.");
        }catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void excepcion(String fecha){

        if(fecha.length() > 10 || fecha.length() <= 0){
            throw new IllegalArgumentException("Utilice el formato DD/MM/AAAA.");
        }
        if(fecha.charAt(2) != '/' || fecha.charAt(5) != '/' ){
            throw new IllegalArgumentException("Utilice el formato DD/MM/AAAA.");
        }

    }

}
