package Lab6.Command;

public class CreateSquareCommand implements Command {
    SquareRcevier squareRcevier = new SquareRcevier();
    String[][] square = null;
    int size = 0;

    public CreateSquareCommand(int size) {
        this.size = size;
    }

    @Override
    public String[][] execute() {
        // TODO Auto-generated method stub
        return squareRcevier.create(size);
    }

    @Override
    public String[][] undo() {
        // TODO Auto-generated method stub
        squareRcevier.print(square);
        return square;
    }

}
