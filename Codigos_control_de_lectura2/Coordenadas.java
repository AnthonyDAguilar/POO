Coordenadas.java
public class Coordenadas {
    public double latitud;
    public double longitud;
    
    public double calcular_distancia(Coordenadas otra) {
        double distancia = Math.sqrt(Math.pow((otra.latitud - this.latitud), 2) + Math.pow((otra.longitud - this.longitud), 2));
        return distancia;
    }
    
    public double calcular_altura(double altura1, double altura2) {
        return Math.abs(altura1 - altura2);
    }
}
