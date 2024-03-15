/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_josuerivera;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

/**
 *
 * @author josue
 */
public class Archivos {
    File arc;
    JTextArea texto;

    public Archivos(String x, JTextArea texto) {
        this.arc = new File(x);
        this.texto = texto;
    }

    

    public JTextArea getTexto() {
        return texto;
    }

    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }
    public void leerarc() throws IOException{
        FileReader fr = null;
        BufferedReader br = null;
        texto.setText("");
        if(arc.exists()){
            try {
                fr =new FileReader(arc);
                br = new BufferedReader(fr);
                String s;
                while((s = br.readLine()) != null){
                    texto.append(s);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            br.close();
            fr.close();
        }
    }
    public void escribirarc() throws IOException{
        String info= texto.getText();
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arc);
            bw = new BufferedWriter(fw);
            bw.write(info);
//            while((info = texto.getText()) != null){
//                bw.write(info);
//            }
            bw.flush();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
        
    }
    
}
