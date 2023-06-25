    /*
    *SEGUNDA PARTE:
    - Crear una clase coche.
    - Dentro de la clase coche, una variable numérica que almacene 
        el número de puertas que tiene.
    - Una función que incremente el número de puertas que tiene el coche.
    - Crear un objeto miCoche en el main y añadirle una puerta.
    - Mostrar el número de puertas que tiene el objeto.
    */


public class segundaParte {
    
    public static void main(String[] args) {
        coche miCoche= new coche();
       
       miCoche.incrementarPuertas();
       miCoche.incrementarPuertas();
       miCoche.incrementarPuertas();
       miCoche.incrementarPuertas();
       System.out.println("Mi coche tiene: " + miCoche.puertas +" puertas");
    }
}
    class coche{
        int puertas=0;

        public void incrementarPuertas() {
            this.puertas++;
        }
    }