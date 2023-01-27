package interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        EmpleadoCRUDO empleadoCRUDO= new EmpleadoCRUDO();
        

        Empleado juanito = new Empleado("Juanito", 30, 40000, true);
        Empleado roberto = new Empleado("roberto", 30, 40000, true);
        Empleado viviana = new Empleado("viviana", 30, 40000, true);
        empleadoCRUDO.guardar(juanito);
        empleadoCRUDO.guardar(roberto);
        empleadoCRUDO.guardar(viviana);


        //consultar empleados


       List<Empleado> empleados =  empleadoCRUDO.findAll();
       System.out.println(empleados);



    }
    
}
