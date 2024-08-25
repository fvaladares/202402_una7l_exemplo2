import data.Endereco;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //region:Declaração de variavéis
        String rua;
        int numero;
        String bairro;
        String cidade;
        Endereco endereco;
        //endRegion


        // Objeto Scanner para entrada de dados

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome da rua: ");
        rua = input.nextLine();
        System.out.println();

        System.out.print("Digite o numero: ");
        numero = input.nextInt();
        System.out.println();
        input.skip("[\r\n]"); // Usar somente após o nextInt() e antes do nextLine()

        System.out.print("Digite o nome da bairro: ");
        bairro = input.nextLine();
        System.out.println();

        System.out.print("Digite o nome da cidade: ");
        cidade = input.nextLine();
        System.out.println();

        endereco = new Endereco(rua,
                numero,
                bairro,
                cidade);

        System.out.println(endereco);

    }
}