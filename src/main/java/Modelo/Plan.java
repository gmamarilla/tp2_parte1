/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Gustavo
 */
public class Plan {
    private Integer idPlan;
    private String nomPlan;
    private Integer anioInicio;
    
    private ArrayList<Materia> materias;
    
    //constructor

    public Plan(Integer idPlan, String nomPlan, Integer anioInicio, ArrayList<Materia> materias) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        
        this.materias=new ArrayList();
    }
    
    public Plan(Integer idPlan, String nomPlan, Integer anioInicio) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias=new ArrayList<>();
    }
    
    //funcionalidades
    
    public void agregarMateria(Materia materia) throws Exception{
        if(existeMateria(materia)){
            throw new Exception("La materia "+materia.getNomMat()+" ya está cargada en el sistema.");
        }
        
        this.materias.add(materia);
    }
    
    public void agregarMaterias(ArrayList<Materia> materias) throws Exception{
        for(Materia materia:materias){
            agregarMateria(materia);
        }
    }
    
    public Materia buscarMateria(Integer idMat){
        for(Materia materia:materias){
            if(materia.getIdMat().equals(idMat)){
                return materia;
            }
        }
        
        return null;
    }
    
    public Materia buscarMateria(String nomMat){
        for(Materia materia:materias){
            if(materia.getNomMat().equalsIgnoreCase(nomMat)){
                return materia;
            }
        }
        
        return null;
    }
    
    public void editarMateria(Materia materia, String nomMat, Integer anioCursado) throws Exception{
        if(!existeMateria(materia)){
            throw new Exception("La materia "+materia.getNomMat()+"no está cargada en el sistema.");
        }
        
        materia.setNomMat(nomMat);
        materia.setAnioCursado(anioCursado);
    }
    
    public void removerMateria(Materia materia) throws Exception{
        if(!materias.contains(materia)){
            throw new Exception("La materia "+materia.toString()+" no está cargada en el sistema.");
        }
        
        materias.remove(materia);
    }
    
    public boolean existeMateria(Materia materia){
        if(materias.isEmpty()){
            return false;
        }
        
        return materias.contains(materia);
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idPlan);
        hash = 29 * hash + Objects.hashCode(this.nomPlan);
        hash = 29 * hash + Objects.hashCode(this.anioInicio);
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
        final Plan other = (Plan) obj;
        if (!Objects.equals(this.nomPlan, other.nomPlan)) {
            return false;
        }
        if (!Objects.equals(this.idPlan, other.idPlan)) {
            return false;
        }
        return Objects.equals(this.anioInicio, other.anioInicio);
    }
    
    @Override
    public String toString(){
        return this.nomPlan;
    }
    
    //setters

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    //getters

    public Integer getIdPlan() {
        return idPlan;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public Integer getAnioInicio() {
        return anioInicio;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
}
