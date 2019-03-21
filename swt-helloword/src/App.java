import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("hello world!");
        shell.open();
        while(!shell.isDisposed()){
            if(!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}