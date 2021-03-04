public class PlayerSelect extends Main{
    public void playerSelector() {
        switch (playerPositions) {
                case 1:
                    gameBoard[0][0] = " X";
                    break;
                case 2:
                    gameBoard[0][2] = " X ";
                    break;
                case 3:
                    gameBoard[0][4] = "X ";
                    break;
                case 4:
                    gameBoard[2][0] = " X";
                    break;
                case 5:
                    gameBoard[2][2] = " X ";
                    break;
                case 6:
                    gameBoard[2][4] = "X ";
                    break;
                case 7:
                    gameBoard[4][0] = " X";
                    break;
                case 8:
                    gameBoard[4][2] = " X ";
                    break;
                case 9:
                    gameBoard[4][4] = "X ";
                    break;
                default:
                    System.out.println("Something went wrong in the PlayerSelect class!");
        }

    }
}

