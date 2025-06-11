public class ValidarFecha {

    String fecha;
    boolean bisiesto = false;
    int año;
    int dia;
    int mes;
    boolean diaValido = false;
    boolean mesValido = false;
    int limiteDeDias;

    public ValidarFecha(String fecha){
        this.fecha = fecha;
    }

    public void validarFecha(){

        String token[] = fecha.split("/");

        dia = Integer.parseInt(token[0]);
        mes = Integer.parseInt(token[1]);
        año = Integer.parseInt(token[2]);

        if((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)){
            bisiesto = true;
        }
        if(mes > 12 || mes < 1){
            throw new IllegalArgumentException("Mes Inválido.");
        }
        if(mes <= 7){
            if(mes % 2 != 0){
                limiteDeDias = 31;
            }else{
                limiteDeDias = 30;
            }
        }
        if(mes >= 8){
            if(mes % 2 != 0){
                limiteDeDias = 30;
            }else{
                limiteDeDias = 31;
            }
        }
        if(mes == 2){
            limiteDeDias = 28;
        }
        if(bisiesto == true && mes == 2){
            limiteDeDias = 29;
        }
        if(dia > limiteDeDias || dia < 1){
            throw new IllegalArgumentException("Día Inválido.");
        }

        System.out.println("Fecha Válida.");
    }

}
