import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //    System.out.println("Hello Word");
        //    System.out.println("My name is Davison");

        // varaiables primitivas:
        //1: byte
        /*byte isByte = 10;

        //2.short
        short isShort = 1000;

        //3. int
        int isInt = 20000;

        // 4. long (más grande de los tipos de datos enteros)
        long isLong = 35000000;

        //5. float
        float isFloat = 12.0003f;

        //6.double (más grande de los tipos de datos decimales)
        double isDouble = 14.32;

        //7.char
        char isChar = 'a'; // char siempre en comillas simples

        //8. boolean
        boolean isBool = false;

        //operaciones con tipos de datos(enteros)
        int  suma = isByte + isShort + isInt;
        long sum = isByte + isShort + isInt + isLong;

        //operaciones con tipos de datos(decimales)
        double sum2 = isFloat*30 + isDouble;

        //operaciones con tipos de datos(combinacion enteros y float)
        float sum3 = isFloat + isInt;

        //se importa la funcion de scanner
        Scanner scanner = new Scanner(System.in);

        //Toma todos los numeros hasta encontrar un \n
        int userInput = scanner.nextInt();
        System.out.println("ingresa algo brou");

        scanner.nextLine();// Recibira el \n que quedo. value=""

        //Limpiar buffer
        String textInput  = scanner.nextLine();


        System.out.println(userInput);

        // Estructuras de control
        //1.IF

        System.out.println("Ingrese su edad");
        int age= scanner.nextInt();

        System.out.println("Ingresa tu nombre");
        scanner.nextLine();

        String name = scanner.nextLine();

        //scanner.close();
        if (age >= 18) {
            System.out.println(name + " Puedes beber bro");
        }
        else if(age < 18){
            System.out.println(name+" Eres un baby");
        }

        switch (name) {
            case "Davison":
                System.out.println("Que buen nombre brou");

                break;

            default:
                System.out.println("Que mierda de nombre bro");

        }
        //1. CALCULADORA BASICA

        System.out.println("Ingresa el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");

        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int rest = num1 - num2;
... (458 lines left)
Collapse
message.txt
17 KB
Davison Rodríguez — Yesterday at 5:25 PM

import java.util.Random;
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    //Calculadora  Basica
    public static void main(String[] args) {
        // exportar Scanner
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Debes ingresar un  numero el cual desea saber las operaciones basicas");
        //solicitar los datos
        System.out.println("Ingrese el primer numero: ");
        double num1 = scanner. nextDouble();

        System.out.println("Ingrese el segundo  numero: ");
        double num2 = scanner. nextDouble();
        // hacer operaciones
        double resultSuma = num1 + num2;
        double resultResta = num1 - num2 ;
        double resultMulti= num1 * num2;
        double resultDivision = num1 / num2;
        // mostrar resultados
        System.out.println(" El resultado de la suma de estos numero es: "+ resultSuma);
        System.out.println(" El resultado de la resta de estos numero es: "+ resultResta);
        System.out.println(" El resultado de la multiplicacion de estos numero es: "+ resultMulti);
        System.out.println(" El resultado de la division de estos numero es: "+ resultDivision);


        //Verificador de edad
        System.out.println("Ingrese su nombre");
        String name = scanner.nextLine();
        System.out.println("Ingrese su edad");
         byte edad = scanner.nextByte();
          if (edad >= 18){
              System.out.println(name+" eres mayor de edad");
          }else{
              System.out.println(name+" eres menor de edad");
          }

        //Conversor de Km a millas
        System.out.println("Ingresa los kilometros que deseas convertir: ");
        double kilometros = scanner.nextDouble();
        double millas = 1.609;
        double resultado = kilometros / millas;
        System.out.println( kilometros +" es equivalente a " + resultado + "millas");


        //Calculadora de IMC
        System.out.println("Ingrese su peso en kilogramos");
        float peso = scanner.nextFloat();
        System.out.println("Ingrese su altura");
        float altura = scanner.nextFloat();
        float imc = peso/(altura*altura);
        System.out.println("su IMC es de: "+ imc);



        //Clasicicador de numeros
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if (numero > 0 &&  numero%2 == 0){
            System.out.println("Este numero es positivo y par");
        }
        else if (numero > 0 && numero%2 != 0){
            System.out.println("Este numero es positivo y  es impar");
        }
        else if (numero < 0 && numero%2 == 0 ) {
            System.out.println("Este numero es negativo y par");
        }
        else if (numero < 0 && numero%2 != 0){
            System.out.println("Este numero es negativo y impar");
        } else if (numero == 0) {
            System.out.println("El numero es 0");
        }


        // Calculadora de dias del mes

        System.out.println("Ingresa el numero del mes que desees");
        byte mes = scanner.nextByte();
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes contiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes contiene 30 dias");
                break;
... (376 lines left)
Collapse
Main.java
19 KB
﻿
Davison Rodríguez
davison_rodriguez
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //    System.out.println("Hello Word");
        //    System.out.println("My name is Davison");

        // varaiables primitivas:
        //1: byte
        /*byte isByte = 10;

        //2.short
        short isShort = 1000;

        //3. int
        int isInt = 20000;

        // 4. long (más grande de los tipos de datos enteros)
        long isLong = 35000000;

        //5. float
        float isFloat = 12.0003f;

        //6.double (más grande de los tipos de datos decimales)
        double isDouble = 14.32;

        //7.char
        char isChar = 'a'; // char siempre en comillas simples

        //8. boolean
        boolean isBool = false;

        //operaciones con tipos de datos(enteros)
        int  suma = isByte + isShort + isInt;
        long sum = isByte + isShort + isInt + isLong;

        //operaciones con tipos de datos(decimales)
        double sum2 = isFloat*30 + isDouble;

        //operaciones con tipos de datos(combinacion enteros y float)
        float sum3 = isFloat + isInt;

        //se importa la funcion de scanner
        Scanner scanner = new Scanner(System.in);

        //Toma todos los numeros hasta encontrar un \n
        int userInput = scanner.nextInt();
        System.out.println("ingresa algo brou");

        scanner.nextLine();// Recibira el \n que quedo. value=""

        //Limpiar buffer
        String textInput  = scanner.nextLine();


        System.out.println(userInput);

        // Estructuras de control
        //1.IF

        System.out.println("Ingrese su edad");
        int age= scanner.nextInt();

        System.out.println("Ingresa tu nombre");
        scanner.nextLine();

        String name = scanner.nextLine();

        //scanner.close();
        if (age >= 18) {
            System.out.println(name + " Puedes beber bro");
        }
        else if(age < 18){
            System.out.println(name+" Eres un baby");
        }

        switch (name) {
            case "Davison":
                System.out.println("Que buen nombre brou");

                break;

            default:
                System.out.println("Que mierda de nombre bro");

        }
        //1. CALCULADORA BASICA

        System.out.println("Ingresa el numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el numero 2: ");

        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int rest = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num2;

        System.out.println("El resultado de la suma es " + sum);
        System.out.println("El resultado de la resta es " + rest);
        System.out.println("El resultado de la multiplicacion es " + mult);
        System.out.println("El resultado de la division es " + div);

        //2. VERIFICACION DE EDAD

        System.out.println("Ingresa tu edad");
        int age= scanner.nextInt();

        System.out.println("Ingresa tu nombre");
        scanner.nextLine();

        String name = scanner.nextLine();

        if (age >= 18) {
            System.out.println(name + " eres mayor de edad");
        }
        else if(age < 18){
            System.out.println(name+ " eres menor de edad");
        }

        //3. CONVERSOR DE UNIDADES


        System.out.println("Esto es un conversor de Kilometros  a Millas");
        System.out.println("Ingrese los Kilometros: ");
        double km = scanner.nextFloat();

        double millas = km/1.60934;

        System.out.printf("Las millas son:" + millas);

        //4. CALCULADORA DE INDICE DE MASA CORPORAL

        System.out.println("Ingrese su peso:");
        float peso = scanner.nextFloat();

        System.out.println("Ingrese su altura");
        float altura = scanner.nextFloat();

        float imc = peso/(altura*altura);

        System.out.printf("Su IMC es:%s",imc);

        //5. CLASIFICAOR DE NUMEROS


        System.out.println("Ingrese un numero");
        float num = scanner.nextFloat();

        if (num == 0){
            System.out.println("El numero ingresado es 0");
        }
        else if (num <0){
            System.out.println("El numero ingresado es negativo");
            if (num%2 == 0){
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
        }
        else if (num >0) {
            System.out.println("El numero ingresado es positivo");
            if (num % 2 == 0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("El numero es impar");
            }
        }

        //6. CALCULADORA DE DIAS DEL MES

        System.out.println("Ingrese un numero de mes del 1 al 12");
        int mes = scanner.nextInt();

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Este mes tiene 31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Este mes tiene 30 dias");
                break;
            case 2:
                System.out.println("Este mes tiene 28 dias y es bisiesto");
        }

        //7. MENU INTERACTIVO

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

        //8. CALCULO DE PROMEDIO

        System.out.println("Ingrese la nota 1");
        float nota1 = scanner.nextFloat();

        System.out.println("Ingrese la nota 2");
        float nota2 = scanner.nextFloat();

        System.out.println("Ingrese la nota 3");
        float nota3 = scanner.nextFloat();

        float prom = (nota1+nota2+nota3)/3;

        if (prom >= 6){
            System.out.printf("El promedio del estudiante es: %s",prom);
            System.out.println("");
            System.out.println("El estudiante aprobo");
        }else{
            System.out.printf("El promedio del estudiante es: %s",prom);
            System.out.println("");
            System.out.println("El estudiante reprobo");
        }

        //9. CALCULADORA DE AÑO BISIESTO

        System.out.println("Ingrese un año: ");
        int año = scanner.nextInt();

        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println(año + " es un año bisiesto.");
        } else {
            System.out.println(año + " no es un año bisiesto.");
        }*/

        /* //10. CALCULADOR DE PROPINA

        System.out.print("Ingrese el total de la cuenta: ");
        double totalCuenta = scanner.nextDouble();

        // Solicitar el porcentaje de propina al usuario
        System.out.print("Ingrese el porcentaje de propina que desea dejar: ");
        double porcentajePropina = scanner.nextDouble();

        // Calcular la cantidad de propina
        double cantidadPropina = totalCuenta * (porcentajePropina / 100);

        // Mostrar la cantidad de propina
        System.out.printf("Debe dejar %.2f en propina.\n", cantidadPropina);

        //11. ORDENANDO TRES NUMEROS

        //SOLUCION CON IF Y ELSE


        System.out.println("Ordenador de numeros enteros");

        System.out.println("Ingresa el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número entero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número entero:");
        int num3 = scanner.nextInt();

        int cambio;

        if (num1 > num2) {
            cambio = num1;
            num1 = num2;
            num2 = cambio;
        }

        if (num1 > num3) {
            cambio = num1;
            num1 = num3;
            num3 = cambio;
        }

        if (num2 > num3) {
            cambio = num2;
            num2 = num3;
            num3 = cambio;

            System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3);
        }


        //SOLUCION CON EL OPERADOR TERNIARIO


        System.out.println("Ingresa el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número entero:");
        int num2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número entero:");
        int num3 = scanner.nextInt();

        int menor = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        int mayor = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        int medio = (num1 != menor && num1 != mayor) ? num1 : (num2 != menor && num2 != mayor) ? num2 : num3;

        System.out.println("Números ordenados: " + menor + ", " + medio + ", " + mayor);*/

        /*//12. GENERADOR DE HOROSCOPO


        System.out.println("Ingrese su mes de nacimiento del 1 al 12");
        int mes = scanner.nextInt();

        System.out.println("Ingrese su dia de nacimiento");
        int dia = scanner.nextInt();

        String signo = "";

        switch (mes) {
            case 1:
                if (dia >= 1 && dia <= 19) {
                    signo = "Capricornio";
                } else if (dia >= 20 && dia <= 31) {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (dia >= 1 && dia <= 18) {
                    signo = "Acuario";
                } else if (dia >= 19 && dia <= 29) {
                    signo = "Piscis";
                }
                break;
            case 3:
                if (dia >= 1 && dia <= 20) {
                    signo = "Piscis";
                } else if (dia >= 21 && dia <= 31) {
                    signo = "Aries";
                }
                break;
            case 4:
                if (dia >= 1 && dia <= 19) {
                    signo = "Aries";
                } else if (dia >= 20 && dia <= 30) {
                    signo = "Tauro";
                }
                break;
            case 5:
                if (dia >= 1 && dia <= 20) {
                    signo = "Tauro";
                } else if (dia >= 21 && dia <= 31) {
                    signo = "Géminis";
                }
                break;
            case 6:
                if (dia >= 1 && dia <= 20) {
                    signo = "Géminis";
                } else if (dia >= 21 && dia <= 30) {
                    signo = "Cáncer";
                }
                break;
            case 7:
                if (dia >= 1 && dia <= 22) {
                    signo = "Cáncer";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Leo";
                }
                break;
            case 8:
                if (dia >= 1 && dia <= 22) {
                    signo = "Leo";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Virgo";
                }
                break;
            case 9:
                if (dia >= 1 && dia <= 22) {
                    signo = "Virgo";
                } else if (dia >= 23 && dia <= 30) {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia >= 1 && dia <= 22) {
                    signo = "Libra";
                } else if (dia >= 23 && dia <= 31) {
                    signo = "Escorpio";
                }
                break;
            case 11:
                if (dia >= 1 && dia <= 21) {
                    signo = "Escorpio";
                } else if (dia >= 22 && dia <= 30) {
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia >= 1 && dia <= 21) {
                    signo = "Sagitario";
                } else if (dia >= 22 && dia <= 31) {
                    signo = "Capricornio";
                }
                break;
            default:
                signo = "Mes o día inválido";
        }
        System.out.printf("Su signo es %s ",signo);

        //13. CALCULADORA DE TARIFA DE TAXI


        System.out.print("Ingrese la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();


        double tarifaBase = 5000;
        double tarifaPorKilometro = 1000;

        double costoTotal = tarifaBase + (distancia * tarifaPorKilometro);


        System.out.println("El costo total del viaje es: $" + costoTotal);

        //14. CONVERTIDOR DE TEMPERATURA


        System.out.println("Elige la temperatura que deseas convertir: \n 1.Celcius a Farenheit \n 2.Farenheit a Celcius");

        int menu = scanner.nextInt();
        float celsius = 0;
        float farenheit =0;


        switch (menu){
            case 1:
                System.out.println("Ingrese los grados celsius");
                celsius = scanner.nextFloat();
                farenheit = (celsius*9/5)+32;
                System.out.printf("La conversion de grados celsius a farenheit son: %f",farenheit);
                break;

            case 2:
                System.out.println("Ingrese los grados farenheit: ");
                farenheit = scanner.nextFloat();
                celsius = (farenheit-32)*5/9;
                System.out.printf("La conversion de grados farenheit a celsius son: %f", celsius);
                break;

        }

        //15. SISTEMA DE CALIFICACIONES



        System.out.print("Ingrese la calificación del examen del 0 al 100: ");
        int calificacion = scanner.nextInt();

        char letra;

        if (calificacion >= 90 && calificacion <= 100) {
            letra = 'A';
        } else if (calificacion >= 80 && calificacion < 90) {
            letra = 'B';
        } else if (calificacion >= 70 && calificacion < 80) {
            letra = 'C';
        } else if (calificacion >= 60 && calificacion < 70) {
            letra = 'D';
        } else if (calificacion >= 0 && calificacion < 60) {
            letra = 'F';
        } else {
            System.out.println("La calificación ingresada no es válida. Debe estar entre 0 y 100.");
            return;
        }

        System.out.printf("La calificación es %s", letra);

                        //16. CONTRASEÑA SEGURA

                        System.out.println("Ingrese su contraseña: ");
                        String contraseña = scanner.nextLine();

                        boolean longitud = false;
                        boolean mayuscula = false;
                        boolean minuscula = false;
                        boolean caracter = false;
                        String caracterEspecial = "!@#$%^&*()-_=+{};:,<.>";

                        if (longitud == contraseña.length()<7){
                            longitud = true;
                        }

                        for (int i = 0; i < contraseña.length(); i++) {
                            char j = contraseña.charAt(i);

                            if (Character.isUpperCase(j)){
                                mayuscula = true;
                            }
                            else if (Character.isLowerCase(j)){
                                minuscula = true;
                            }
                            else if (caracterEspecial.indexOf(j) != -1){
                                caracter = true;
                            }
                        }

                        boolean validacion = (longitud && mayuscula && minuscula && caracter);

                        System.out.printf("¿Su contraseña es segura? %b", validacion);


                        //Piedra papel o tijera
                        Random random = new Random();
                        System.out.println("Bienvenido a piedra papel o tijera \n" +
                                "seleccione la opccion que desea\n" +
                                "-Piedra\n" +
                                "-Papel\n" +
                                "-Tijera\n");
                        String usuario = scanner.next();
                        usuario = usuario.toLowerCase();
                        String [] opciones = {"piedra","papel", "tijera"};
                        String bot = opciones[random.nextInt(opciones.length)];
                        System.out.println("He elegido "+ bot);
                        if (usuario.equals(bot)){
                            System.out.println("Ha sido un empate");
                        } else if((usuario.equals("piedra")) && (bot.equals("tijera")) || (usuario.equals("tijera")) && (bot.equals("papel")) ||
                                (usuario.equals("papel")) && (bot.equals("piedra"))){
                            System.out.println("Ganaste");
                        }else{
                            System.out.println("Te gané");
                        }


                        //Calculador de edad
                        System.out.println("Ingrese el año de nacimiento");
                        int nacimiento = scanner.nextInt();

                        System.out.println("Ingrese el mes en el que nacio del 1 al 12");
                        int mes = scanner.nextInt();

                        System.out.println("Ingrese el dia de nacimiento");
                        int dia = scanner.nextInt();

                        int añoActual = 2024;
                        int mesActual = 7;
                        int diaActual = 8;
                        int calcularAños = añoActual-nacimiento;
                        int calcularMeses = mesActual-mes;
                        int calcularDia = diaActual-dia;

                        if (calcularAños<18 && calcularMeses> mesActual && diaActual< dia){
                            System.out.println("Eres mayor de edad");
                        }else {
                            System.out.println("Eres menor de edad");
                        }


                        //Cifrado Cesar
                        System.out.println("Ingresa el mensaje");
                        String mensaje = scanner.next();

                        System.out.println("Ingrese el desplazamiento");
                        int desplazamiento = scanner.nextInt();

                        // Cifrado
                        StringBuilder mensajeCifrado = new StringBuilder();
                        for (char caracter : mensaje.toCharArray()) {
                            if (Character.isLetter(caracter)) {
                                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                                caracter = (char) ((caracter - base + desplazamiento) % 26 + base);
                            }
                            mensajeCifrado.append(caracter);
                        }
                        String cifrado = mensajeCifrado.toString();
                        System.out.println("Mensaje cifrado: " + cifrado);
                        // Descifrado
                        StringBuilder mensajeDescifrado = new StringBuilder();
                        for (char caracter : cifrado.toCharArray()) {
                            if (Character.isLetter(caracter)) {
                                char base = Character.isLowerCase(caracter) ? 'a' : 'A';
                                caracter = (char) ((caracter - base - desplazamiento + 26) % 26 + base);
                            }
                            mensajeDescifrado.append(caracter);
                        }
                        String descifrado = mensajeDescifrado.toString();
                        System.out.println("Mensaje descifrado: " + descifrado);


    }
}