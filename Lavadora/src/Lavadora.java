public class Lavadora {
    private String planDeLavado;
    private int capacidad;
    private boolean puertaAbierta;
    private boolean detergenteSuficiente;
    private boolean enProcesoDeLavado;
    private Prenda[] prendas;
    private int prendasDentro;

    public Lavadora(int capacidad, String planLavado) {
        this.capacidad = capacidad;
        this.planDeLavado = planLavado;
        this.prendas = new Prenda[capacidad];
        this.prendasDentro = 0;
        this.puertaAbierta = false;
        this.detergenteSuficiente = false;
        this.enProcesoDeLavado = false;
    }

    public String abrirPuerta() {
        if (!enProcesoDeLavado) {
            puertaAbierta = true;
            return "Puerta abierta.";
        }
        return "No se puede abrir la puerta durante el lavado.";
    }

    public String cerrarPuerta() {
        if (puertaAbierta) {
            puertaAbierta = false;
            return "Puerta cerrada.";
        }
        return "La puerta ya está cerrada.";
    }

    public String añadirDetergente(int cantidad) {
        if (cantidad > 0) {
            this.detergenteSuficiente = true;
            return "Detergente añadido.";
        }
        return "No se ha añadido detergente.";
    }

    public String introducirPrenda(Prenda prenda) {
        if (!puertaAbierta) {
            return "No se puede añadir prendas con la puerta cerrada.";
        }
        if (prendasDentro < capacidad) {
            prendas[prendasDentro] = prenda;
            prendasDentro++;
            return "Prenda añadida.";
        }
        return "La lavadora está llena.";
    }

    public String iniciarLavado() {
        if (puertaAbierta) {
            return "No se puede iniciar el lavado con la puerta abierta.";
        }
        if (prendasDentro == 0) {
            return "No hay prendas en la lavadora.";
        }
        if (!detergenteSuficiente) {
            return "No hay suficiente detergente.";
        }
        enProcesoDeLavado = true;
        return "Lavado en proceso...";
    }

    public String finalizarLavado() {
        if (enProcesoDeLavado) {
            enProcesoDeLavado = false;
            return "Lavado finalizado.";
        }
        return "No hay un lavado en proceso.";
    }

    public String retirarRopa() {
        if (!puertaAbierta) {
            return "Abra la puerta antes de retirar la ropa.";
        }
        if (prendasDentro > 0) {
            prendasDentro = 0;
            return "Ropa retirada.";
        }
        return "No hay ropa para retirar.";
    }

    public String apagar() {
        return "Lavadora apagada.";
    }
}
