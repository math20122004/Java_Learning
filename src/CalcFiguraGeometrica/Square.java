package CalcFiguraGeometrica;

public record Square(double side) implements GeometricForm {

    @Override
    public void getArea() {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.printf("A área do quadrado é: %.2f m² \n\n", side * side);
    }

}
