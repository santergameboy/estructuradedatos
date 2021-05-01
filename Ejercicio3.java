import java.util.Scanner;

public class Ejercicio3 {
    //Se quiere realizar un programa que lea por teclado las 5 notas obtenidas por un alumno (comprendidas
    //entre 0 y 10). A continuación debe mostrar todas las notas, la nota media, la nota más alta que ha
    //sacado y la menor

    Scanner scanner;
    int[] notas= new int[5];

    double sum=0;
    int minimo=10;
    int maximo=0;
    public Ejercicio3(){
        scanner= new Scanner(System.in);

    }
    public void ejecutor3(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("ingrese nota"+i+ ":");
                int not= scanner.nextInt();
                notas[i]=not;


        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
            sum=sum+ notas[i];

            if (notas[i] < minimo){
                minimo=notas[i];
            }
            if (notas[i]>maximo){
                maximo=notas[i];
            }

        }
        double prom = sum/ notas.length;
        System.out.printf("promedio nota media"+prom+":");
        System.out.println("nota maximia"+maximo);
        System.out.println("nota minimi"+minimo);

    }
}
