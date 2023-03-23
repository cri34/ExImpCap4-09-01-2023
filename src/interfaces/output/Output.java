package interfaces.output;

public interface Output {
    static void printArray(double [][] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
            for (int c=0;c <array[0].length;c++){
                out.append(array[r][c]).append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
    }
    static void printArray(int [][] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
            for (int c=0;c <array[0].length;c++){
                out.append(array[r][c]).append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
    }
    static void printArray(String [][] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
            for (int c=0;c <array[0].length;c++){
                out.append(array[r][c]).append(" ");
            }
            out.append("\n");
        }
        System.out.println(out);
    }
    static void printArray(int [] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
                out.append(array[r]).append(" ");
            }
            out.append("\n");
        System.out.println(out);
    }
    static void printArray(String [] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
            out.append(array[r]).append(" ");
        }
        out.append("\n");
        System.out.println(out);
    }
    static void printArray(char [] array){
        StringBuilder out= new StringBuilder();
        for (int r =0;r< array.length;r++){
            out.append(array[r]).append(" ");
        }
        out.append("\n");
        System.out.println(out);
    }
}
