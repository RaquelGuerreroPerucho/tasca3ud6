public class SalidaContrasenya {
    private boolean valido;
    private String error;

    public SalidaContrasenya(boolean valido, String error) {
        this.valido = valido;
        this.error = error;
    }

    @Override
    public String toString() {
        return valido + error;
    }
}
