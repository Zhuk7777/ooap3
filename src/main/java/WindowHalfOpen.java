public class WindowHalfOpen implements Command{
    Window window;

    public WindowHalfOpen(Window window)
    {
        this.window=window;
    }
    public void execute() {
        window.halfOpen();
    }

}
