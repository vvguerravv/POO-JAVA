package engtelecom.poo;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Teste1 {

    public static String formata(String mascara, String valor){
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara); // dispara uma exceção verificada
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            System.err.println("Erro ao formatar a String");
        }
        return resultado;
    }
    public static void main(String[] args) {
        System.out.println(formata("(##) #####−####", "48998765432"));
    }

}
