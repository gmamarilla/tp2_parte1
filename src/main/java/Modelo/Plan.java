/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

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
        this.materias=new ArrayList<>();
    }
    
    public Plan(Integer idPlan, String nomPlan, Integer anioInicio) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias=new ArrayList<>();
    }
    
    //funcionalidades
    
    @Override
    public String toString(){
        return this.nomPlan;
    }
    
    public void agregarMaterias(ArrayList<Materia> materias){
        for(Materia materia:materias){
            if(!existeMateria(materia)){
                agregarMateria(materia);
            }
        }
    }
    
    public void agregarMateria(Materia unaMateria){
        if(!existeMateria(unaMateria)){
            this.materias.add(unaMateria);
        }
    }
    
    public void removerMateria(int idMateria){
        for(Materia materia:this.materias){
            if(materia.getIdMat()==idMateria){
                this.materias.remove(materia);
            }
        }
    }
    
    public boolean existeMateria(Materia unaMateria){
        for(Materia materia:this.materias){
            if(materia.getIdMat()==unaMateria.getIdMat()){
                return true;
            }
        }
        
        return false;
    }
    
    //getters & setters

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

    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    
}
