package vladislavs.uhovs.lesson5.lesson.array;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {

        char[][] board = {
                {'x','.','x'},
                {'.','o','.'},
                {'o','.','o'}
        };

        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));

        // 0 - row, 1 - column
        board[0][1] = 'x';

    }
}
