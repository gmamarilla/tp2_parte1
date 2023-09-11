/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Vista;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Tp2 {

    public static void main(String[] args) {
        Carrera carrera1, carrera2;
        Plan plan1, plan2, plan3, plan4;
        Materia materia1,materia2,materia3,materia4;
        
        carrera1=new Carrera(123,"Ingenieria Quimica");
        carrera2=new Carrera(332,"Arquitectura");
        
        plan1=new Plan(331,"Ingenieria Quimica 20",2020);
        plan2=new Plan(224,"Ingenieria Quimica 15",2015);
        plan3=new Plan(339,"Ingenieria Quimica 22",2022);
        
        plan4=new Plan(201,"Arquitectura 19",2019);
        
        materia1=new Materia(1003,"Fisica I",1);
        materia2=new Materia(1203,"Fisica II",2);
        
        materia3=new Materia(990,"Calculo I",1);
        materia4=new Materia(990,"Calculo II",2);
        
        //Se agregan 3 planes a 1 carrera y 1 plan a la otra carrera
        carrera1.agregarPlan(plan1);
        carrera1.agregarPlan(plan2);
        carrera1.agregarPlan(plan3);
        
        carrera2.agregarPlan(plan4);
        
        //Se agregarn 2 carreras a cada plan
        plan1.agregarMateria(materia1);
        plan1.agregarMateria(materia2);
        
        plan2.agregarMateria(materia1);
        plan2.agregarMateria(materia2);
        
        plan3.agregarMateria(materia1);
        plan3.agregarMateria(materia2);
        
        plan4.agregarMateria(materia3);
        plan4.agregarMateria(materia4);
        
        System.out.println(mostrarCarrera(carrera1));
        System.out.println(mostrarCarrera(carrera2));
    }
    
    public static String mostrarCarrera(Carrera unaCarrera){
        String salida="";
        ArrayList<Plan> planes=unaCarrera.getPlanes();
        ArrayList<Materia> materias;
        
        salida+="Nombre de la carrera: "+unaCarrera.toString();
        
        for(Plan plan:planes){
            salida+="\n"+"Nombre del plan: "+plan.toString();
            
            materias=plan.getMaterias();
            
            salida+="\n"+"Materias del plan:";
            
            for(Materia materia:materias){
                salida+="\n"+materia.toString();
            }
        }
        
        return salida;
    }
}
