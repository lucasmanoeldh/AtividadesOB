
import javax.swing.JDialog;
import javax.swing.JFrame;
import jdk.nashorn.internal.scripts.JD;


 
public class TestaJanela {
    public static void main(String[] args) {
      
        JFrame janela = new JFrame();
        janela.setTitle("Minha Janela");
        janela.setSize(600,700);
        janela.setLocationRelativeTo(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janela.setVisible(true);
    
        JFrame janela2= new JFrame();
        janela2.setTitle("Segunda Janela");
        janela2.setSize(300,300);
        janela2.setVisible(true);
        
        JDialog dialogo = new JDialog();
        dialogo.setTitle("Minha caixa de dialogo");
        //dialogo.setModal(true);
        dialogo.setSize(200,100);
        dialogo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialogo.setLocationRelativeTo(null);
        dialogo.setVisible(true);
    }       
        
       
}
