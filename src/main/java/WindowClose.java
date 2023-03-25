public class WindowClose implements Command{
    Window window;

    public WindowClose(Window window)
    {
        this.window=window;
    }

    public void execute() {
        window.close();
    }


}
