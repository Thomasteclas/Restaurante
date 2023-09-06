
import java.util.Scanner;

public class ReservaDeMesa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de reserva de mesa do restaurante!");

        // Solicitar informações da reserva
        System.out.print("Informe seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Informe a data da reserva (DD/MM/AAAA): ");
        String dataReserva = scanner.nextLine();

        System.out.print("Informe o horário da reserva (HH:MM): ");
        String horarioReserva = scanner.nextLine();

        System.out.print("Informe o número de convidados: ");
        int numeroConvidados = scanner.nextInt();



        scanner.close();
    }
}