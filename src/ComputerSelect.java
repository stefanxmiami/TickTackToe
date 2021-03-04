public class ComputerSelect extends Main{
    public void computerSelector() {
        switch (computerPositions){
            case 1:
                gameBoard[0][0] = " O";
                break;
            case 2:
                gameBoard[0][2] = " O ";
                break;
            case 3:
                gameBoard[0][4] = "O ";
                break;
            case 4:
                gameBoard[2][0] = " O";
                break;
            case 5:
                gameBoard[2][2] = " O ";
                break;
            case 6:
                gameBoard[2][4] = "O ";
                break;
            case 7:
                gameBoard[4][0] = " O";
                break;
            case 8:
                gameBoard[4][2] = " O ";
                break;
            case 9:
                gameBoard[4][4] = "O ";
                break;
            default:
                System.out.println("Something went wrong in the computer select class!");
        }
    }
}
