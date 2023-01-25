package Clases.ej4;

public class SmartDevice {
    String Model;
    String Marca;
    int Age;
    boolean Serie;
    
    
public SmartDevice(){

  }

    public SmartDevice(String Model, String Marca, int Age, boolean Serie) {
        this.Model = Model;
        this.Marca = Marca;
        this.Age = Age;
        this.Serie = Serie;

    }
    public static class SmartPhone extends SmartDevice {
        int ram;
        String sistema;

        public SmartPhone(){
            super();
        }

        @Override
            public String toString() {
                return "Model=" + Model +
                        ", Marca =" + Marca +
                        ", Age =" + Age +
                        ", ram=" + ram +
                        ", sistema=" + sistema;
            }
    }

    public static class SmartWatch extends SmartDevice {
        String conectividad;

        public SmartWatch(){
            super();
        }

        public SmartWatch(String conectividad) {
            this.conectividad = conectividad;
        }

        @Override

        public String toString(){
            return "Model=" + Model +
            ", Marca =" + Marca +
            ", Age =" + Age +
            ", conectividad =" + conectividad;
        }
    }

    public static void main(String[] args){
        
    }

    
}
