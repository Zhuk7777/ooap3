import java.util.Stack;

public class RemoteControl {
    Command[] commands;
    Stack<Command> undoStack;
    Stack<Command> redoStack;

    public RemoteControl()
    {
        commands=new Command[3];
        undoStack=new Stack<Command>();
        redoStack=new Stack<Command>();

        Command noCommand=new NoCommand();
        for(int i=0;i<3;i++)
        {
            commands[i] = noCommand;
        }
    }

    public void setCommand(int slot, Command command)
    {
        commands[slot]=command;

    }

    public void ButtonWasPushed(int slot)
    {
        commands[slot].execute();
        undoStack.push(commands[slot]);
    }

    public void undoButtonWasPushed()
    {
        if(undoStack.empty()!=true) {
            undoStack.peek().execute();
            redoStack.push(undoStack.peek());
            undoStack.pop();
        }
    }

    public void redoButtonWasPushed()
    {
        if(redoStack.empty()!=true) {
            redoStack.peek().execute();
            undoStack.push(redoStack.peek());
            redoStack.pop();
        }
    }

}
