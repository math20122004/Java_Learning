package CalcFiguraGeometrica;

public record Rectangle(double height, double base) implements GeometricForm {

    @Override
    public void getArea() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.printf("A área do retângulo é: %.2f m² \n\n", height * base);
    }
}
