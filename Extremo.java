/**
 * La clase Extremo representa a un jugador de fútbol que ocupa la posición de extremo.
 * Extremo es una subclase de la clase Jugador.
 */
public class Extremo extends Jugador {
    private int pases;          // El número de pases realizados por el extremo.
    private int asistenciasE;   // El número de asistencias realizadas por el extremo.

    /**
     * Constructor de la clase Extremo.
     *
     * @param nombre        El nombre del extremo.
     * @param pais          El país de origen del extremo.
     * @param faltas        El número de faltas cometidas por el extremo.
     * @param directGoals   El número de goles directos marcados por el extremo.
     * @param totalshoots   El número total de tiros realizados por el extremo.
     * @param pases         El número de pases realizados por el extremo.
     * @param asistenciasE  El número de asistencias realizadas por el extremo.
     */
    public Extremo(String nombre, String pais, int faltas, int directGoals, int totalshoots, int pases, int asistenciasE) {
        super(nombre, pais, faltas, directGoals, totalshoots);
        this.pases = pases;
        this.asistenciasE = asistenciasE;
    }

    /**
     * Obtiene el número de pases realizados por el extremo.
     *
     * @return El número de pases realizados por el extremo.
     */
    public int getPases() {
        return pases;
    }

    /**
     * Obtiene el número de asistencias realizadas por el extremo.
     *
     * @return El número de asistencias realizadas por el extremo.
     */
    public int getAsistencias() {
        return asistenciasE;
    }

    /**
     * Calcula la efectividad del extremo en base a sus pases, asistencias, faltas, goles directos y tiros realizados.
     *
     * @return El valor de efectividad del extremo como un porcentaje.
     */
    public double calcEfectividad() {
        double val = 0;
        try {
            val =  ((pases + asistenciasE - faltas) * 100 / (pases + asistenciasE + faltas)) + directGoals * 100 / totalShoots;            
        } catch (Exception e) {
            val = 0;
        }
        return val;
    }

    /**
     * Devuelve una representación en cadena del extremo, incluyendo su nombre, país, faltas, goles directos,
     * tiros realizados, pases y asistencias.
     *
     * @return Una cadena que representa al extremo.
     */
    public String toString() {
        return "Nombre: " + nombre +
               " ,Pais: " + pais +
               " ,Faltas: " + faltas +
               " ,DirectGoals: " + directGoals +
               " ,Totalshoots: " + totalShoots +
               " ,Pases: " + pases +
               " ,AsistenciasE: " + asistenciasE;
    }
}
