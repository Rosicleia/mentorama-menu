import java.util.Scanner;

public class Menu {    
    public static void main(String[] args) {

        int opcao;
         
        do {
            System.out.println("MENU DE OPÇÕES:\n");
            System.out.println("1 - Opção 1");
            System.out.println("2 - Opção 2");
            System.out.println("3 - Sair");

            Scanner menu = new Scanner(System.in);

            System.out.println("Digite a opção desejada: \n");
            opcao = menu.nextInt();           

            switch (opcao) {                
                case 1: 
                                        System.out.println("Você escolheu a primeira opção. \n");
                    break;
                case 2:
                    System.out.println("Você escolheu a segunda opção. \n");
                    break;
                case 3:
                    System.out.println("O programa foi encerrado. \n");
                    break;
        
                default:
                    System.out.println("Seleção inválida. \n");
                    break;
            }
        }while(opcao != 3);                        
    }           
    
}


    



