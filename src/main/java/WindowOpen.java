public class WindowOpen implements Command{
    Window window;

    public WindowOpen(Window window)
    {
        this.window=window;
    }


    public void execute() {
        window.open();
    }

}
