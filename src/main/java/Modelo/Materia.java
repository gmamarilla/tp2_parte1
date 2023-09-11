/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Gustavo
 */
public class Materia {
    private Integer idMat;
    private String nomMat;
    private Integer anioCursado;

    public Materia(Integer idMat, String nomMat, Integer anioCursado) {
        this.idMat = idMat;
        this.nomMat = nomMat;
        this.anioCursado = anioCursado;
    }
    
    //funcionalidades
    
    @Override
    public String toString(){
        return this.idMat+"\t"+this.nomMat+"\t"+this.anioCursado;
    }
    
    //getters & setters

    public Integer getIdMat() {
        return idMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public Integer getAnioCursado() {
        return anioCursado;
    }

    public void setIdMat(Integer idMat) {
        this.idMat = idMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public void setAnioCursado(Integer anioCursado) {
        this.anioCursado = anioCursado;
    }
}
