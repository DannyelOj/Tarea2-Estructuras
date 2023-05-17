/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea2;
import java.util.Scanner;
/**
 *
 * @author VEL-USER
 */
public class metodos {
    
    Scanner entrada;
    
    public metodos() {
        this.entrada = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("1. Insertar elementos ");
        System.out.println("2. Presentar arreglo");
        System.out.println("3. Recorrer arreglo a la derecha");
        System.out.println("4. Busqueda binaria");
        System.out.println("5. Salir \n");

        return entrada.nextInt();
    }
    
    public int llenarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar elemento" + i);
            a[i] = entrada.nextInt();
        }
        return a.length;
    }

    public void presentar(int[] a, int ev) {
        for (int i = 0; i < ev; i++) {
            System.out.println(a[i] + " \n");
        }
    }
    
    public void recorrerDerecha(int[] a, int ev, int b) {
        for (int i = ev; i > b; i--) {
            a[i] = a[i - 1];

        }

    }
    
    public int insertarInicio(int[] a, int ev) {
        if (ev < a.length) {
            recorrerDerecha(a, ev, 0);
            System.out.println("Ingresar un elemento");
            a[0] = entrada.nextInt();
            ev++;
        } else {
            System.out.println("Arreglo lleno");
        }
        return ev;
    }
    
    public int busquedaBinaria(int[] x, int ini, int fin, int num) {
        int medio = 0;
        if (ini < fin) {
            medio = (ini + fin) / 2;
            if (x[medio] == num) {
                return medio;
            } else if (num > x[medio]) {
                return busquedaBinaria(x, medio + 1, fin, num);
            } else {
                return busquedaBinaria(x, ini, medio - 1, num);
            }
        } else {
            return -1;
        }
    }
    public int ordenarArreglo(int[] a, int ev) {
        int pos = 0;
        int num = 0;
        if (ev < a.length) {

            System.out.println("Ingresar un elemento");
            num = entrada.nextInt();
            if (ev == 0) {
                a[pos] = num;
            } else {
                while (pos < ev && num > a[pos]) {
                    pos++;
                    recorrerDerecha(a, ev, pos);
                    a[pos] = num;
                    ev++;
                }

            }
        } else {
            System.out.println("Arreglo lleno");
        }

        return ev;
    }
}
