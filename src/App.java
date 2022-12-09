import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int horas, minutos;
        horas = 22;
        minutos = 15;
        String opcao;
        
        Scanner teclado = new Scanner(System.in);


        do {
            if ((horas > 12) && (horas < 24)) {
                // converter a hora para notação A.M. / P.M.
                // como transforma 21 para 9
                // como transforma 22 para 10
                // como transforma 23 para 11
                horas = horas - 12;
                //P.M.
                //System.out.print(horas+":"+minutos+" P.M.");
                imprimeHorario(horas, minutos, 'P');
            } else if (horas == 12) {
                //System.out.print(horas+":"+minutos+" P.M.");
                //A.M,
                //System.out.print(horas+":"+minutos+" A.M.");
                imprimeHorario(horas, minutos, 'P');
            } else if (horas == 24) {
                horas = 0;
                //System.out.print(horas+":"+minutos+" A.M.");
                imprimeHorario(horas, minutos, 'A');
            } else {
                //System.out.print(horas+":"+minutos+" A.M.");
                imprimeHorario(horas, minutos, 'A');
            }
        System.out.println("Deseja converter mais um número? ");
        opcao = teclado.nextLine();
        while(opcao != "n");
    
    }

    static void imprimeHorario(int h, int m, char t) {
        System.out.print(h+":"+m+" "+t+".M.");
    } 
    
}
