/**
 * La clase Portero representa a un jugador de fútbol que ocupa la posición de portero.
 * Portero es una subclase de la clase Jugador.
 */
public class Portero extends Jugador {
    // Atributos adicionales
    private int paradasE; // El número de paradas realizadas por el portero.
    private int golesR;   // El número de goles recibidos por el portero.

    /**
     * Constructor de la clase Portero.
     *
     * @param nombre      El nombre del portero.
     * @param pais        El país de origen del portero.
     * @param faltas      El número de faltas cometidas por el portero.
     * @param directGoals El número de goles directos marcados por el portero.
     * @param totalshoots El número total de tiros realizados por el portero.
     * @param paradasE    El número de paradas realizadas por el portero.
     * @param golesR      El número de goles recibidos por el portero.
     */
    public Portero(String nombre, String pais, int faltas, int directGoals, int totalshoots, int paradasE, int golesR) {
        super(nombre, pais, faltas, directGoals, totalshoots);
        this.paradasE = paradasE;
        this.golesR = golesR;
    }

    /**
     * Obtiene el número de paradas realizadas por el portero.
     *
     * @return El número de paradas realizadas por el portero.
     */
    public int getParadas() {
        return paradasE;
    }

    /**
     * Obtiene el número de goles recibidos por el portero.
     *
     * @return El número de goles recibidos por el portero.
     */
    public int getRecibidos() {
        return golesR;
    }

    /**
     * Calcula la efectividad del portero en base a sus paradas, goles recibidos, goles directos y tiros realizados.
     *
     * @return El valor de efectividad del portero como un porcentaje.
     */
    public double calcEfectividad() {
        double val = 0;
        try {
            val = ((paradasE - golesR) * 100 / (paradasE + golesR)) + directGoals * 100 / totalShoots;
        } catch (Exception e) {
            val = 0;
        }
        return val;
    }

    /**
     * Devuelve una representación en cadena del portero, incluyendo su nombre, país, faltas, goles directos,
     * tiros realizados, paradas y goles recibidos.
     *
     * @return Una cadena que representa al portero.
     */
    public String toString() {
        return "Nombre: " + nombre +
               " ,Pais: " + pais +
               " ,Faltas: " + faltas +
               " ,DirectGoals: " + directGoals +
               " ,Totalshoots: " + totalShoots +
               " ,ParadasE: " + paradasE +
               " ,GolesR: " + golesR;
    }
}
