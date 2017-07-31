package model;

import java.util.ArrayList;
import org.jpl7.Query;

public class Consult {

    private String connect;
    private String consulta;
    private Query conexion;
    private Query execute;
    
    public Consult(ArrayList<String> list) {
        init();
        inputData(list);
    }
    
    public void init(){
        try{
            connect = "consult('vet.pl')";
            conexion = new Query(connect);
            System.out.println(connect + "   " + (conexion.hasMoreSolutions()?"Conexion Lista":"Conexion Rechazada"));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void inputData(ArrayList<String> list) {
        for (String symptom : list) {
            consulta = "assert(var(" + symptom +",si)).";
            execute = new Query(consulta);
            execute.hasSolution();
        }
    }
    
    public String getResult(){
        execute = new Query("diagnosticar(X).");
        if(execute.hasSolution()){
            return execute.oneSolution().get("X").toString();
        }
        return "No hay resultado";
    }
    
    public void cleanAsserts(){
        execute = new Query("retractall(var(_,_)).");
        if(execute.hasSolution()){
        }
    }
    
}
