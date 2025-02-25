package ejemplopersonas;

public class EntidadQueCome {

    private String nombre;
    private int nivelHambre;

    public EntidadQueCome(String nombre) {
        this.nombre = nombre;
    }

    public void comer(){
        nivelHambre+=10;
    }

    public void comerN(int veces){
        nivelHambre+=(10*veces);
    }

    public boolean estaLleno(){
        return nivelHambre==100;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelHambre() {
        return nivelHambre;
    }
}
