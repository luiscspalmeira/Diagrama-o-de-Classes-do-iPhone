import java.util.List;
import java.util.ArrayList;

public class Navegador {

    List<Sites> site;
    Iphone iphone;

    public Navegador(int escolha){
        site = new ArrayList<>();
        adicionarListaDeSites();
        acessarBrowser(escolha);
    }

    public void acessarBrowser(int escolha){
        //List<Sites> siteEscolhido = new ArrayList<>();
        if(escolha == 1){   
            System.out.println("-----------------------------");
            System.out.println("Safari escolhido...");
            System.out.println("-----------------------------");
            for(Sites s : site){
                if(s.getBrowser().equalsIgnoreCase("Safari"))
                    System.out.println(s.getUrl() + "\n");
                s.setUrl("www.site5.com.br");
                if(s.getBrowser().equalsIgnoreCase("Safari"))
                    System.out.println("Nova URL:\n " + s.getUrl() + "\n");  
            }        
            iphone.inicio();   
        }  
        else if(escolha == 2){
            System.out.println("-----------------------------");
            System.out.println("Firefox escolhido...");
            System.out.println("-----------------------------");
            for(Sites s : site){
                if(s.getBrowser().equalsIgnoreCase("Firefox"))
                    System.out.println(s.getUrl() + "\n");
                s.setUrl("www.site5.com.br");
                if(s.getBrowser().equalsIgnoreCase("Firefox"))
                    System.out.println("Nova URL:\n " + s.getUrl() + "\n");
            }
            iphone.inicio();  
        }else if(escolha == 3){
            System.out.println("-----------------------------");
            System.out.println("Chrome escolhido...");
            System.out.println("-----------------------------");
            for(Sites s : site){
                if(s.getBrowser().equalsIgnoreCase("Chrome"))
                    System.out.println(s.getUrl() + "\n");
                s.setUrl("www.site5.com.br");
                if(s.getBrowser().equalsIgnoreCase("Chrome"))
                    System.out.println("Nova URL:\n " + s.getUrl() + "\n");
            }
            iphone.inicio();  
        }
            else{
                System.out.println("Opção inválida");
                iphone.inicio();
            }

    }

    public void adicionarListaDeSites(){
        site.add(new Sites("Safari", "www.site1.com.br"));
        site.add(new Sites("Firefox", "www.site2.com.br"));
        site.add(new Sites("Chrome", "www.site3.com.br"));    
            
    }

    public int quantidadeBrowser(){
        return site.size();
    }   
    
}
