/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Processes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Sala_04
 */
public class Medallista {
    private String nombreCompleto;
    private String pais;
    private String nombreDeporte;
    private String categoria;
    private String disciplina;
    private String hobbie;
    private String FecNac;
    private String Edad;

    public String getEdad() {
        return Edad;
    }

    public String getHobbie() {
        return hobbie;
    }

    public void setHobbie(String hobbie) {
        this.hobbie = hobbie;
    }

    public String getFecNac() {
        return FecNac;
    }

    public void setFecNac(String FecNac) {
        this.FecNac = FecNac;
    }

    public Medallista(String nombreCompleto, String pais, String nombreDeporte, String categoria, String disciplina,String hobbie,String FecNac) throws ParseException {
        this.nombreCompleto = nombreCompleto;
        this.pais = pais;
        this.nombreDeporte = nombreDeporte;
        this.categoria = categoria;
        this.disciplina = disciplina;
        this.hobbie = hobbie;
        this.FecNac = FecNac;
        this.Edad=String.valueOf(this.calcularEdad());
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public int calcularEdad() throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dateStr = formatter.parse(FecNac);
        String formattedDate = formatter.format(dateStr);
        System.out.println("dd-MM-yyyy date is ==>"+formattedDate);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);        
        return 20;
    }   
}