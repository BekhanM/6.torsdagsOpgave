package codeflow;

public class Cinema {
    String[][] seats;

    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X"; // Set director's seat to "X"
        // Initialize all other seats as "O" (uppercase 'O')
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    public boolean reserve(int row, int seat) {
        if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < seats.length; i++) {
            result.append("|");
            for (int j = 0; j < seats[i].length; j++) {
                result.append(seats[i][j]).append("|");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
