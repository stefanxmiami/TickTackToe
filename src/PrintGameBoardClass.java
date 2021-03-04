public class PrintGameBoardClass implements GameBoardInterface {
    public static void printGameBoardMethod(String[][] gameBoard){

        for(String[] row : gameBoard){
            for(String s : row){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
