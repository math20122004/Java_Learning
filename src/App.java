import java.util.Locale;
import java.util.Scanner;
import CalcFiguraGeometrica.*;
import Marketing.*;
import Produtos.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.flush();

            System.out.println("""
                    1 - Enviar Mensagem
                    2 - Calcular Tributo
                    3 - Calcular área de uma figura geométrica
                    4 - Sair
                    """);
            System.out.print("-> ");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("Digite a mensagem que deseja enviar:\n");
                    
                    scanner.nextLine();
                    String message = scanner.nextLine();

                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    
                    System.out.println("""
                        \nAonde deseja enviar a mensagem:\n 
                        1 - SMS
                        2 - E-mail    
                            """);

                    System.out.print("-> ");
                    int opcaoSms = scanner.nextInt();

                    switch (opcaoSms) {
                        case 1:
                            Sms sms = new Sms();
                            System.out.println("\033[H\033[2J");
                            sms.sendMessage(message);
                            continuar(scanner);
                            
                            break;
                        case 2:
                            Email email = new Email();
                            System.out.println("\033[H\033[2J");
                            email.sendMessage(message);
                            continuar(scanner);

                            break;
                        default:
                            System.out.println("Erro. Tente novamente");
                            continuar(scanner);

                            break;        
                        }
                    break;

                case 2:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();

                    System.out.println("""
                            1 - Alimentação
                            2 - Saúde e Bem Estar
                            3 - Vestuário
                            4 - Cultura
                            """);

                    System.out.print("-> ");
                    int opcao = scanner.nextInt();

                    String nome;
                    double preco;

                    switch (opcao) {
                        case 1:
                            System.out.print("\nDigite o nome: ");
                            scanner.nextLine();
                            nome = scanner.nextLine();
                            System.out.print("Digite o preço: ");
                            preco = scanner.nextDouble();

                            Alimentacao alimentacao = new Alimentacao(nome, preco);
                            alimentacao.calcularImposto();
                            continuar(scanner);
                            break;

                        case 2:
                            System.out.print("\nDigite o nome: ");
                            scanner.nextLine();
                            nome = scanner.nextLine();
                            System.out.print("Digite o preço: ");
                            preco = scanner.nextDouble();

                            SaudeBemEstar saudeBemEstar = new SaudeBemEstar(nome, preco);
                            saudeBemEstar.calcularImposto();
                            continuar(scanner);
                            break;

                        case 3:
                            System.out.print("\nDigite o nome: ");
                            scanner.nextLine();
                            nome = scanner.nextLine();
                            System.out.print("Digite o preço: ");
                            preco = scanner.nextDouble();

                            Vestuario vestuario = new Vestuario(nome, preco);
                            vestuario.calcularImposto();
                            continuar(scanner);
                            break;

                        case 4:
                            System.out.print("\nDigite o nome: ");
                            scanner.nextLine();
                            nome = scanner.nextLine();
                            System.out.print("Digite o preço: ");
                            preco = scanner.nextDouble();

                            Cultura cultura = new Cultura(nome, preco);
                            cultura.calcularImposto();
                            continuar(scanner);
                            break;

                        default:
                            System.out.println("\nErro. Tente novamente");
                            continuar(scanner);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\033[H\033[2J");
                    System.out.flush();
                    
                    System.out.println("""
                        1 - Quadrado
                        2 - Retângulo
                        3 - Círculo
                        """);
                        
                    System.out.print("-> ");
                    scanner.nextLine();
                    int opcaoForma = scanner.nextInt();
                    
                    switch (opcaoForma) {
                        case 1:
                            System.out.println("\nDigite o valor do lado do quadrado: ");
                            scanner.nextLine();
                            double side = scanner.nextDouble();

                            Square square = new Square(side);
                            square.getArea();
                            continuar(scanner);
                            break;

                        case 2:
                            System.out.println("\nDigite o valor da base do retângulo: ");
                            scanner.nextLine();
                            double base = scanner.nextDouble();
                            
                            System.out.println("\nDigite o valor da altura do retângulo: ");
                            double height = scanner.nextDouble();
                            
                            Rectangle rectangle = new Rectangle(base, height);
                            rectangle.getArea();
                            continuar(scanner);
                            break;

                        case 3:
                            System.out.println("\nDigite o valor do raio do círculo: ");
                            scanner.nextLine();
                            double radius = scanner.nextDouble();

                            Circle circle = new Circle(radius);
                            circle.getArea();
                            continuar(scanner);
                            break;

                        default:
                            System.out.println("\nErro. Tente novamente");
                            continuar(scanner);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Obrigado!\n");
                    break;
                default:
                    System.out.println("\033[H\033[2J");
                    System.out.println("Digite uma opção válida.\n");
                    break;

            }
            if (escolha == 4){
                break;
            }
        }
    }

    public static void continuar(Scanner scanner) {
        System.out.print("Pressione ENTER para continuar...");
        if (scanner.hasNextLine()) {
            scanner.nextLine(); 
        }
        scanner.nextLine(); 
    }
}
