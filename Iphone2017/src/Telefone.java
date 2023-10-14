import java.util.List;
import java.util.Scanner;

public class Telefone {
    private long telefone;
    List<Agenda> agenda;
    //Agenda agendaTelefone;

    

    public void phoneDigito(){
        Scanner teclado = new Scanner(System.in);
        telefone = teclado.nextLong();
        System.out.println("Discando para" + telefone);
    }

    public void phoneAgenda(String nome){
        agenda.add(new Agenda("Luis", 11111111));
        agenda.add(new Agenda("Claudio", 22222222));
        agenda.add(new Agenda("Palmeira", 33333333));

        if(!agenda.isEmpty()){
            for (Agenda a : agenda)
                if (a.getNome().equalsIgnoreCase(nome))
                    System.out.println("Discando para" + a.getNome() + "\n" + a.getNumero());
        }else
            System.out.println("Agenda vazia");
    }

    public long getTelefone(){
        return telefone;
    }
    
}
