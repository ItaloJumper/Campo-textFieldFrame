package textfieldframe;
//testando TextFieldFrame
import javax.swing.JFrame;
public class TextFieldTest {
    public static void main(String[] args){
        TextFieldFrame textFieldFrame = new TextFieldFrame();
        textFieldFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textFieldFrame.setSize(350, 100); //configura o tamanho do frame
        textFieldFrame.setVisible(true); //exibe o frame
        
    }//fim do Main
}//fim da classe
