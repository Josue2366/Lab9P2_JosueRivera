/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_josuerivera;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author josue
 */
public class Barra implements Runnable{
    JProgressBar barra;
    JTextArea texto;
    Boolean vivo;
    File arc;

    public Barra(JProgressBar barra, JTextArea texto, File arc) {
        this.barra = barra;
        this.texto = texto;
        this.vivo = true;
        this.arc = arc;
    }
    
    

    @Override
    public void run() {
        FileReader fr = null;
        BufferedReader br = null;
        barra.setValue(0);
        while(vivo){
            barra.setValue(barra.getValue()+1);
            if (barra.getValue() == 100){
                vivo = false;
            }
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
        }
        try {
           fr = new FileReader(arc);
           br=new BufferedReader(fr);
           String linea;
           texto.setText("");
           while(  (linea=br.readLine()) !=null  ){                    
                texto.append(linea);
                texto.append("\n");
            }
        } catch (Exception e) {
        }
        
        
    }
    
}
