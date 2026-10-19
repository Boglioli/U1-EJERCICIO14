public class Main {
    public static void main(String[] args) {
        Temporizador temporizador = new Temporizador(5, 30);
        temporizador.avanzarSegundos(90);
        System.out.println("tiempo final: ");
        System.out.println(temporizador.getMinutos() + " minutos y " + temporizador.getSegundos() + " segundos");
    }
    }
