import javax.swing.JOptionPane;

public class Leitor {

    public static int leInteiroDoTeclado(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }
    
    public static String leStringDoTeclado(String mensagem) {
        return JOptionPane.showInputDialog(null, mensagem);
    }
}