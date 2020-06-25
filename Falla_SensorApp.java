/*
 * Diseñe e implemente una clase denominada Codigo_FallasApp que contenga
los siguientes atributos:
- Nombre del sensor de tipo String y
- numero de falla de tipo int;
e implemente, los metodos get, set y toString; un constructor sobrecargado,
y otro constructor que permita inicializar las variables de la clase;
adicionalmente, implemente, dos metodos especiales:
- Detectar_Fallas(int numero_falla); se detecta fallas, si el numero de fallas
detectado son numeros flotantes, el numero de falla es cero, es decir no hay falla.
- Informar_Numero_Fallas(int numero_falla); se informa sobre el numero de fallas,
considerando que si el informe es cero, significa que no hay fallas en el sensor.
 */
package falla_sensorapp;

/**
 *
 * @author VEGA MASAPANTA JESSICA MARIBEL
 */
class Falla {

    //Atributos
    private String nombre_sensor;
    private int numero_falla;

    //Constructores
    public Falla(String nombre_sensor){
        this(nombre_sensor,0); //Sobrecarga
    }

    public Falla(String nombre_sensor, int numero_falla){
        this.nombre_sensor = nombre_sensor;
        //Si el numero_falla es menor que cero, le ponemos a cero.
        if (numero_falla < 0){
           this.numero_falla= 0;
        }  else {
              this.numero_falla= numero_falla;
        }
    }

    //Métodos
    public void setNombre_Sensor(String nombre_sensor){ //Set,  modifica o almacena el valor en la variable.
         this.nombre_sensor= nombre_sensor;
    }
    public String getNombre_Sensor(){  //get, muestra o extrae el valor del dato.
       return nombre_sensor;
    }

    public void setNumero_Falla (int numero_falla) {
          this.numero_falla= numero_falla;
    }
    public int getNumero_Falla(){
         return numero_falla;
    }

   /**
    * Detectar numero de fallas,
    * solo si es positovo el numero_falla
    */

    public void Detectar_Fallas(int numero_falla){
       if(numero_falla > 0){
           this.numero_falla += numero_falla;
       } //numero_falla += numero_falla+falla
    }

    /**
     * Informar numero_falla, si se ingresara un valor negativo
     * se quedaria en cero.
     */

    public void Informar_Numero_Fallas(int numero_falla){
        if (numero_falla < 0){
           this.numero_falla = numero_falla;
        } else{
           this.numero_falla -=numero_falla;
        }//numero_falla =numero_falla-numero_falla
    }

    /**
     * Devuelve el estado del objeto
     *
     * @return
     */

    @Override
    public String toString(){
       return "El sensor de " + nombre_sensor +  " tiene " + numero_falla +
               " fallas encontradas " ;
    }
}

//Clase ejecutable
public class Falla_SensorApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Falla sensor_1=new Falla(" Temperatura ");
       Falla sensor_2=new Falla(" Oxígeno ", 3);

       //Detectar las fallas del sensor
       sensor_1.Detectar_Fallas(4);
       sensor_2.Detectar_Fallas(6);

       //Informar las fallas del sensor
       sensor_1.Informar_Numero_Fallas(4);
       sensor_2.Informar_Numero_Fallas(7);

       //Presentación de infromación de las fallas encontradas
         System.out.println(sensor_1);// 0 fallas
         System.out.println(sensor_2); // 2 fallas
    }
}
