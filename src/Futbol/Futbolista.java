package Futbol;
public class Futbolista implements Comparable {
    int edad, nGoles;
    String nombre, apellidos, dni;

    public Futbolista(String nombre, String apellidos, String dni, int edad, int nGoles){
        this.dni = dni;
        this.edad = edad;
        this.nGoles = nGoles;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getDNI(){
        return dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String toString(){
        return String.format("%s %s con DNI: %s y %d años de edad, ha marcado %d goles", nombre, apellidos, dni, edad, nGoles);
    }

    public boolean equals(Futbolista temp){
        return dni == temp.dni;
    }

    @Override
    public int compareTo(Object ob){
        Futbolista temp = (Futbolista) ob;
        return dni.compareTo(temp.getDNI());        
        
    }
}
