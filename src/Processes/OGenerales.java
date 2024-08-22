/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Processes;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import gui.TabPaises;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 *
 * @author dasan
 */
public class OGenerales {
    ArrayList<Object> data;
    public OGenerales(){
     try{
            FileOutputStream writeData = new FileOutputStream("BDUC.jto");
            try (ObjectOutputStream writeStream = new ObjectOutputStream(writeData)) {
                writeStream.writeObject(this.escribirArchivo());
                //writeStream.wr
                writeStream.flush();
            }
        }catch (IOException e) {
            System.out.println(e);
        }
}

    private Object escribirArchivo(){
        Object y ;
        TabPaises v1 = new TabPaises();
        y = v1.getData();
        return y;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean insertarMedallista(Medallista medallista){
        System.out.println("call from screen");
        return false;
    }
    public void leerArchivo(){
        try{
        FileInputStream readData = new FileInputStream("BDUC.jto");
            try (ObjectInputStream readStream = new ObjectInputStream(readData)) {
                data = (ArrayList<Object>) readStream.readObject();
            }
        System.out.println(data.toString());
        //JOptionPane.showMessageDialog(this, "Yes?");
    }catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
    }
        
    }
            
}
