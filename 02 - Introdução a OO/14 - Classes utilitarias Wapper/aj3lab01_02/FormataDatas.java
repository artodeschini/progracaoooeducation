/*
 * FomataDatas.java
 *
 */

// 1. declare imports para as classes
// SimpleDateFormat, Calendar e Date
public class FormataDatas {

    public static void main(String[] args) {
        // 2. instancie um objeto calendar
        Calendar cal = null;
        // 3. modifique os os componentes de tempo
        // para o dia 03 de março de 1997, às 18h57m0s
        // 4. obtenha um objeto java.util.Date a partir do calendario
        Date data = null;
        System.out.println("data d1: " + data);
        // 5. construa um objeto de formatacao para obter
        // formatacoes de datas segundo o exemplo: 03/Mar/97 18h00m00
        SimpleDateFormat formatador = null;
        System.out.println("data formatada: " + formatador.format(data));
        System.out.println("data atual formatada: " + formatador.format(new Date()));
    }
}
