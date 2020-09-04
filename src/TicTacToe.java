import java.util.Scanner;

public class TicTacToe<gameBoard> {

    public static void main(String[] args) {
        char [][] gameBoard = {  {' ', '|', ' ', '|', ' '},
                                 {'_', '+', '_', '+', '_'},
                                 {' ', '|', ' ', '|', ' '},
                                 {'_', '+', '_', '+', '_'},
                                 {' ', '|', ' ', '|', ' '},
        };
        printGameBoard(gameBoard);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Placement 1 to 9:");
        int pos = scan.nextInt();

        System.out.println(pos);

    }
    public static void printGameBoard(char[][] gameBoard){
        for(char [] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
