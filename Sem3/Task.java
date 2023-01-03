import other.Presenter;
import other.ConsoleView;
import other.View;

public class Task {
    public static void main(String[] args) {
        Presenter<View> prog = new Presenter<View>(new ConsoleView());
        prog.start();
    }
}
