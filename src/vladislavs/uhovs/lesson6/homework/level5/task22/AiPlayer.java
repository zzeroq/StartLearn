package vladislavs.uhovs.lesson6.homework.level5.task22;

import java.util.Random;

public class AiPlayer {

    private final Random random;
    private final TicTacToe ticTacToe;

    public AiPlayer(Random random, TicTacToe ticTacToe) {
        this.random = random;
        this.ticTacToe = ticTacToe;
    }

    private static final int AI = 1;
    private static final int HUMAN = 0;
    private static final int EMPTY = -1;

    public Move chooseMove(int[][] field){
        Move win = findWinningMove(field, AI);
        if (win != null){
            return win;
        }
        Move block = findWinningMove(field, HUMAN);
        if (block != null){
            return block;
        }
        return randomEmptyMove(field);
    }

    private Move tryWinningMove(int[][] field, int r, int c, int player){
        field[r][c] = player;
        boolean wins = ticTacToe.isWinPosition(field, player);
        field[r][c] = EMPTY;
        return wins ? new Move(r, c) : null;
    }

    private Move findWinningMove(int[][] field, int player) {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (field[r][c] == EMPTY) {
                    Move move = tryWinningMove(field, r, c, player);
                    if (move != null) return move;
                }
            }
        }
        return null;
    }

    private Move randomEmptyMove(int[][] field){
        int y = random.nextInt(3);
        int x = random.nextInt(3);
        while (field[y][x] != EMPTY) {
            y = random.nextInt(3);
            x = random.nextInt(3);
        }
        return new Move(y, x);
    }
}
