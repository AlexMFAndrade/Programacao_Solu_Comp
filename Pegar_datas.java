package pegar_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pegar_datas {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato_data = new SimpleDateFormat("dd/MM/yyyy");
        String data_aniver = "30/07/1994";
        Date dataFormatada = formato_data.parse(data_aniver);
        System.out.println(dataFormatada);
        System.out.println(formato_data.format(dataFormatada));
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataFormatada);
        System.out.println("Ano: "+calendario.get(Calendar.YEAR));
        System.out.println("Mês: "+calendario.get(Calendar.MONTH));
        System.out.println("Dia: "+calendario.get(Calendar.DAY_OF_MONTH));
        
        Date hoje = new Date();
        Calendar calend_hj = Calendar.getInstance();
        calend_hj.setTime(hoje);
        System.out.println("Ano: "+calend_hj.get(Calendar.YEAR));
        
        System.out.println("Idade: "+(calend_hj.get(Calendar.YEAR)-calendario.get(Calendar.YEAR)));
    }
    
}
