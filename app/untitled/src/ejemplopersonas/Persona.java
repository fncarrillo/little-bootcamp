package ejemplopersonas;

public class Persona extends EntidadQueCome{

    public Persona(String nombre) {
        super(nombre);
    }

    public void transferirPlata(int plataTransferir){
        System.out.println("Transfiere: "+plataTransferir);
    }

    @Override
    public boolean equals(Object obj) {
        Persona persona = (Persona) obj;
        return persona.getNombre().equals(super.getNombre());
    }
}
