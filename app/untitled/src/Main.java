import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Persona persona2 = new Persona();
        persona2.setEsTrolo(true);

        Persona personilla = new Persona("Benito","Camela",75, LocalDate.of(1950,5,2));
        personilla.saludar();
        var edad = personilla.getEdad();
        System.out.println("La edad de Benito es: "+edad);

        if(personilla.getEdad()>=18){
            System.out.println("¡Es mayor de edad!");
        }else{
            System.out.println("¡No es mayor de edad!");
        }

    }


}