import becker.robots.*;
import java.util.Random;
import java.util.ArrayList;
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

    public static void robotNavToCoords(Robot rMove, int xDest, int yDest) {
        while (rMove.getStreet() != xDest && rMove.getAvenue() != yDest) {
            int bestChoice = Integer.MAX_VALUE;

            double northDist;
            robotTurnToFaceDir(rMove, Direction.NORTH);
            if (!rMove.frontIsClear()) {
                northDist = Double.MAX_VALUE;
            } else {
                northDist = Math.sqrt((rMove.getAvenue() - xDest) * (rMove.getAvenue() - xDest) + (rMove.getStreet() - 1 - yDest) * (rMove.getStreet() - 1 - yDest));
            }
            double westDist;
            robotTurnToFaceDir(rMove, Direction.WEST);
            if (!rMove.frontIsClear()) {
                westDist = Double.MAX_VALUE;
            } else {
                northDist = Math.sqrt((rMove.getAvenue() - 1 - xDest) * (rMove.getAvenue() - 1 - xDest) + (rMove.getStreet() - yDest) * (rMove.getStreet() - yDest));
            }   // TODO: finish this
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        City ct = new City(10, 10);
        Robot rb = new Robot(ct, 0, 0, Direction.EAST);

        // make 10 garbage things
        //int[][] garbagePos = {{rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}, {rand.nextInt(10), rand.nextInt(10)}};
        ArrayList<int[]> garbagePos = new ArrayList<int[]>();
        int[] toAddGarbageTemp = new int[2];
        for (int c = 0; c < 9; c++) {
            toAddGarbageTemp[0] = rand.nextInt(10);
            toAddGarbageTemp[1] = rand.nextInt(10);
            garbagePos.add(toAddGarbageTemp);
        }
        Thing[] garbage = new Thing[10];
        for (int c = 0; c < 10; c++) {
            garbage[c] = new Thing(ct, garbagePos.get(c)[0], garbagePos.get(c)[1]);
        }
        Wall w = new Wall(ct, 0, 1, Direction.WEST);


        while (garbagePos.size() > 0) {

        }
    }
}
