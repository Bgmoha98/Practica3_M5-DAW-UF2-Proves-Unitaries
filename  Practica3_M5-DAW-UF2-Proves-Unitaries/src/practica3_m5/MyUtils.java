/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_m5;

/**
 *
 * @author mohab
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        if (cadena.equals("null")) {
            resultat = "null";
        } else {
            for (int i = cadena.length() - 1; i >= 0; i--) {
                resultat += cadena.charAt(i);
            }
        }
        return resultat;
    }

    /**
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        int anos = year - 2023;
        if (month < 1 || month > 12) {
            resultat = -2;
        } else {
            switch (month) {
                case 2:
                    /* Un año es bisiesto si:
                        -. es múltiplo de 4 () y no de 100, (como 1988, pero no 1900)
                        -. es múltiplo de 4 y de 400 (como 2000)
                     */
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        day = 29;

                    } else {
                        day = 28;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30; //abril(4) juny(6) setembre(9) novembre(11)
                    break;
                default:
                    day = 31;
            }

            // Detectar error al dia:
            if (day < 1 || day > month) {
                resultat = -2;
            } else if (anos > 150) {
                resultat = -1;
            }
        }
        return resultat;
    }

    /**
     *
     * @param numero número del que es calcula el factorial
     * @return retorna el factorial d'un número. Si el nombre es negatiu retorna
     * -1.
     */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }

}
