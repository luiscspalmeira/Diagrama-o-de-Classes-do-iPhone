import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReprodutorMusical {

    private int volume;
    Scanner touch = new Scanner(System.in);
    private List<Musica> musicaLista = new ArrayList<>();
    //Musica musica; 
    
    public ReprodutorMusical(int volume) {
        this.volume = volume;
        System.out.println("\n\nMusic Player");

        // adicionando músicas na lista de músicas.
        musicaLista.add(new Musica("U2","Beautiful Day"));
        musicaLista.add(new Musica("U2","Sunday Bloody Sunday"));
        musicaLista.add(new Musica("U2","One"));
        musicaLista.add(new Musica("U2","With Or Without You"));

        // exibindo a lista de músicase a quantidade armazenada.
        System.out.println(musicaLista);
        System.out.println("Total de músicas: " + quantidadeDeMusicas());

        // menu para selecionar música para tocar ou alterar o volume.
        System.out.println("1 - Selecionar música.\n2 - Volume.");

        switch(touch.nextInt()){
            case 1:
                
                SelecionarMusica("One");
                break;

            case 2: 
                do{               
                    try{
                        System.out.println("Selecione o volume: (1 - 10)");    
                        //volume =  Integer.parseInt(touch.nextLine());
                        
                        setAlterarVolume(touch.nextInt());
                        break;
                    } catch (InputMismatchException i){
                            System.out.println("Seleção inválida! Entrada numérica");                    
                    }
                }while(true);

                
            
            default: 
                System.out.println("Seleção inválida.");
        }
    }

    // metódo de seleção da música.
     public void SelecionarMusica(String musicaSelecionada){
            if(!musicaLista.isEmpty()){
                for(Musica m : musicaLista)
                    if(m.getMusica().equalsIgnoreCase(musicaSelecionada)){
                        System.out.println("Tocando: "+ musicaSelecionada);  
                        System.out.println("Volume: "+ volume);
                    }                                  
            }else
                System.out.println("Lista vazia.");
    }

    // método que retorna a quantidade de músicas armazenadas.
    public int quantidadeDeMusicas(){
        return musicaLista.size();
    }

    public void setAlterarVolume(int volume){
        this.volume = volume;
    }

    public int getAlterarVolume(){
        return this.volume;
    }

}
