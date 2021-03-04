import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckWinner extends Main{
    public void winner() {
        List topRow = Arrays.asList(1, 2, 3);
        List middleRow = Arrays.asList(4, 5, 6);
        List bottomRow = Arrays.asList(7, 8, 9);

        List leftRow = Arrays.asList(1, 4, 7);
        List centerRow = Arrays.asList(2, 5, 8);
        List rightRow = Arrays.asList(3, 6, 9);

        List leftRightDiagonal = Arrays.asList(1, 5, 9);
        List RightLeftDiagonal = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(middleRow);
        winning.add(bottomRow);

        winning.add(leftRow);
        winning.add(centerRow);
        winning.add(rightRow);

        winning.add(leftRightDiagonal);
        winning.add(RightLeftDiagonal);

        for (List l : winning) {
            if (listPlayerPositions.containsAll(l)) {
                System.out.println("Congratulations, you won!");
                gameActive=false;
            } else if (listComputerPositions.containsAll(l)) {
                System.out.println("Computer won! Keep practicing");
                gameActive=false;
            } else if (listPlayerPositions.size() + listComputerPositions.size() == 9){
                System.out.println("It's a tie!");
                gameActive=false;
            }
        }

    }
}
