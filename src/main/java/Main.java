public class Main {
    public static void main(String[] args) throws Exception {
        RemoteControl remoteControl=new RemoteControl();
        Window window=new Window();

        Command command=new WindowClose(window);
        remoteControl.setCommand(0,command);

        command=new WindowOpen(window);
        remoteControl.setCommand(2,command);

        command=new WindowHalfOpen(window);
        remoteControl.setCommand(1,command);

        System.out.println("\nButtonPushed:\n");
        remoteControl.ButtonWasPushed(1);
        remoteControl.ButtonWasPushed(0);
        remoteControl.ButtonWasPushed(2);
        System.out.println("\nUndo:\n");

        remoteControl.undoButtonWasPushed();
        remoteControl.undoButtonWasPushed();
        System.out.println("\nRedo:\n");

        remoteControl.redoButtonWasPushed();




    }
}
