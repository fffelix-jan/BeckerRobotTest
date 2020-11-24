import becker.robots.*;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void turnRobotRight(Robot rTr) {
        rTr.turnLeft();
        rTr.turnLeft();
        rTr.turnLeft();
    }

    public static void robotTurnToFaceDir(Robot rTurnfd, Direction gDir) {
        while (rTurnfd.getDirection() != gDir) {
            rTurnfd.turnLeft();
        }
    }

/*    public static void robotNavToCoords(Robot rMove, int xDest, int yDest) {
        while (rMove.getStreet() != xDest && rMove.getAvenue() != yDest) {
            int bestChoice = Integer.MAX_VALUE;

            int northDist;
            robotTurnToFaceDir(rMove, Direction.NORTH);

        }
    }*/

    public static void main(String[] args) {
        Random rand = new Random();
        City ct = new City(10, 10);
        Robot rb = new Robot(ct, 0, 0, Direction.EAST);

        // make 10 garbage things
        Thing[] garbage = new Thing[10];
        for (int c = 0; c < 10; c++) {
            garbage[c] = new Thing(ct, rand.nextInt(10), rand.nextInt(10));
        }
        Wall w = new Wall(ct, 0, 1, Direction.WEST);

        

        for (Thing toPickUpG : garbage) {
            // while (toPickUpG.get) TODO: write this
        }
    }
}
