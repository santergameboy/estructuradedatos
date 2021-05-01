import java.util.Scanner;

public class Ejercicio2 {
    //Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos leídos por el
    //teclado. Copia los elementos del vector en otro vector pero en orden inverso, y muéstralo por la
    //pantalla.
    String[] letras;
    String[] inverso;

    Scanner scanner;
    //metodo constructor
    public Ejercicio2(){
        letras= new String[5];
        inverso= new    String[5];
        scanner=new Scanner(System.in);
    }
    public void ejecutor2(){
        for (int i = 0; i < letras.length; i++) {
            System.out.println("letra="+i+":");
           String cadena= scanner.nextLine();
            letras[i]=cadena;
        }
        //invertir original
        int indiceorin=0;
        int indiceinvert=4;
        while (indiceorin< letras.length){
            inverso[indiceinvert]= letras[indiceorin];
            indiceorin++;
            indiceinvert--;
        }
        for (int i = 0; i < inverso.length; i++) {
            System.out.println("inverso"+ i+"-" +inverso[i]);
            
        }
    }
}