Mision.java
public class Mision {
    private String id_mision;
    private String estado;
    
    public void iniciar_mision() {
        estado = "Iniciada";
        System.out.println("Misión " + id_mision + " iniciada.");
    }
    
    public void finalizar_mision() {
        estado = "Finalizada";
        System.out.println("Misión " + id_mision + " finalizada.");
    }
    
    public String getEstado() {
        return estado;
    }
    
    public void setId_mision(String id) {
        this.id_mision = id;
    }
    
    public String getId_mision() {
        return id_mision;
    }
}
