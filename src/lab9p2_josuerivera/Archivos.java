/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p2_josuerivera;

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

    public Archivos(File arc, JTextArea texto) {
        this.arc = arc;
        this.texto = texto;
    }

    

    public JTextArea getTexto() {
        return texto;
    }

    public void setTexto(JTextArea texto) {
        this.texto = texto;
    }
    public void leerarc(){
        
    }
    public void escribirarc() throws IOException{
        String info = texto.getText();
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arc);
            bw = new BufferedWriter(fw);
            bw.write(info);
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
        
    }
    
}
