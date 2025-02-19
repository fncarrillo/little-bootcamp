import java.time.LocalDate;

public class Persona {
    //default - public - private - protected - package

    public static final String entorno="dev";

    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private boolean esTrolo;

    public Persona(){}
    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void saludar(){
        System.out.println("¡Hola!");
    }


    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setEsTrolo(boolean esTrolo) {
        this.esTrolo = esTrolo;
    }

    public boolean esMayorDeEdad(){
        return (this.fechaNacimiento.getYear() - LocalDate.now().getYear())>=18;
    }

}
