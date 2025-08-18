import java.util.ArrayList;
import java.util.Scanner;
public class ex02 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        ArrayList<String>nomes = new ArrayList<String>();


        for (int i = 0; i < 5; i++) {
            System.out.println("Insira os nomes: ");
            nomes.add(ler.nextLine());
        }
        for (int i = nomes.size() - 1; i >= 0; i--) {
            System.out.println(nomes.get(i));
        }
    }
}
