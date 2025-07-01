package CalcFiguraGeometrica;

public record Circle(double radius) implements GeometricForm {
    private static double pi = 3.14;

    @Override
    public void getArea() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.printf("A área do círculo é: %.2f m² \n\n", (radius * radius) * pi);
    }
}
