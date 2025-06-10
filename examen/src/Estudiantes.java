import java.util.Scanner;

public class Estudiantes {
    
   private int num_estudiantes;
   private int num_notas;
   private double[][]  matriz;
    public Estudiantes(int num_estudiantes,int num_notas){
        this.num_estudiantes=num_estudiantes;
        this.num_notas=num_notas;
        this.matriz= new double[5][5];
    }
    public void Estudiantesaprobados(){
        Scanner scanner = new Scanner(System.in);
        for(int i =0;i<this.matriz.length;i++){
            for(int j =0;j<5;j++){
                System.out.println("ingrese la nota : "+ (j+1)+ "  del estudiante : "+ (i+1));
                matriz[i][j]=scanner.nextDouble();
            }
        }
    }
    public void promedio_notas_altas(){
        double promedioalto =0;
        int contador =0;
        for(int i =0;i<this.matriz.length;i++){
            for(int j =0;j<5;j++){
                contador++;
               if(matriz[i][j]>= 80){
                promedioalto+=matriz[i][j];
               }
            }
        }
        promedioalto=promedioalto/contador;
        System.out.println(" el promedio de notas superiores a 80 es de : "+promedioalto);
    }
    public void imprimir_notas_bajas(){
        System.out.println("---------------------------------------------------------");
          for(int i =0;i<this.matriz.length;i++){
            for(int j =0;j<5;j++){
                if(matriz[i][j]<50){
                    System.out.println("nota baja en la fila :"+(i+1)+ "y columna :"+(j+1)+ " con una nota de : "+matriz[i][j]);
                }
            }
        }
        System.out.println("--------------------------------------------------------------");
    }
    public void hallarnotamayor(){
         double nota_mayor=0.0;
        for(int i =0;i<this.matriz.length;i++){
            for(int j =0;j<5;j++){
                if(matriz[i][j]>nota_mayor){
                    nota_mayor=matriz[i][j];
                }
            }
        }
        System.out.println(" la nota mayor es : "+ nota_mayor);
    }
    public void notas_fuera_de_rango(){
        double contador = 0.0;
        for(int i =0;i<this.matriz.length;i++){
            for(int j =0;j<5;j++){
                if(matriz[i][j]<0 && matriz[i][j]>100){
                   contador++;
                }
            }
        }
        System.out.println(" el numero de notas mayores a 100 y menores a 0 es de :"+contador);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        int numero_estudiantes=5;
        int numero_notas=5;
        Estudiantes clase1 = new Estudiantes(numero_estudiantes,numero_notas);
        System.out.println("ingrese notas de la matriz  : ");
        clase1.Estudiantesaprobados();
        // promedio de notas superiores a 80 
        clase1.promedio_notas_altas();
        //

        scanner.close();
    }
}
