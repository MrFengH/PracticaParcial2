public class ValidarFecha {

    String fecha;
    boolean bisiesto = false;
    int año;
    String dia;
    String mes;
    boolean diaValido = false;
    boolean mesValido = false;


    public ValidarFecha(String fecha){
        this.fecha = fecha;
    }

    public void validarFecha(){

        String token[] = fecha.split("/");

        dia = token[0];
        mes = token[1];
        año = Integer.parseInt(token[2]);

        if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
            bisiesto = true;
        }
        if(Integer.parseInt(String.valueOf(mes.charAt(0))) == 0){
            if(Integer.parseInt(String.valueOf(mes.charAt(1))) )

        }


    }

}
