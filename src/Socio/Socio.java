package Socio;

public class Socio implements Comparable{
    String nombre;
    int edad;
    long numeroSocio;
    String fechaNacimiento;

    public Socio(String nombre, int edad, long numeroSocio, String fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroSocio = numeroSocio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public long getNumeroSocio() {
        return numeroSocio;
    }

    public boolean equals(Socio temp){
        return edad == temp.edad;
    }
    public String toString() {
        return String.format("%s %d %s %s", nombre, edad, numeroSocio, fechaNacimiento);
    }

    @Override
    public int compareTo(Object ob){
        Socio temp = (Socio) ob;
        return edad-temp.getEdad();        
        
    }
}
