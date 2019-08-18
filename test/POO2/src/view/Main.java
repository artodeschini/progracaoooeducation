/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author daniel.s.oliveira
 */
public class Main {
    
    public static void main(String[] args) {
        
        java.util.Date dataUtil = new Date("2013/6/24");
        
        java.sql.Date dataSql = new java.sql.Date(113, 1, 1);
        
        //dataSql = new java.sql.Date(dataUtil.getTime());// dataUtil;
        
        // dataUtil = dataSql; //FUNCIONA
        // dataSql = dataUtil; //NAO FUNCIONA
        
        
        System.out.println(dataUtil);
        
        System.out.println(dataSql);
                
    }
    
}
