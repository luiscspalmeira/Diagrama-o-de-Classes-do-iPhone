import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AparelhoTelefonico {
    
    private List<Agenda> agenda;
    int forma;
    Scanner touch = new Scanner(System.in);
    Iphone iphone;

    public AparelhoTelefonico(){
        agenda = new ArrayList<>();
        phoneAgenda();
        formaDeLigacao();
        System.out.println(agenda);
    }

    public void formaDeLigacao(){
        System.out.println("-----------------------------");
        System.out.println("   1 - Discagem\n   2 - Agenda");
        System.out.println("-----------------------------");
        int forma = Integer.parseInt(touch.nextLine());
        if(forma == 1){
            long telefone = Integer.parseInt(touch.nextLine());
            for(Agenda a : agenda)
                if (a.getNumero() == telefone){                    
                    System.out.println("Ligando para... " + a.getNome() + "\n" + a.getNumero());
                    iphone.inicio();
                }
                else{
                    System.out.println("Discando para... " + telefone);
                    iphone.inicio();
                }
            System.out.println("ligando");
        }else{
            if(!agenda.isEmpty())
                for(Agenda a : agenda)
                    if (a.getNome().equalsIgnoreCase("luis"))
                        System.out.println("Discando para... " + a.getNome() + "\n" + a.getNumero());
            iphone.inicio();
        }
    }
    

    public void phoneAgenda(){
        agenda.add(new Agenda("Luis", 11111111));
        agenda.add(new Agenda("Claudio", 22222222));
        agenda.add(new Agenda("Palmeira", 33333333));
        agenda.add(new Agenda("Palmeira", 33333333));
    }

       

   
}
