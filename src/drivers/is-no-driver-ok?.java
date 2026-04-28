// Dentro da classe AetherKernel.java
private void loadHardwareModules() {
    System.out.println("Detetando hardware...");
    
    AetherGL gl = new AetherGL();
    gl.initialize(); // Inicia o AetherGL
    
    AetherPower power = new AetherPower();
    power.initialize(); // Inicia o AetherPower
    
    System.out.println("[OK] Todos os módulos de hardware ativos.");
}
