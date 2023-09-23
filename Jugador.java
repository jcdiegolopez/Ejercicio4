/**
 * La clase Jugador representa a un jugador de fútbol.
 */
public class Jugador {
    protected String nombre; // El nombre del jugador.
    protected String pais;   // El país de origen del jugador.
    protected int faltas;    // El número de faltas cometidas por el jugador.
    protected int directGoals; // El número de goles directos marcados por el jugador.
    protected int totalShoots; // El número total de tiros realizados por el jugador.

    /**
     * Constructor de la clase Jugador.
     *
     * @param nombre       El nombre del jugador.
     * @param pais         El país de origen del jugador.
     * @param faltas       El número de faltas cometidas por el jugador.
     * @param directGoals  El número de goles directos marcados por el jugador.
     * @param totalShoots  El número total de tiros realizados por el jugador.
     */
    public Jugador(String nombre, String pais, int faltas, int directGoals, int totalShoots) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.directGoals = directGoals;
        this.totalShoots = totalShoots;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return El nombre del jugador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el país de origen del jugador.
     *
     * @return El país de origen del jugador.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Obtiene el número de faltas cometidas por el jugador.
     *
     * @return El número de faltas cometidas por el jugador.
     */
    public int getFaltas() {
        return faltas;
    }

    /**
     * Obtiene el número de goles directos marcados por el jugador.
     *
     * @return El número de goles directos marcados por el jugador.
     */
    public int getDirect() {
        return directGoals;
    }

    /**
     * Obtiene el número total de tiros realizados por el jugador.
     *
     * @return El número total de tiros realizados por el jugador.
     */
    public int getShoots() {
        return totalShoots;
    }
}
