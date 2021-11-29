import java.util.Scanner;

public class Exercise7 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] gameBoard = {{'-', '-', '-'}, {'-', '-', '-'}, {'-', '-', '-'}};
        printBoard(gameBoard);
        char player = 'O';
        boolean state = true;
        int count = 0;
        while(count < 9 && state) {
            count++;
            if(player == 'O')
                player = 'X';
            else player = 'O';
            state = !placeSymbolOnBoard(gameBoard, getPositionFromUser(gameBoard), player);
        }
        System.out.println("GAME OVER");
    }

    public static void printBoard(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            System.out.println();
            for(int j = 0; j < board.length; j++)
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean isAvailable(char[][] board, int place) {
        if(board[place / 3][place % 3] == '-') return true;
        return false;
    }

    public static int getPositionFromUser(char[][] board) {
        System.out.println("Choose the location of your symbol(1 - 9)");
        int place = scanner.nextInt();
        place--;
        if(place < 0 || place > 8) {
            System.out.println("This location does not exist , try again");
            getPositionFromUser(board);
        }
        else if(!isAvailable(board, place)) {
            System.out.println("This location is occupied.");
            getPositionFromUser(board);
        }
        return place;
    }

    public static char checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++)
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-')
                return board[i][0];

        for (int j = 0; j < 3; j++)
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-')
                return board[0][j];

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-')
            return board[0][0];

        if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != '-')
            return board[2][0];

        return '-';
    }

    public static boolean placeSymbolOnBoard(char[][] board, int place, char symbol) {
        board[place / 3][place % 3] = symbol;
        printBoard(board);
        char winner = checkWinner(board);
        if(winner != '-') {
            System.out.println(winner + " is the winner!");
            return true;
        }
        return false;
    }
}