package tarea2;
public class Tarea2 {

    public static void main(String[] args) {
        int opc, num = 0, lim, encontrado = 0;
        int ev = 0;

        metodos obj = new metodos();
        System.out.println("Ingrese el limite de la matriz unidimensional ");
        lim = obj.entrada.nextInt();
        int[] arreglo = new int[lim];
        //elementos validos
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    ev = obj.llenarArray(arreglo);
                    break;
                case 2:
                    obj.presentar(arreglo, ev);
                                case 4:
                    obj.insertarInicio(arreglo, ev);
                case 3:
                    System.out.println("Ingrese numero a buscar: ");
                    num = obj.entrada.nextInt();
                    encontrado = obj.busquedaBinaria(arreglo, ev, lim, num);
                    if (encontrado != 1) {
                        System.out.println("Esta  en la posicion: " + encontrado);
                    } else {
                        System.out.println("Elemento no existe");
                    }
                    ev = obj.busquedaBinaria(arreglo, lim, lim, 3);
                    break;
                case 5:
                    ev = obj.ordenarArreglo(arreglo, ev);
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opc != 0);
    }
    
}
