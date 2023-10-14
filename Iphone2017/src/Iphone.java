import java.util.Scanner;

public class Iphone {
    
    public static void main(String[] args) throws Exception {
        
        inicio();
    }

    public static void inicio(){
        String modelo = "Iphone 14";
        boolean ligar = false;
        int volume = 5;
        double tela = 6.06;

        ligarIphone();
        System.out.println("\n\n-----------------------------");
        System.out.println("            " + modelo + "           ");
        System.out.println("-----------------------------");
        
        int entrada;
        Scanner teclado = new Scanner(System.in);
        Navegador navegador;
        ReprodutorMusical musical;
        AparelhoTelefonico telefonico;

        
        System.out.println("\nEscolha a opção: \n\n 1 - Reprodutor Musical\n 2 - Navegador\n 3 - Telefone");
        switch(Integer.parseInt(teclado.nextLine())){

            case 1:
                musical = new ReprodutorMusical(volume);
                break;

            case 2:
                //navegador = new Navegador();
                System.out.println("-----------------------------");
                System.out.println("NAVEGADOR");
                System.out.println("-----------------------------");
                System.out.println("\n 1 - Safari\n 2 - Firefox\n 3 - Chrome");
                entrada = Integer.parseInt(teclado.nextLine());
                navegador = new Navegador(entrada);               
                break;

            case 3:
                telefonico =  new AparelhoTelefonico();
                break;
            
            default:
                System.out.println("Escolha inválida.");
                break;

        }
    }

    public static boolean ligarIphone(){
        return true;
    }
}
