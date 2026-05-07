
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        calculadora cal = new calculadora();

        int opcion;

        do {
            System.out.println("-----Calculadora-----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. raiz cuadrada");
            System.out.println("6. potencia");
            System.out.println("7. Seno");
            System.out.println("8. Coseno");
            System.out.println("9. ver historial");
            System.out.println("10. ver datos de la calculadora");
            System.out.println("0. salir");

            System.out.print("Selecione una opción: ");
            opcion = teclado.nextInt();

            double a, b;

            try {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        System.out.print("Ingrese el segundo número: ");
                        b = teclado.nextDouble();

                        cal.sumar(a, b);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 2:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        System.out.print("Ingrese el segundo número: ");
                        b = teclado.nextDouble();

                        cal.restar(a, b);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;
                    
                    case 3:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        System.out.print("Ingrese el segundo número: ");
                        b = teclado.nextDouble();

                        cal.multiplicar(a, b);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 4:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        System.out.print("Ingrese el segundo número: ");
                        b = teclado.nextDouble();

                        cal.dividir(a, b);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 5:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        cal.raiz(a);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 6:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        System.out.print("Ingrese el segundo número: ");
                        b = teclado.nextDouble();

                        cal.potencia(a, b);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 7:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        cal.seno(a);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 8:
                        System.out.print("Ingrese el primer número: ");
                        a = teclado.nextDouble();

                        cal.coseno(a);

                        System.out.println("Resultado: " + cal.getResultados());
                        break;

                    case 9:
                        System.out.println("\n-----Historial-----");

                        for (String operacion : cal.getHistorial()) {
                            System.out.println(operacion);
                        }

                        break;

                    case 10:
                        System.out.println(cal);

                        break;

                    case 0:
                        System.out.println("Hasta luego, bye");
                    
                        break;

                    default:
                        System.out.println("Opción invalida.");
                }

            } catch (divisionPorCeroExeption e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } while (opcion != 0);
        teclado.close();
    }
}
