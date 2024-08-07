package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Teste3 {
    // encaminhando a exceção para o método que o invocou
    public static String formata(String m, String v) throws ParseException {
        String resultado = "";
        MaskFormatter mask = new MaskFormatter(m); // dispara uma exceção verificada
        mask.setValueContainsLiteralCharacters(false);
        mask.setPlaceholderCharacter('_');
        resultado = mask.valueToString(v);
        return resultado;
    }
    public static void main(String[] args) {
        try {
            System.out.println(formata("(##) #####−####", "48998765432"));
        } catch (ParseException e) {
            System.err.println("Erro ao formatar a String");
        }
    }

}
