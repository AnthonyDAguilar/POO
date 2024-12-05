Reporte.java
public class Reporte {
    private String id_reporte;
    
    public void generar_reporte(String idMision, String estado) {
        System.out.println("Generando reporte para la misión: " + idMision + " con estado: " + estado);
    }
    
    public void imprimir_reporte() {
        System.out.println("Reporte impreso: ID " + id_reporte);
    }
    
    public void setId_reporte(String id) {
        this.id_reporte = id;
    }
    
    public String getId_reporte() {
        return id_reporte;
    }
}
