/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projetocompfisica;

import Banco.Iluminaçao;
import Banco.IluminaçaoDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wesle
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GUI();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime(); // Ou qualquer outra forma que tem
        String dataFormatada = sdf.format(hora);
        System.out.println("Data:"+ dataFormatada);
        
        
        
        Date data = new Date();
        System.out.println("Data Agora: "+data);
        System.out.println("teste banco");
        IluminaçaoDao ilu = new IluminaçaoDao();
        Iluminaçao teste = new Iluminaçao();
        teste.setNumLampada(5);
        teste.setHoraacender(data); // o tipo Data salva "Sat Jun 30 15:26:11 BRT 2018"  mas como os atributo Hora ta salvo como TIME so vai pega a hora, e os data vai pega a data
        teste.setHoraapagar(data);
        teste.setDataapaga(data);
        teste.setDataacende(data);
        ilu.persist(teste);
        System.out.println("fim teste banco");
    }
    
}
