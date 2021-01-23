import javax.swing.JOptionPane;

public class Leitor {

    public static int leInteiroDoTeclado(String mensagem) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, mensagem));
    }

}