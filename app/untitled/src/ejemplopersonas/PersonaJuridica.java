package ejemplopersonas;

public class PersonaJuridica extends Persona{

    private String cuit;

    public PersonaJuridica(String nombre, String cuit) {
        super(nombre);
        this.cuit = cuit;
    }

    public String getCuit() {
        return cuit;
    }

    public void votar(){
        System.out.println("LLVC vs Peron");
    }

}
