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
    
    //constructores

    public Carrera(Integer idCarrera, String nomCarrera, ArrayList planes) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.planes = new ArrayList<>();
        
        agregarPlanes(planes);
    }

    public Carrera(Integer idCarrera, String nomCarrera) {
        this.idCarrera = idCarrera;
        this.nomCarrera = nomCarrera;
        this.planes = new ArrayList<>();
    }
    
    //funcionalidades
    
    @Override
    public String toString(){
        return this.nomCarrera;
    }
    
    public void agregarPlanes(ArrayList<Plan> planes){
        for(Plan plan:planes){
            if(!existePlan(plan)){
                agregarPlan(plan);
            }
        }
    }
    
    public void agregarPlan(Plan unPlan){
        if(!existePlan(unPlan)){
            this.planes.add(unPlan);
        }
    }
    
    public void removerPlan(int idPlan){
        for(Plan plan:this.planes){
            if(plan.getIdPlan()==idPlan){
                this.planes.remove(plan);
            }
        }
    }
    
    public boolean existePlan(Plan unPlan){
        for(Plan i:planes){
            if(unPlan.getIdPlan()==i.getIdPlan()){
                return true;
            }
        }
        
        return false;
    }
    
    //getters & setters
    
    public Integer getIdCarrera() {
        return idCarrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public ArrayList getPlanes() {
        return planes;
    }

    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public void setPlanes(ArrayList planes) {
        this.planes = planes;
    }
}
