import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Temperatura {
    double temperatura[];
    int dias;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void ejecutar(){

        boolean valida = false;
        do {
            try {

                System.out.println("¿Por cuantos días desea registrar?: ");
                dias = Integer.parseInt(br.readLine());
                if (dias <= 0) {
                    throw new NumberFormatException();
                }else{
                    valida = true;
                }
                this.temperatura = new double[dias];
                for (int i = 0; i < dias; i++) {

                    System.out.println("Temperatura del día " + (i + 1));
                    temperatura[i] = Double.parseDouble(br.readLine());

                    if (temperatura[i] < -50 || temperatura[i] > 60) {
                        System.err.println("Introduzca una temperatura entre -50°C y 60°C");
                        i--;
                    }
                }
                ValidarTemp validarTemp = new ValidarTemp(dias, temperatura);
                validarTemp.calculartemperatura();
            } catch (NumberFormatException e) {
                System.err.println("Introduzca un día válido.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }while (!valida);
    }

}
