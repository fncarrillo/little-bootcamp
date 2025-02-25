package ejemplointerfaces;

public class Cuadrado implements Figura,Color{

    private double lado;
    private Color color;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double perimetro(){
        return this.lado*4;
    }

    @Override
    public double area(){
        return this.lado*this.lado;
    }

    public void esEquilatero(){
        System.out.println("¡Soy un cuadradado bobo!, obvio que soy equilatero");
    }

    @Override
    public String darColor(){
        return "Rojo";
    }

}
