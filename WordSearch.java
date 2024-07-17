public class WordSearch {

    static boolean isWordFound(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0) && find(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean find(char[][] board, String word, int i, int j, int index) {

        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >=board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' ';

        boolean found = find(board, word, i + 1, j, index + 1) ||
                find(board, word, i, j + 1, index + 1) ||
                find(board, word, i - 1, j, index + 1) ||
                find(board, word, i, j - 1, index + 1);

        board[i][j] = temp;
        return found;
    }

    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C'} ,{'A', 'B', 'D'},{'B', 'C', 'D'}};
        String word = "ABE";

        System.out.println(isWordFound(board,word));

    }
}

//Input : string, output : Boolean
//Given a string and task is to find that given string in any board which has rows and columns
//for loops to access each row and column, if condition to check each character in the string
//Write a function to find each character exists in the string
//Check if the index of that word meets the length of the word then return true
//Check roe < 0, column < 0, row exceeds board length, column exceeds board(row) length and character defined at row+column is not correct then return false
//Store the character into temp variable
//Assign space to the present row+column position
//Find in all the directions(4)
//Return the result