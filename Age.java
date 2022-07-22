import java.util.Scanner;

public class Age {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int age = 20;
        int annee = 2002 ;

        System.out.println("Entrez votre age : ");
        age = scanner.nextInt();
        System.out.println("votre année de naissance est : " + (2022-age) );
    }
}
