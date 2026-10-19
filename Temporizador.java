public class Temporizador {
    private int minutos;
    private int segundos;

    public Temporizador(int minutos, int segundos) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser negativos");
        }
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Los segundos deben estar entre 1 y 59");
        }
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        if (minutos < 0) {
            throw new IllegalArgumentException("Los minutos no pueden ser negativos");
        }
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        if (segundos < 0 || segundos >= 60) {
            throw new IllegalArgumentException("Los segundos deben estar entre 1 y 59");
        }
        this.segundos = segundos;
    }
    public void avanzarSegundos(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad de segundos a avanzar no puede ser negativa");
        }
        segundos += cantidad;
        minutos += segundos / 60;
        segundos %= 60;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
    }
}