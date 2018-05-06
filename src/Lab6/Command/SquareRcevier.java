package Lab6.Command;

public class SquareRcevier {
    // int size = 0;
    // public SquareRcevier(int size) {
    // this.size = size;
    // }

    String[][] square = null;

    public SquareRcevier() {

    }

    public SquareRcevier(String[][] square) {
        this.square = square;
    }

    public String[][] create(int size) {
        square = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                square[i][j] = "+";
                System.out.print(square[i][j]);
            }

            System.out.println();
        }

        return square;

    }

    public String[][] scale(int scale) {
        int newSize = square.length * scale;

        square = new String[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                square[i][j] = "+";
                System.out.print(square[i][j]);
            }

            System.out.println();
        }

        return square;

    }

    public String[][] move(int move) {
        int col = square[0].length + move;
//		System.out.println(col);

        square = new String[square.length][col];


        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < col; j++) {
                if (j < square[0].length - square.length) {
                    square[i][j] = " ";
                } else {
                    square[i][j] = "+";
                }

                System.out.print(square[i][j]);
            }

            System.out.println();
        }

        return square;

    }

    public String[][] print(String[][] square) {

        if (square == null) {
            System.out.println("deleted square");
            return null;
        }

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                square[i][j] = "+";
                System.out.print(square[i][j]);
            }

            System.out.println();
        }

        return square;

    }
//	
//	public static void main(String args[]) {
//		SquareRcevier squareRcevier = new SquareRcevier();
//		squareRcevier.create(1);
//		System.out.println("\n\n\n");
//		squareRcevier.scale(2);
//		System.out.println("\n\n\n");
//		squareRcevier.move(1);
//		squareRcevier.move(2);
//		squareRcevier.move(2);
//		squareRcevier.move(2);
//		squareRcevier.move(1);
//	
//
//
//		
//	}


}
