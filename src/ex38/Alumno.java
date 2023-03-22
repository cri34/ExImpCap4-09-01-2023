package ex38;



public class Alumno {


    private int nota;
    private String nombre;

    public Alumno (String nombre,int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    public Alumno (){
    }

    public void setNombre(String nombre){
        this.nombre=nombre;

    }
    public void setNota(int nota){
        this.nota = nota;
    }
    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }
}
