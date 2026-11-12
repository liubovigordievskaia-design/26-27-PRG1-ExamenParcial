import java.util.Scanner

public class Examen {
    public static void main {(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = -1;

    System.out.print("Ingrese la edad del alumno: ");

        try {
            edad = scanner.Int()
             if (edad >= 18) {
                System.out.println("El alumno es mayor de edad.");
            } else {
                System.out.println("El alumno es menor de edad.");
            }
            if (edad >= 16 && edad <= 99) {
                        System.out.println(" para fila par.");
                        break;
                    } else {
                        System.out.println("En fila par la edad debe estar entre 17 y 70.");
                    }
                    if (edad >= 17 && edad <= 70) {
                        System.out.println(" para fila impar.");
                        break;
                    } else {
                        System.out.println("En fila impar la edad debe estar entre 17 y 70.");
                    }
                    public class AsignaturaAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] asignaturasMatriculadas = {101, 202, 303};

        int numeroAsignatura;
        boolean matriculado = false;
        while(!matriculado) {
            System.out.print("Ingrese el número de asignatura: ");
            try {
                numeroAsignatura = scanner.nextInt();
                for (int asignatura : asignaturasMatriculadas) {
                    if (numeroAsignatura == asignatura) {
                        matriculado = true;
                        System.out.println("El alumno está matriculado en la asignatura ingresada.");
                        scanner.close();
                        break;
                    }
                }
                else (!matriculado) {
                    System.out.println("El alumno no está matriculado en esa asignatura.");
                }
                if (numeroAsignatura >= 1 && numeroAsignatura <= 10) {
                    System.out.println("Número de asignatura válido: " + numeroAsignatura);
                    break;
                } else {
                    System.out.println("El número debe estar entre 1 y 10. Intente nuevamente.");
                }

            int numeroPreguntas;
            double[] notas;
            System.out.print("Ingrese el número de preguntas de la asignatura: ");
        while (true) {
            try {
                numeroPreguntas = scanner.nextInt();
                if (numeroPreguntas > 0) {
                    break;
                }
                } 
                }
                else {
                    System.out.println("Debe ingresar un número positivo.");
                }
            for (int i = 0; i < numeroPreguntas; i++) {
            while (true) {
                System.out.print("Nota de la asignatura" + (i + 1));
                try {
                    double nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    } else {
                        System.out.println("La nota debe estar entre 0 y 10.");
                    }
            double[] notas;
            double suma = 0;
            double promedio = suma / numeroPreguntas;
        System.out.printf("\nLa media de las notas es: %.2f\n", promedio);

        scanner.close();
    }
    int aprobadas = 0;
    int suspensas = 0;
    double notaMaxima = Double.MAX_VALUE;
    double notaMin = Double.MIN_VALUE;
    for (int i = 0; i < numeroAsignaturas; i++) {
            while (true) {
                System.out.print("Nota de la asignatura " + (i + 1) );
                try {
                    double nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        suma += nota; 
                        if (nota > notaMaxima) {
                            notaMaxima = nota;
                            if (nota < notaMin) {
                            notaMin = nota;
                        if (nota >= 5) {
                            aprobadas++; 
                        }
                        break;
                    } else {
                        System.out.println("La nota debe estar entre 0 y 10");
                    }
                    if (nota >= 5) {
                            aprobadas++;
                        } else {
                            suspensas++;
                        }
                        break;
                    } else {
                        System.out.println("La nota debe estar entre 0 y 10");
                    }
        System.out.println("Asignaturas aprobadas (nota >= 5): " + aprobadas);
        System.out.println("Asignaturas suspensas (nota < 5): " + suspensas);
        System.out.println("La nota más alta es: " + notaMaxima);
        System.out.println("La nota más baja es: " + notaMin);


}


                



                }
            


   }

}
