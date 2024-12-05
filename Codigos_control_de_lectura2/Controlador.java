Controlador.java
public class Controlador {
    public String nombre;
    
    public void mover_dronA(Dron dron, int altura) {
        dron.volarA(altura);
        System.out.println(nombre + " movió el dron a " + altura + " metros.");
    }
    
    public void conectar_dron(Dron dron) {
        System.out.println(nombre + " conectó el dron con ID: " + dron.altura_max);
    }
}
