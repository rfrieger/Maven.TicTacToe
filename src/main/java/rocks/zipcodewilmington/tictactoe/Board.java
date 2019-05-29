package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character [][] state;
    public Board(Character[][] matrix) {
        state = matrix;
    }

    public Boolean isInFavorOfX() {
        boolean rowWins = false;
        boolean colwins = false;
        boolean diawins =false;

        for (int i = 0; i <state.length ; i++) {
            for (int j = 0; j < state.length ; j++) {
                if((state[i][j]).equals('X')) {
                    rowWins = true;
                } else {
                    rowWins = false;
                    break;
                }
            }
            if (rowWins == true) {
                break;
            }
        }

        for (int k = 0; k <state.length ; k++) {
            for (int l = 0; l < state.length ; l++) {
                if((state[l][k]).equals('X')) {
                    colwins = true;
                } else {
                    colwins = false;
                    break;
                }
            }
            if (colwins == true) {
                break;
            }
        }

        if (state[0][0].equals('X') && state[1][1].equals('X') && state[2][2].equals('X') ||
                state[2][0].equals('X') && state[1][1].equals('X') && state[0][2].equals('X')
        ) {
            diawins = true;
        }

        System.out.println(" ");

        if(diawins || rowWins || colwins) {
            return true;
        } else {
            return false;
        }
    }




    public Boolean isInFavorOfO() {
        boolean rowWins = false;
        boolean colwins = false;
        boolean diawins =false;

        for (int i = 0; i <state.length ; i++) {
            for (int j = 0; j < state.length ; j++) {
                if((state[i][j]).equals('O')) {
                    rowWins = true;
                } else {
                    rowWins = false;
                    break;
                }
            }
            if (rowWins == true) {
                break;
            }
        }

        for (int k = 0; k <state.length ; k++) {
            for (int l = 0; l < state.length ; l++) {
                if((state[l][k]).equals('O')) {
                    colwins = true;
                } else {
                    colwins = false;
                    break;
                }
            }
            if (colwins == true) {
                break;
            }
        }
        /// handel
        if (state[0][0].equals('O') && state[1][1].equals('O') && state[2][2].equals('O') ||
                state[2][0].equals('O') && state[1][1].equals('O') && state[0][2].equals('O')
        ) {
            diawins = true;
        }

        System.out.println("");

        if(diawins ==true || rowWins ==true || colwins ==true) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean isTie() {

       if (!isInFavorOfO() == true && !isInFavorOfX() == true) {
           return true;
       } else return false;
    }

    public String getWinner() {
        if (isInFavorOfX() == true) {
            return "X";
        } else if (isInFavorOfO() ==true) {
            return "O";
        } else return "";

    }

}



