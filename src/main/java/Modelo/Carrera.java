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
public class Carrera {
    private Integer idCarrera;
    private String nomCarrera;
    
    private ArrayList<Plan> planes;
    
    //constructor

    public Carrera(Integer idCarrera, String nomCarrera) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        
        this.planes=new ArrayList();
    }
    
    //funcionalidades
    
    public void agregarPlan(Plan plan) throws Exception{
        if(existePlan(plan)){
            throw new Exception("El plan ID"+plan.getIdPlan()+" ya está cargado en el sistema.");
        }
        
        this.planes.add(plan);
    }
    
    public void agregarPlanes(ArrayList<Plan> planes) throws Exception{
        for(Plan plan:planes){
            agregarPlan(plan);
        }
    }
    
    public Plan buscarPlan(String nomPlan){
        for(Plan plan:planes){
            if(plan.getNomPlan().equalsIgnoreCase(nomPlan)){
                return plan;
            }
        }
        
        return null;
    }
    
    public Plan buscarPlan(Integer idPlan){
        for(Plan plan:planes){
            if(plan.getIdPlan().equals(idPlan)){
                return plan;
            }
        }
        
        return null;
    }
    
    public void editarPlan(Plan plan, String nomPlan) throws Exception{
        if(!existePlan(plan)){
            throw new Exception("El plan "+plan.getNomPlan()+" no está cargado en el sistema.");
        }
        
        plan.setNomPlan(nomPlan);
    }
    
    public void removerPlan(Plan plan) throws Exception{
        if(!existePlan(plan)){
            throw new Exception("El plan "+plan.getNomPlan()+" no está cargado en el sistema.");
        }
        
        planes.remove(plan);
    }
    
    public boolean existePlan(Plan plan){
        if(planes.isEmpty()){
            return false;
        }
        
        return planes.contains(plan);
    }
    
    @Override
    public String toString(){
        return this.nomCarrera;
    }
    
    //setters

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }
    //getters

    public Integer getIdCarrera() {
        return idCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public ArrayList<Plan> getPlanes() {
        return planes;
    }
}
