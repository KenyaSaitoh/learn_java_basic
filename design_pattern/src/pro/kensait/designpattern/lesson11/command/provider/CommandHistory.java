package pro.kensait.designpattern.lesson11.command.provider;

import java.util.EmptyStackException;
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
        Command command;
        try {
            command = history.pop();
        } catch(EmptyStackException ese) {
            // 履歴にこれ以上エントリがない場合
            // ここでは何もせずにリターンする
            return;
        }
        command.cancel();
        undoHistory.push(command);
    }

    public void forward() {
        Command command;
        try {
            command = undoHistory.pop();
        } catch(EmptyStackException ese) {
            // 履歴にこれ以上エントリがない場合
            // ここでは何もせずにリターンする
            return;
        }
        command.execute();
    }

    public void redo() {
        nextCommand.execute();
        history.push(nextCommand);
        undoHistory.clear();
    }
}