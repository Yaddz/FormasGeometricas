public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];
        formas[0] = new Circulo(10);
        formas[1] = new Retangulo(8, 10);
        formas[2] = new Triangulo(5, 10);

        System.out.println("Área Circulo = " + formas[0].calcularArea());
        System.out.println("Área Retangulo = " + formas[1].calcularArea());
        System.out.println("Área Triangulo = " + formas[2].calcularArea());

    }
}
