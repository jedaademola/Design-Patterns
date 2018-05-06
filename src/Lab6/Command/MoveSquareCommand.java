package Lab6.Command;

public class MoveSquareCommand implements Command {
    SquareRcevier squareRcevier;
    String[][] square = null;
    int size = 0;

    public MoveSquareCommand(String[][] square, int size) {
        this.square = square.clone();
        this.size = size;
        squareRcevier = new SquareRcevier(square);
    }

    @Override
    public String[][] execute() {

        return squareRcevier.move(size);
    }

    @Override
    public String[][] undo() {
        squareRcevier.print(square);

        return square;
    }

}
