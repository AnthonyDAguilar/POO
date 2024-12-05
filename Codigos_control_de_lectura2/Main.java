Main.java
public class Main {
    public static void main(String[] args) {
        Dron dron = new Dron();
        dron.altura_max = 120;
        dron.despegar();
        dron.volarA(100);
        
        Coordenadas coordenadas1 = new Coordenadas();
        coordenadas1.latitud = -0.1807;
        coordenadas1.longitud = -78.4678;
        
        Coordenadas coordenadas2 = new Coordenadas();
        coordenadas2.latitud = -1.8312;
        coordenadas2.longitud = -78.1834;
        
        double distancia = coordenadas1.calcular_distancia(coordenadas2);
        System.out.println("Distancia entre coordenadas: " + distancia);
        
        Controlador controlador = new Controlador();
        controlador.nombre = "Controlador 1";
        controlador.mover_dronA(dron, 150);
        controlador.conectar_dron(dron);
        
        Mision mision = new Mision();
        mision.setId_mision("Mision123");
        mision.iniciar_mision();
        mision.finalizar_mision();
        
        Reporte reporte = new Reporte();
        reporte.setId_reporte("Reporte123");
        reporte.generar_reporte(mision.getId_mision(), mision.getEstado());
        reporte.imprimir_reporte();
    }
}

