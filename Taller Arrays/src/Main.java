import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. MENU INTERACTIVO

        /*
        System.out.println("Ingrese una opcion:\n 1.Suma\n 2.Resta\n 3.Multiplicacion\n 4.Division");
        int menu = scanner.nextInt();

        switch(menu){
            case 1:
                System.out.println("Ingrese el numero 1");
                double num1 = scanner.nextDouble();

                System.out.println("Ingrese el numero 2");
                double num2 = scanner.nextDouble();

                System.out.printf("El resultado es %s",num1+num2);
                break;
            case 2:
                System.out.println("Ingrese el numero 1");
                double num3 = scanner.nextDouble();

                System.out.println("Ingrese el numero 2");
                double num4 = scanner.nextDouble();

                System.out.printf("El resultado es %s",num3-num4);
                break;
            case 3:
                System.out.println("Ingrese el numero 1");
                double num5 = scanner.nextDouble();

                System.out.println("Ingrese el numero 2");
                double num6 = scanner.nextDouble();

                System.out.printf("El resultado es %s",num5*num6);
                break;
            case 4:
                System.out.println("Ingrese el numero 1");
                double num7 = scanner.nextDouble();

                System.out.println("Ingrese el numero 2");
                double num8 = scanner.nextDouble();

                System.out.printf("El resultado es %s",num7/num8);
                break;
        }

        //2. FACTURACIÓN DE UNA TIENDA

        String[] productos = {"Producto A", "Producto B", "Producto C"};
        double[] precios = {10.00,20.00,30.00};

        int[] cantidades = new int[productos.length];

        for (int i = 0; i < productos.length; i++) {
            System.out.printf("Ingrese la cantidad de %s que desea comprar: ", productos[i]);
            cantidades[i] = scanner.nextInt();
        }

        double total = 0.0;

        for (int i = 0; i < productos.length; i++) {
            total += precios[i] * cantidades[i];
        }

        System.out.println("\nFactura de compra:");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("%s \t x%d \t %.2f\n", productos[i], cantidades[i], precios[i] * cantidades[i]);
        }


        //4. CALCULADORA DE DESCUENTOS

        double descuento = 0;

        if (total <199){
            System.out.println("No tienes un descuento disponible");
        }else if (total >=200 && total <300) {
            System.out.println("Tienes un descuento del 10%");
            descuento = total * 0.10;
            System.out.printf("Su descuento es de %f\n", descuento);
            total = total - descuento;
        }else if (total >=300 && total < 500) {
            System.out.println("Tienes un descuento del 15%");
            descuento = total * 0.15;
            System.out.printf("Su descuento es de %f\n", descuento);
            total = total - descuento;
        }else if (total >=500 && total < 1000) {
            System.out.println("Tienes un descuento del 20%");
            descuento = total * 0.20;
            System.out.printf("Su descuento es de %f\n", descuento);
            total = total - descuento;
        }else if (total >=1000) {
            System.out.println("Tienes un descuento del 25%");
            descuento = total * 0.25;
            System.out.printf("Su descuento es de %f\n", descuento);
            total = total - descuento;
            System.out.printf("Total: %f", total);
        }

        //3. NOTAS DE UN CURSO

        final int totalNotas = 8;
        final double promedioMinimo = 76.0;

        double[] notas = new double[totalNotas];

        double sumatoriaNotas = 0.0;
        int cantidadNotas = 0;

        System.out.println("Ingrese las notas ya obtenidas (-1 para terminar):");

        while (cantidadNotas < totalNotas) {
            System.out.print("Nota " + (cantidadNotas + 1) + ": ");
            double nota = scanner.nextDouble();

            if (nota == -1) {
                break;
            }

            if (nota >= 0 && nota <= 100) {
                notas[cantidadNotas] = nota;
                sumatoriaNotas += nota;
                cantidadNotas++;
            } else {
                System.out.println("Nota ingresada inválida. Debe estar entre 0 y 100.");
            }
        }

        System.out.println("");

        double promedioNotas = sumatoriaNotas / cantidadNotas;

        double promedioFinal = sumatoriaNotas / 8;

        double promedioNecesario = promedioMinimo * totalNotas - sumatoriaNotas;

        int notasFaltantes = totalNotas - cantidadNotas;

        double promedioFaltante = promedioNecesario / notasFaltantes;

        if (promedioFaltante <= 0){
            System.out.println("Has aprobado");

        }else if (promedioFaltante <= 100){
            System.out.printf("Su promedio actual es : %f\n", promedioNotas);
            System.out.printf("Promedio necesario en las %d notas faltantes: %.2f\n", notasFaltantes, promedioFaltante);
        }else if (notasFaltantes == 0) {
            System.out.println("No te falta ninguna nota");
        }else{
            System.out.printf("Promedio necesario en las %d notas faltantes: %.2f\n", notasFaltantes, promedioFaltante);
        }

        System.out.println("\nResultados ");
        System.out.printf("Su promedio total es de: %f\n", promedioFinal);
        System.out.printf("Promedio necesario para aprobar: %.2f\n", promedioMinimo);


        //5. BUSCA PALABRAS

        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        char[] caracteresTexto = texto.toCharArray();

        System.out.print("Ingrese la palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();

        char[] caracteresPalabra = palabraBuscada.toCharArray();

        int inicio = -1;
        int fin = -1;

        for (int i = 0; i <= caracteresTexto.length - caracteresPalabra.length; i++) {
            boolean coincide = true;
            for (int j = 0; j < caracteresPalabra.length; j++) {
                if (Character.toLowerCase(caracteresTexto[i + j]) != Character.toLowerCase(caracteresPalabra[j])) {
                    coincide = false;
                    break;
                }
            }

            if (coincide) {
                inicio = i;
                fin = i + caracteresPalabra.length - 1;
                break;
            }
        }

        if (inicio != -1 && fin != -1) {
            System.out.println("La palabra '" + palabraBuscada + "' se encontró en el rango de posiciones: " + inicio + " - " + fin);
        } else {
            System.out.println("La palabra '" + palabraBuscada + "' no se encontró en el texto ingresado.");
        }

        //6. BUSQUEDA POR COINCIDENCIA EN ARRAYS

        String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Luis"};

        System.out.print("Ingrese un nombre: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equals(nombreBuscado)) {
                System.out.println("El nombre \"" + nombreBuscado + "\" se encuentra en la posición " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El nombre \"" + nombreBuscado + "\" no se encuentro.");
        } else if (encontrado == true) {
            System.out.println("El nombre solicitado se encontro.");
        }

        //7 Y 8. TRANSPOSICION DE UNA MATRIZ Y VERIFICAR MATRIZ SIMETRICA

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();

            }
        }

        boolean esSimetrica = true;

        if (filas != columnas) {
            esSimetrica = false;
        }else{
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz[i][j] != matriz[j][i]) {
                        esSimetrica = false;
                        break;
                    }
                }
                if (!esSimetrica) {
                    break;
                }
            }
        }

        System.out.println("\nMatriz original:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int[][] transpuesta = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];

            }
        }

        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        if (esSimetrica) {
            System.out.println("\nLa matriz es simétrica.");
        } else {
            System.out.println("\nLa matriz no es simétrica.");
        }

        //9 CONTAR COINCIDENCIAS EN UN ARRAY

        int[] array = {3, 1, 4, 2, 3, 1, 4, 5, 5, 5};

        int[] contador = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            contador[i] = -1;
        }

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;

                    contador[j] = 0;
                }
            }
            if (contador[i] != 0) {
                contador[i] = count;
            }
        }

        System.out.println("Estos son los numeros repetidos y la cantidad de ellos:");

        for (int i = 0; i < array.length; i++) {
            if (contador[i] != 0 && contador[i] != -1) {
                System.out.println(array[i] + " se repite " + contador[i] + " veces.");
            }
        }

        //10. INVERTIR UN ARRAY

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Array original: ");

        int tamaño = array.length;

        for (int i = 0; i < tamaño / 2; i++) {
            int temp = array[i];
            array[i] = array[tamaño -1 - i];
            array[tamaño -1 -i] = temp;
        }

        System.out.println("Array invertido: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();*/

        /*

        // INVESTIGACIÓN 1: ARRAYLIST

        Un ArrayList en Java es una implementación de la interfaz List que utiliza
        un array dinámico para almacenar elementos. Esto significa que puede crecer
        dinámicamente según sea necesario para acomodar nuevos elementos, similar
        a un array convencional, pero sin la limitación de tamaño fijo.

        -Para declarar una ArrayList de enteros (Integer), EJEMPLO:

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);


        Para declarar una ArrayList de cadenas (String), EJEMPLO:

        ArrayList<String> palabras = new ArrayList<>();

        palabras.add("Hola");
        palabras.add("Mundo");
        palabras.add("Java");


        Los metodos mas comunes de las ArrayList son:

        add(elemento): Añade un elemento al final del ArrayList, EJEMPLO:

        ArrayList<String> colores = new ArrayList<>();

        colores.add("Azul");

        System.out.println(colores);

        get(int índice): Obtiene el elemento en la posición especificada.
        set(int índice, elemento): Reemplaza el elemento en la posición especificada.
        remove(int índice): Elimina el elemento en la posición especificada.
        size(): Devuelve el número de elementos en el ArrayList.
        isEmpty(): Devuelve true si el ArrayList no contiene elementos.
        clear(): Elimina todos los elementos del ArrayList.

        // INVESTIGACÓN 2: MAP

        Un Map en Java es una interfaz que mapea claves únicas a valores asociados.
        Cada clave puede mapearse a un solo valor y no puede haber claves duplicadas
        en un Map. Algunas implementaciones comunes de la interfaz Map en Java son
        HashMap, LinkedHashMap, TreeMap, entre otros. Cada implementación tiene
        características específicas en cuanto al orden de iteración, rendimiento
        y uso de memoria.


        Los metodos mas comunes del Map, son:

        put(K clave, V valor): Asocia el valor especificado con la clave especificada en el mapa.
        get(Object clave): Devuelve el valor asociado con la clave especificada, o null si no hay ninguna asignación para la clave.
        containsKey(Object clave): Devuelve true si el mapa contiene una asignación para la clave especificada.
        containsValue(Object valor): Devuelve true si el mapa contiene uno o más valores asignados al valor especificado.
        keySet(): Devuelve un conjunto de todas las claves presentes en el mapa.
        values(): Devuelve una colección de todos los valores presentes en el mapa.
        entrySet(): Devuelve un conjunto de pares clave-valor (objeto Map.Entry) presentes en el mapa.


        // INVESTIGACION 3: POO

        El paradigma orientado a objetos (POO) se basa en cuatro pilares fundamentales
        que definen su estructura y comportamiento. Estos pilares son conceptos clave
        que guían el diseño y la implementación de sistemas basados en objetos.
        Aquí están los cuatro pilares del paradigma orientado a objetos:

        1. Abstraccion
        2. Encapsulamiento
        3. Herencia
        4. Polimorfismo

        Estos cuatro pilares forman la base del paradigma orientado a objetos y son
        fundamentales para la construcción de sistemas robustos, flexibles y
        mantenibles en programación. Cada uno de estos pilares ofrece ventajas
        significativas para el diseño de software orientado a objetos, promoviendo
        conceptos como la reutilización de código, la modularidad y la organización
        estructurada de datos y comportamientos.

        */









    }
}

