import java.util.Scanner;

public class Signo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Qué día naciste?: ");
        int nacimiento = scanner.nextInt();

        System.out.print("¿En qué mes naciste?: ");
        int mes = scanner.nextInt();


        String signo = ""; 

        if ((mes == 1 && nacimiento >= 20) || (mes == 2 && nacimiento <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && nacimiento >= 19) || (mes == 3 && nacimiento <= 20)) {
            signo = "Piscis";
        } else if ((mes == 3 && nacimiento >= 21) || (mes == 4 && nacimiento <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && nacimiento >= 20) || (mes == 5 && nacimiento <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && nacimiento >= 21) || (mes == 6 && nacimiento <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && nacimiento >= 21) || (mes == 7 && nacimiento <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && nacimiento >= 23) || (mes == 8 && nacimiento <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && nacimiento >= 23) || (mes == 0 && nacimiento <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && nacimiento >= 23) || (mes == 10 && nacimiento <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && nacimiento >= 23) || (mes == 11 && nacimiento <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && nacimiento >= 22) || (mes == 12 && nacimiento <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && nacimiento >= 22) || (mes == 1 && nacimiento <= 19)) {
            signo = "Capricornio";
        }

        System.out.println("Naciste el " + nacimiento + " de " + mes + " tu signo es: " + signo);

        scanner.close();
    }
}

