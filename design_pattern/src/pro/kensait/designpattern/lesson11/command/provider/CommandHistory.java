package pro.kensait.designpattern.lesson11.command.provider;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();
    private Stack<Command> undoHistory = new Stack<>();
    private Command nextCommand;

    public void addCommand(Command command) {
        history.push(command);
        this.nextCommand = command;
        undoHistory.clear();
    }

    public void back() {
        Command command = history.pop();
        command.cancel();
        undoHistory.push(command);
    }

    public void forward() {
        Command command = undoHistory.pop();
        command.execute();
    }

    public void redo() {
        nextCommand.execute();
        history.push(nextCommand);
        undoHistory.clear();
    }
}