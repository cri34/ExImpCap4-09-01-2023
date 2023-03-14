package ex38;

import interfaces.input.Input;
import interfaces.output.Output;

public class ClaseAlumnos {
    Alumno [] alumnos;
    boolean [] aprovados;
    Alumno [] alumnosAprovados;
    public ClaseAlumnos( Alumno [] alumnos){
        this.alumnos = alumnos;
    }
    public ClaseAlumnos(int tamMax){
        alumnos = new Alumno[tamMax];
        for (int i =0; i < tamMax;i++){
            alumnos[i] = new Alumno();
        }
        for (int i = 0 ; i < tamMax ; i++){
            System.out.println("inserta nombre alumno");
            alumnos[i].setNombre(Input.retInpString()); ;
            System.out.println("inserta nota alumno");
            alumnos[i].setNota(Input.retInpNumber());
        }
    }
    public void init(){
        imprimirQualificaciones();
        comprovarAprovados();
        retAlumnosAprovados();
        printAlumnosAprovados();
    }
    private void imprimirQualificaciones(){
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < alumnos.length;i++){
            out.append(" alumno: "+alumnos[i].getNombre() + " nota: " + alumnos[i].getNota()+" \n");
        }
        System.out.println(out);
    }
    private void comprovarAprovados(){
        final int minNota = 5;
        aprovados = new boolean[alumnos.length];
        for (int i =0; i < alumnos.length; i++){
            if (alumnos[i].getNota() >= minNota)
                aprovados[i] = true;
        }
    }
    private void retAlumnosAprovados() {
        int numAlAprov = retNAprovados(aprovados);
        alumnosAprovados = new Alumno[numAlAprov];
        int indAlumnosAprovad = 0;
        for (int i = 0; i < alumnos.length; i++) {
            if (aprovados[i])
                alumnosAprovados[indAlumnosAprovad++] = alumnos[i];
        }
    }
    private static int retNAprovados(boolean [] aprovados){
        int nAprov=0;
        for (int i =0; i < aprovados.length;i++){
            if (aprovados[i])
                nAprov++;
        }
        return nAprov;
    }
    private void printAlumnosAprovados(){
        System.out.print("alumnos aprovados: ");
        StringBuilder out = new StringBuilder();
        for (int i =0; i < alumnosAprovados.length;i++){
           out.append(" "+alumnosAprovados[i].getNombre() + " , ");
        }
        System.out.println(out);
    }
    }
