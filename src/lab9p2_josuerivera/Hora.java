/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_josuerivera;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author josue
 */
public class Hora implements Runnable{
    JLabel hora;
    JLabel dia;

    public Hora(JLabel hora, JLabel dia) {
        this.hora = hora;
        this.dia = dia;
    }
    

    @Override
    public void run() {
        while (true) {
            Date fecha = new Date();
            SimpleDateFormat df  = new SimpleDateFormat("dd/MM/yyyy");
            String f = df.format(fecha);
            dia.setText(f);
            SimpleDateFormat h = new SimpleDateFormat("hh:mm:ss");
            String ho = h.format(fecha);
            hora.setText(ho);
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            
        }
    }
    
}
