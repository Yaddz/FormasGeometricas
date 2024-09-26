abstract class Forma {
    abstract double calcularArea();
}

class Circulo extends Forma {
    private double raio;

    public Circulo (double raio){
        this.raio = raio;
    }
    @Override
    double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Retangulo extends Forma {
    private double base;
    private double altura;

    public Retangulo (double base, double alura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    double calcularArea() {
        return base * altura;
    }
}

class Triangulo extends Forma{
    private double base;
    private double altura;

    public Triangulo (double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}
