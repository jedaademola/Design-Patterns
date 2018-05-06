package Lab6.Command;

import java.util.Stack;

public class SquareSystemManager {

    public static void main(String[] args) {

        Stack<Command> commandsExecuted = new Stack<Command>();

        Command currentCommand = new CreateSquareCommand(2);
        commandsExecuted.push(currentCommand);

        String[][] square = currentCommand.execute();


        currentCommand = new ScaleSquareCommand(square, 4);
        commandsExecuted.push(currentCommand);

        square = currentCommand.execute();

        currentCommand = new MoveSquareCommand(square, 3);
        commandsExecuted.push(currentCommand);

        currentCommand.execute();


        commandsExecuted.pop().undo();
        commandsExecuted.pop().undo();
        commandsExecuted.pop().undo();


    }

}
