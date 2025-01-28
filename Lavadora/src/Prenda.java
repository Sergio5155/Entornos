public class Prenda {
    private String tipo;
    private String color;
    private int peso;
    private String nivelSuciedad;

    public Prenda(String tipo, String color, int peso, String nivelSuciedad) {
        this.tipo = tipo;
        this.color = color;
        this.peso = peso;
        this.nivelSuciedad = nivelSuciedad;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public String obtenerColor() {
        return color;
    }

    public int obtenerPeso() {
        return peso;
    }

    public String obtenerNivelSuciedad() {
        return nivelSuciedad;
    }

    public void setSuciedad(String nivelNuevo) {
        this.nivelSuciedad = nivelNuevo;
    }
}
