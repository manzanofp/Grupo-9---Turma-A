import java.util.Scanner;


public class TheAlgorithmsPrisoner {
    public static void main(String[] args) {
        System.out.println("*--------------***--------------*");
        System.out.println("Em um dia como de costume, João levantou, tomou seu banho, escovou seus dentes e tomou o seu café e foi cumprir o seu trabalho diário.\n" +
                "Sentou se a frente do seu computador e percebeu algo diferente dos outros dias, seu computador estava \n"+
                "apresentando vários erros como se uma espécie de vírus estivesse atingindo, ele começou a mexer em suas\n" +
                "configurações, sistema e algo surpreendente aconteceu....");
        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Instruções");
            System.out.println("2- Jogar");
            System.out.println("3- Créditos");
            System.out.println("4- Sair");
        switch (opcao) {
                case 1:
                case 2:
                case 3:
                    System.out.println("1- Instruções");
                    System.out.println("2- Jogar");
                    System.out.println("3- Créditos");
                    System.out.println("4- Sair");
                    break;
            }
            opcao = sc.nextInt();
        } while (opcao != 4);
        
    }
}

