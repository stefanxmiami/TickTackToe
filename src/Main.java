import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main implements GameBoardInterface, GameBoardNumberSelectInterface {
    static List<Integer> listPlayerPositions = new ArrayList<Integer>();
    static List<Integer> listComputerPositions = new ArrayList<Integer>();

    static int   playerPositions;
    static int computerPositions;

    static boolean gameActive = true;

    public static void main(String[] args) {
        //Instances
        Scanner sc = new Scanner(System.in);
        Random computer = new Random();
        PlayerSelect playerSelect = new PlayerSelect();
        ComputerSelect computerSelect = new ComputerSelect();
        CheckWinner checkWinner = new CheckWinner();


            //Outputs
            System.out.println("Player X, mark your spot!");
            PrintGameBoardClass.printGameBoardMethod(gameBoardNumberSelect);


        while(gameActive) {

            //PlayerSelects
            playerPositions = sc.nextInt();

            while(listPlayerPositions.contains(playerPositions) || listComputerPositions.contains(playerPositions)){
               System.out.println("Please choose an empty slot!");
               playerPositions = sc.nextInt();
           }
            playerSelect.playerSelector();
            listPlayerPositions.add(playerPositions);
            PrintGameBoardClass.printGameBoardMethod(gameBoard);
            System.out.println();

            //ComputerSelects
            computerPositions = computer.nextInt(9)+1;

            while(listComputerPositions.contains(computerPositions) || listPlayerPositions.contains(computerPositions)){
                System.out.println("Please choose an empty slot!");
                computerPositions = computer.nextInt(9)+1;
            }
            computerSelect.computerSelector();
            listComputerPositions.add(computerPositions);
            PrintGameBoardClass.printGameBoardMethod(gameBoard);
            checkWinner.winner();
        }

    }
}
