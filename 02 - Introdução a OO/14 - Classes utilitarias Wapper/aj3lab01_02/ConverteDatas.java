/*
 * ConverteDatas.java
 *
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverteDatas {

    public static void main(String[] args) throws ParseException {
        if (args.length != 2) {
            System.out.println("Informe uma padrao de formatacao e uma data");
            System.out.println("Exemplo: java ConverteDatas yyyy.MM.dd 2004.06.09");
            return;
        }
        String mascara = args[0];
        String textoParaConverter = args[1];
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        Date data = formatador.parse(textoParaConverter);
        System.out.println("objeto Date convertido: " + data.toString());
    }
}
