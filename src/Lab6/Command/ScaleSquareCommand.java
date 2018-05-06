package Lab6.Command;

public class ScaleSquareCommand implements Command {
    SquareRcevier squareRcevier;
    String[][] square = null;
    int size = 0;

    public ScaleSquareCommand(String[][] square, int size) {
        this.square = square.clone();
        this.size = size;
        squareRcevier = new SquareRcevier(square);
    }

    @Override
    public String[][] execute() {
        // TODO Auto-generated method stub
        return squareRcevier.scale(size);
    }

    @Override
    public String[][] undo() {
        squareRcevier.print(square);
        return square;
    }

}
