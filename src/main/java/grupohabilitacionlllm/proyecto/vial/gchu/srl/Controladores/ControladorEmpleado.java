/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Controladores;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain.Empleado;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tincho
 */
public class ControladorEmpleado {
private int ids;
List<Empleado> empleados= new ArrayList<>();

    public ControladorEmpleado() {
        this.ids=1;
    }

    public void alta(String nombre, String apellido, int dni, int telefono, String direccion, LocalDate fechaNac){
        Empleado unEmpleado= new Empleado(ids, nombre,apellido, dni, telefono,direccion, fechaNac);
        this.ids++;
        empleados.add(unEmpleado);
    
    }
    
    public void baja(Empleado unEmpleado){
        empleados.remove(unEmpleado);
    }
    
    public void bajaLogica(Empleado unEmpleado){
        int index;

        index= empleados.indexOf(unEmpleado);
        unEmpleado.setEstadoBaja();
        empleados.set(index, unEmpleado);
      
 
        }
    
    public Empleado buscarId(int unId){
        Empleado encontro=null;
        
        try{
            for(Empleado emp_temp: empleados){
                if(emp_temp.getId()==unId){
                    encontro=emp_temp;
                }
            }
            
        }
        catch (Exception e){
            
        }
        return encontro;
    }
    
    
    public void modificar (Empleado unEmpleado){
        try{

        int index= empleados.indexOf(this.buscarId(unEmpleado.getId()));
        empleados.set(index,unEmpleado);
            
        }catch(Exception e){
            
        }
    }
    
    public Empleado buscarNombreYApellido(String unNombre, String unApellido){
         Empleado encontro=null;
        
        try{
            for(Empleado emp_temp: empleados){
                if(emp_temp.verificarEmpleadoNombreyApellido(unNombre, unApellido)){
                    encontro=emp_temp;
                }
            }
            
        }
        catch (Exception e){
            
        }
        return encontro;
    }
    public Empleado buscarDni(int unDni){
         Empleado encontro=null;
        
        try{
            for(Empleado emp_temp: empleados){
                if(emp_temp.getDni()==(unDni)){
                    encontro=emp_temp;
                }
            }
            
        }
        catch (Exception e){
            
        }
        return encontro;
    }

    }
            

