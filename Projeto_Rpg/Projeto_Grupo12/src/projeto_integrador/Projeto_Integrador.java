package projeto_integrador;
import java.util.Scanner;

public class Projeto_Integrador {
    
    
public static int menu(){
    Scanner inpult = new Scanner(System.in);
    System.out.println("Introdução: ");
    System.out.println("Jogar: ");
    System.out.println("Creditos: ");
    System.out.println("Sair: ");
    int op = inpult.nextInt();
    return op;
}
public static int opçao(int intro, int jogar, int creditos, int sair, int op){
int c = 0;
      switch(op){
        case 1:
           c =(intro);
           return c;
        case 2:
            c = (jogar);
            return c;
        case 3:
            c = (creditos);
            return c;
        case 4:
            c = (sair);
            return c;
}
    return c;
}
    
    public static void main(String[] args) {
       int op = menu();
       int c = op;
       
    }
    
}
