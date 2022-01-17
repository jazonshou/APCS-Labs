//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class TriangleWordRunner
{
    public static void main(String args[])
    {	
        Scanner kb = new Scanner(System.in);

        String manutd = "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⡄⠀⠀⣰⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n        ⠀⠀⠀⠀⣀⠀⢠⠀⠐⢶⣾⣿⣷⣶⣾⣿⣷⣶⠂⣰⡄⠀⣴⡄⠀⣴⡄\n        ⠀⠀⠀⣾⣿⣿⣿⡄⠀⠈⢻⣿⡈⣻⣟⢁⣿⠃⠈⢻⡟⠈⣿⡟⠀⣿⡏\n        ⠹⣶⣾⣿⡿⢿⣿⣷⡀⠀⠈⢻⣿⣿⣿⣿⣿⠀⠀⢸⣇⣀⣿⣇⣀⣿⡇\n        ⠀⡿⠋⠁⠀⢀⣿⣿⣿⡆⢀⣼⣿⡅⢨⣿⣿⣄⠀⠸⠿⠿⣿⡿⠿⠿⠇\n        ⠀⠀⠀⠀⠈⠛⣿⣿⡟⠀⣿⣿⣿⣿⣿⣿⣿⡿⠓⢀⣀⣠⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⣿⣿⠇⠀⢻⣿⣿⣿⣿⣿⣿⣷⣾⠿⠿⢿⣿⣿⡆⠀⠀\n        ⠀⠀⠀⠀⠀⠀⣿⣿⡆⠀⠀⣽⣿⣿⣿⣿⣿⣿⣿⣦⣀⣀⣿⣿⡟⠀⠀\n        ⠀⠀⠀⠀⠀⠀⣿⣿⣇⠀⣸⣿⣿⣿⣿⣿⣿⡿⠛⠿⣿⣿⣿⣿⡇⠀⠀\n        ⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠁⣀⡀⠀⠉⣿⡏⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠘⠿⠿⠿⣿⣿⣿⡟⢿⣿⣿⣿⣿⣿⣷⠀⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡄⠈⢿⣿⣿⣿⡏⠀⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⡄⠀⠙⢿⣿⡇⠀⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠙⠿⠀⣿⡇⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⠿⠟⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀";
        
        System.out.println(manutd);


        TriangleWord word = new TriangleWord("GLORY_GLORY_MAN_UNITED");
        System.out.println(word.toString());

        
    }
}