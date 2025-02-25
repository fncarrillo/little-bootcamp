import ejemplointerfaces.Cuadrado;
import ejemplointerfaces.Figura;
import ejemplointerfaces.Rectangulo;
import ejemplopersonas.Persona;
import ejemplopersonas.PersonaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Persona jony = new Persona("Jony");
        System.out.println("¿Esta lleno? "+jony.estaLleno());

        PersonaJuridica nico = new PersonaJuridica("Nico","cuit falopa");
        nico.votar();

        System.out.println(jony.getClass().getSimpleName());
        System.out.println(nico.getClass().getSimpleName());

        Persona otraPersona = new PersonaJuridica("Carlitos","cuit super falopa");
        System.out.println(otraPersona.getClass().getSimpleName());

        List<Persona> personas = new ArrayList<>();
        List<Persona> otraLista = new Stack<>();

        personas.add(nico);
        personas.add(jony);
        personas.add(otraPersona);
        personas.remove(jony);

        otraLista.add(nico);
        otraLista.remove(nico);

        personas.forEach( personita -> System.out.println(personita.estaLleno()));

        Cuadrado cuadrado = new Cuadrado(4);
        Rectangulo rectangulo = new Rectangulo(6,6);

        System.out.println("Perimetro de cuadrado es: "+cuadrado.perimetro());
        System.out.println("Perimetro de rectangulo es: "+rectangulo.perimetro());

        Figura figura1 = new Cuadrado(10);
        Figura figura2 = new Rectangulo(25,10);

        System.out.println("Area de la figura1: "+figura1.area());
        System.out.println("Area de la figura2: "+figura2.area());

        System.out.println(cuadrado.darColor());

    }


}