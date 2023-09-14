/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Objects;

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
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.idMat);
        hash = 19 * hash + Objects.hashCode(this.nomMat);
        hash = 19 * hash + Objects.hashCode(this.anioCursado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (!Objects.equals(this.nomMat, other.nomMat)) {
            return false;
        }
        if (!Objects.equals(this.idMat, other.idMat)) {
            return false;
        }
        return Objects.equals(this.anioCursado, other.anioCursado);
    }
    
    @Override
    public String toString(){
        return this.idMat+"\t"+this.nomMat+"\t"+this.anioCursado;
    }
    
    //setters

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

    public void setAnioCursado(Integer anioCursado) {
        this.anioCursado = anioCursado;
    }
    
    //getters

    public Integer getIdMat() {
        return idMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public Integer getAnioCursado() {
        return anioCursado;
    }
}
