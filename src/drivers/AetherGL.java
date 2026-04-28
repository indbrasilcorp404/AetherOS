package src.drivers;

/**
 * AetherGL - Driver de Aceleração Gráfica para AetherOS.
 * Focado em renderização GUI pura e alta performance.
 */
public class AetherGL implements AetherDriver {
    private boolean isRunning;
    private String status = "STANDBY";

    @Override
    public String getDriverName() {
        return "AetherGL Video Driver";
    }

    @Override
    public void initialize() {
        this.isRunning = true;
        this.status = "GUI_ACCELERATED";
        System.out.println("[AetherGL] Inicializando Pipeline Gráfico...");
        System.out.println("[AetherGL] Modo: GUI Puro ativado (Zero CLI Latency).");
    }

    public void render(String object) {
        if (isRunning) {
            System.out.println("[GPU] Renderizando: " + object);
        }
    }

    @Override
    public void stop() {
        this.isRunning = false;
        System.out.println("[AetherGL] Pipeline gráfico encerrado.");
    }

    @Override
    public boolean isFunctional() {
        return isRunning;
    }
}
