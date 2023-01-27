package interfaces;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUDO {
private List<Empleado> empleados = new ArrayList<>();






//guardar un empleado
    public  void guardar(Empleado empleado){


        empleados.add(empleado);
    }

    public List<Empleado> findAll(){
    return empleados;
    }
    
}
