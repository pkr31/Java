
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Test {
    public static void main(String args[]){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    try {
                        UIManager.setLookAndFeel(info.getClassName());
                    } catch (InstantiationException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
           
        }
        
        
        
       // DialogFrame d=new DialogFrame();
       // RadioButtonFrame d=new RadioButtonFrame();
      // ComboBoxFrame d=new ComboBoxFrame();
     // ListFrame d=new ListFrame();
        //SpinnerFrame d=new SpinnerFrame();
      //  SliderFrame d=new SliderFrame();
       // GraphicsFrame d=new GraphicsFrame();
        MagicNumberFrame d=new MagicNumberFrame();
        d.setLocation(10,10);
        d.setSize(1000,740);
        d.setVisible(true);
        
        d.setTitle("Dialog Frame");
    }
}
