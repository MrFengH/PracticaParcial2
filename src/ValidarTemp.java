public class ValidarTemp {
    double temperatura[];
    double promTemp;
    double maxTemp;
    double minTemp;
    int dias;

    public ValidarTemp(int dias, double temperatura[]){
        this.dias = dias;
        this.temperatura = temperatura;
    }

    public void calculartemperatura(){

        minTemp = temperatura[0];
        maxTemp = temperatura[0];
        for(int i = 1; i < dias; i++){
            if(temperatura[i] < minTemp){
                minTemp = temperatura[i];
            }
            if(temperatura[i] > maxTemp){
                maxTemp = temperatura[i];
            }
        }

        int contador = 0;
        double suma = 0;
        for(int i = 0; i<dias;i++){
            contador++;
            suma += temperatura[i];
        }

        promTemp = suma/contador;

        System.out.println("Temperatura máxima: "+maxTemp+"°C");
        System.out.println("Temperatura mínima: "+minTemp+"°C");
        System.out.println("Promedio de temperatura: "+promTemp+"°C");
    }
}
