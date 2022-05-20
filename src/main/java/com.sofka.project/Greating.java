package com.sofka.project;

import java.util.Scanner;

public class Greating {
    /**
     * Metodo main permite iniciar la aplicacion
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Atributo para almacenar el nombre del usuario.
         */
        String name;

        /**
         * Atributo para almacenar la edad del usuario.
         */
        int age;

        /**
         * Atributo para almacenar el celuar del usuario.
         */
        String cellPhone;

        /**
         * Instancia de clase Scaner la cual permite caputar lo escrito
         * en consola.
         */
        Scanner capture = new Scanner(System.in);

        /**
         * Mensaje de bienvenida y captura del nombre del usuario.
         */
        System.out.println("Buenos días \n Por favor ingrese su nombre de usuario");
        name = capture.nextLine();

        /**
         * Mensaje informativo y caputra del celular del usuario.
         */
        System.out.println("Por favor ingrese su celular");
        cellPhone = capture.nextLine();

        /**
         * Mensaje Informativo y captura de la edad del usuario
         */
        System.out.println("Por favor ingrese su edad");
        age = Integer.parseInt(capture.nextLine());

        /**
         * Invocamos el metodo para validar si los datos son
         * minimamente correctos.
         */
        if(validatorData(name,age,cellPhone)){
            System.out.println("Bienvenido señor " + name + ", es un placer para nostros contar con una persona de edad "
                    + age + " años. \n Proximamente nos comunicaremos con usted al número " + cellPhone + ". \n Feliz día");
        }
        else{
            System.out.println("Datos Incorrectos por favor intentelo de nuevo!!");
        }
    }

    /**
     * Metodo que permite validar la informacion ingresada, se verifica la longitid de la cadena
     * y si la edad es un numero.
     * @param name
     * @param age
     * @param cellPhone
     * @return boolean
     */
    public static boolean validatorData(String name, int age, String cellPhone){
        if (name.length() <=2 || age == 0 || cellPhone.length() <10){
            return false;
        }
        else{
            return true;
        }
    }
}


