import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheAlgorithmsPrisoner {
    static void sair(){
        System.out.println("*------- JOGO ENCERRADO, OBRIGADO POR JOGAR! -------*");
        System.exit(0);
    }
    static void creditos(){
        System.out.println("\nEspero que aproveite a sua jogatina!");
        System.out.println("Este jogo foi produzido pelos Desenvolvedores: \n Diego Pedro\n Felipe Manzano\n Sabrina Oliveira\n Talita Brandão\n Yasmin Rodrigues");
    }

    public static void faseTres(){
        System.out.println("ADD FASE III");


    }
    public static void faseDois(){

        System.out.println("ADD FASE II");
    }
        public static void questoes() {
        //Pergunta I
            Scanner input = new Scanner(System.in);
            boolean acertou = false;
            int cont = 0;
            int pontuacao = 0;
            List alternativas = new ArrayList();
            alternativas.add("Apenas I"); // resposta correta
            alternativas.add("I e II");
            alternativas.add("II e III");
            alternativas.add("Apenas II");
            alternativas.add("Todas as afirmações estão corretas");
            do {

                Collections.shuffle(alternativas);
                System.out.println("1) Nos últimos anos, a tecnologia passou por um processo de constante evolução e muito se tem dito sobre como a tecnologia como um todo transformou o modo de vida na sociedade. Tendo em vista, especificamente, o conceito de algoritmo, especifique a definição que melhor se aplica ao conceito:");
                System.out.println("\nI) É uma sequência lógica, finita e bem definida de instruções que devem ser seguidas para resolver um problema ou executar uma tarefa\n" +
                        "II)É uma sequência infinita de instruções que devem ser seguidas para criar um problema ou executar uma tarefa\n" +
                        "III)É uma sequência infinita de instruções que devem ser seguidas de maneira aleatória \n");
                System.out.println("a) " + alternativas.get(0));
                System.out.println("b) " + alternativas.get(1));
                System.out.println("c) " + alternativas.get(2));
                System.out.println("d) " + alternativas.get(3));
                System.out.println("e) " + alternativas.get(4));
                System.out.print("Escolha uma alternativa: ");
                String resposta = input.next();
                switch (resposta) {
                    case "a":
                    case "A":
                        if (alternativas.get(0).equals("Apenas I")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            cont ++;
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativas.get(1).equals("Apenas I")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            cont ++;
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativas.get(2).equals("Apenas I")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            cont ++;
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativas.get(3).equals("Apenas I")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            cont ++;
                        }
                        break;
                    case "e":
                    case "E":
                        if (alternativas.get(4).equals("Apenas I")) {
                            System.out.println("Resposta correta!");
                            acertou = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            cont ++;
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida!");
                }
            } while (!acertou && cont <=2);
            System.out.println("*--------------***--------------*");
            System.out.println("Sua pontuação é de: "+ pontuacao+" ponto");
            System.out.println("*--------------***--------------*");
        //Pergunta II
        Scanner inputp2 = new Scanner(System.in);
        boolean acertoup2 = false;
        int contp2 = 0;;
        List alternativasp2 = new ArrayList();
        alternativasp2.add("Apenas III");
        alternativasp2.add("II e III");
        alternativasp2.add("Apenas I");
        alternativasp2.add("I,II e III");// resposta correta
        alternativasp2.add("Todas as afirmações estão corretas");
        do {
            Collections.shuffle(alternativasp2);
            System.out.println("2)Um dos principais preceitos utilizados no desenvolvimento do pensamento algorítmico, é a decomposição do problema, ou seja, é a capacidade de dividir um problema maior em etapas ordenadas a fim de resolver de forma mais simples. Seguindo essa linha de raciocínio, assinale as alternativas que correspondem às etapas do processo cotidiano de fazer café que estão faltando:\n");
            System.out.println("1.Pegar um bule.\n2.Encher com água.\n3.Levar ao fogo.\n4.Acrescentar a quantidade de açúcar desejada na água.\n5.Pegar o bule e o coador.\n6.Despejar água fervente no coador.\n7.Após coar todo o café, retirar o coador.");
            System.out.println("\nI) Esperar até ferver. \nII)Servir.\nIII)Colocar o pó de café na medida desejada no coador.\nIV)Levar a geladeira.\nV)Acrescentar a quantidade de sal desejada.\n");

            System.out.println("a) " + alternativasp2.get(0));
            System.out.println("b) " + alternativasp2.get(1));
            System.out.println("c) " + alternativasp2.get(2));
            System.out.println("d) " + alternativasp2.get(3));
            System.out.println("e) " + alternativasp2.get(4));
            System.out.print("Escolha uma alternativa: ");
            String resposta2 = input.next();
            switch (resposta2) {
                case "a":
                case "A":
                    if (alternativasp2.get(0).equals("I,II e III")) {
                        System.out.println("Resposta correta!");
                        acertoup2 = true;
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        contp2++;
                    }
                    break;
                case "b":
                case "B":
                    if (alternativasp2.get(1).equals("I,II e III")) {
                        System.out.println("Resposta correta!");
                        acertoup2 = true;
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        contp2++;
                    }
                    break;
                case "c":
                case "C":
                    if (alternativasp2.get(2).equals("I,II e III")) {
                        System.out.println("Resposta correta!");
                        acertoup2 = true;
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        contp2++;
                    }
                    break;
                case "d":
                case "D":
                    if (alternativasp2.get(3).equals("I,II e III")) {
                        System.out.println("Resposta correta!");
                        acertoup2 = true;
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        contp2++;
                    }
                    break;
                case "e":
                case "E":
                    if (alternativasp2.get(4).equals("I,II e III")) {
                        System.out.println("Resposta correta!");
                        acertoup2 = true;
                        pontuacao++;
                    } else {
                        System.out.println("Resposta incorreta!");
                        contp2++;
                    }
                    break;
                default:
                    System.out.println("Escolha inválida!");
            }
        } while (!acertoup2 && contp2 <=2);
            System.out.println("*--------------***--------------*");
            System.out.println("Sua pontuação é de: "+ pontuacao+" pontos");
            System.out.println("*--------------***--------------*");
        //Fase III
            Scanner inputp3 = new Scanner(System.in);
            boolean acertoup3 = false;
            int contp3 = 0;
            List alternativasp3 = new ArrayList();
            alternativasp3.add("Fluxograma, diagrama e decomposição");
            alternativasp3.add("Descrição narrativa,  fluxograma e o pseudocódigo");
            alternativasp3.add("Descrição interpretativa,  fluxograma e o pseudocódigo");
            alternativasp3.add("Decomposição, descrição narrativa e diagrama");
            alternativasp3.add("Nenhuma alternativa está correta");
            do {
                Collections.shuffle(alternativasp3);
                System.out.println("3) Agora que você já sabe sobre o que é um algoritmo, de quais maneiras ele pode ser representado:");

                System.out.println("a) " + alternativasp3.get(0));
                System.out.println("b) " + alternativasp3.get(1));
                System.out.println("c) " + alternativasp3.get(2));
                System.out.println("d) " + alternativasp3.get(3));
                System.out.println("e) " + alternativasp3.get(4));
                System.out.print("Escolha uma alternativa: ");
                String respostap3 = input.next();
                switch (respostap3) {
                    case "a":
                    case "A":
                        if (alternativasp3.get(0).equals("Descrição narrativa,  fluxograma e o pseudocódigo")) {
                            System.out.println("Resposta correta!");
                            acertoup3 = true;
                            pontuacao++;

                        } else {
                            System.out.println("Resposta incorreta!");
                            contp3++;
                        }
                        break;
                    case "b":
                    case "B":
                        if (alternativasp3.get(1).equals("Descrição narrativa,  fluxograma e o pseudocódigo")) {
                            System.out.println("Resposta correta!");
                            acertoup3 = true;
                            pontuacao++;

                        } else {
                            System.out.println("Resposta incorreta!");
                            contp3++;
                        }
                        break;
                    case "c":
                    case "C":
                        if (alternativasp3.get(2).equals("Descrição narrativa,  fluxograma e o pseudocódigo")) {
                            System.out.println("Resposta correta!");
                            acertoup3 = true;
                            pontuacao++;

                        } else {
                            System.out.println("Resposta incorreta!");
                            contp3++;
                        }
                        break;
                    case "d":
                    case "D":
                        if (alternativasp3.get(3).equals("Descrição narrativa,  fluxograma e o pseudocódigo")) {
                            System.out.println("Resposta correta!");
                            acertoup3 = true;
                            pontuacao++;

                        } else {
                            System.out.println("Resposta incorreta!");
                            contp3++;
                        }
                        break;
                    case "e":
                    case "E":
                        if (alternativasp3.get(4).equals("Descrição narrativa,  fluxograma e o pseudocódigo")) {
                            System.out.println("Resposta correta!");
                            acertoup3 = true;
                            pontuacao++;
                        } else {
                            System.out.println("Resposta incorreta!");
                            contp3++;
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida!");

                }
            } while (!acertoup3 && contp3 <=2);
            System.out.println("*--------------***--------------*");
            System.out.println("Sua pontuação é de: "+ pontuacao+" pontos");
            System.out.println("*--------------***--------------*");
    }
    public static void faseUm() {
        System.out.println("Computador: “O Seu primeiro oponente é o vírus que está no HD, o Ransomware” - disse uma voz robótica que parecia quase que um grunhido, uma voz robótica que ele jurava ser fruto da sua imaginação.\n" +
                "\tJoão: O que? Ransomware? Oponente? O que está acontecendo? Estou ficando maluco, não é possível! - esmoreceu João.\n" +
                " \tComputador: Que falta de educação a minha, esqueci de me apresentar! Serei seu guia durante essa jornada, pode me chamar de mestre se quiser, sempre me sinto melhor quando reconhecem minha genialidade!\n" +
                "João: Mestre? Acho que quem está maluco é você!\n" +
                " \tComputador: Bom, vou ignorar seus insultos em consideração a amizade que vamos criar, afinal serão 5 longas jornadas de riso, choro e muita aventura. No final vamos nos tornar bons amigos, você vai até dizer que não sabe como viveu milênios sem a minha existência - falou entre risos.\n" +
                "João: Não posso acreditar nisso, me explica de modo que uma pessoa normal possa entender, por favor, chega de enrolação! Me fale agora quem é você? Como posso sair daqui? Por que não consigo me movimentar e me sinto alheio à realidade?\n" +
                " \tComputador: Está bem, cansei da brincadeira! Você é uma pessoa bem amarga, aparentemente nossa jornada vai ser ainda mais longa do que eu esperava: nossa jornada terá ao todo 5 trajetórias, se você passar por todas com excelência você está livre para retornar a sua vidinha de sempre. Na primeira fase você precisa responder a três questões, se você acertar as três, passa para próxima fase!\n" +
                "João: E se eu errar?\n" +
                " \tComputador: Se você errar, você vai ter uma surpresa!\n");
       questoes();

    }

    public static void jogo(){
        faseUm();
        System.out.println("Nessa fase você aprendeu um pouco sobre o pensamento computacional e como ele é o ponto de partida para a aprendizagem, entendimento dos conceitos básicos e aplicabilidade. Você passou para a próxima fase, nesta etapa você vai precisar derrotar o vírus Jellyfish, aperte () para continuar. \n");
        faseDois();
        faseDois();
        faseTres();

    }
    public static void instrucoes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Em um dia como de costume, João levantou, tomou banho, escovou os dentes e tomou o seu café e ligou o computador  para dar continuidade\n ao seu projeto, há dias João tentava ter uma boa ideia para seu trabalho de faculdade, enquanto aguardava ter uma  ideia como em um\n apagão, seu quarto deu lugar a um mundo que não conhecia, uma realidade paralela: ele estava preso dentro do computador.  \n O que João não sabia é que essa aventura estava apenas começando e que para voltar para sua vida cotidiana ele deveria passar por 5 fases,  \n cada uma contendo 3 questões, precisando acertar 3 questões para passar para a próxima fase.\n Gostou da história e deseja ajudar João nessa aventura? Digite 2 para jogar!");
        int resposta = sc.nextInt();
        if (resposta == 2){
            faseUm();
        }else {
            System.out.println("*------- OPÇÃO INVÁLIDA, TENTE NOVAMENTE! -------*");
        }
    }
    public static void introducao(){
        System.out.println("*--------------***--------------*");
        System.out.println("Em um dia como de costume, João levantou, tomou banho, escovou os dentes e tomou o seu café da manhã.\n" +
                "Ligou o computador para dar continuidade a seu projeto, há dias João tentava ter uma ideia para seu trabalho de faculdade,\n" +
                "porém todas as tentativas eram falhas, quando de repente algo inesperado aconteceu, o sistema operacional não saia da tela inicial. \n" +
                "João então reinicia a máquina na esperança que algo mudasse como em um passe de mágica, para sua surpresa, o computador apresentou o mesmo erro, \n" +
                "ele então desligou a máquina e saiu a procura do pendrive que estava em algum lugar do quarto para reinstalar o sistema, de certo, \n" +
                "alguma pasta tinha sido corrompida e precisava de reinstalação...\n");

        System.out.println(" _____   _                   _      _                          _   _     _                           ____           _                                     \n" +
                " |_   _| | |__     ___       / \\    | |   __ _    ___    _ __  (_) | |_  | |__    _ __ ___    ___    |  _ \\   _ __  (_)  ___    ___    _ __     ___   _ __ \n" +
                "   | |   | '_ \\   / _ \\     / _ \\   | |  / _` |  / _ \\  | '__| | | | __| | '_ \\  | '_ ` _ \\  / __|   | |_) | | '__| | | / __|  / _ \\  | '_ \\   / _ \\ | '__|\n" +
                "   | |   | | | | |  __/    / ___ \\  | | | (_| | | (_) | | |    | | | |_  | | | | | | | | | | \\__ \\   |  __/  | |    | | \\__ \\ | (_) | | | | | |  __/ | |   \n" +
                "   |_|   |_| |_|  \\___|   /_/   \\_\\ |_|  \\__, |  \\___/  |_|    |_|  \\__| |_| |_| |_| |_| |_| |___/   |_|     |_|    |_| |___/  \\___/  |_| |_|  \\___| |_|   \n" +
                "                                         |___/                                                                                                             ");

    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("1 - Instruções");
            System.out.println("2 - Jogar");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    instrucoes();
                    break;
                case 2:
                    jogo();
                    break;
                case 3:
                    creditos();
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("*------- OPÇÃO INVÁLIDA, TENTE NOVAMENTE! -------*\"");
            }
        } while (opcao != 4 && opcao!= 2);
        return opcao;
    }
    public static void main(String[] args) {
        introducao();
        int op = menu();
    }
}
