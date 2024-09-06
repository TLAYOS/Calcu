import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
      /*  System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);



        }
        */
        Scanner consola = new Scanner(System.in);
        while (true){
            System.out.println("**** Aplicacion Chidota de Calculadora ****");
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Divesion
                    5. Salir
                    """);
            System.out.println("¿Cual Operación a realizar?");
            var operacion = Integer.parseInt(consola.nextLine());
            if (operacion >= 1 && operacion <= 4) {
                System.out.println("Proporciona valor del operador 1");
                var operador1 = Integer.parseInt(consola.nextLine());
                System.out.println("Proporciona el valor del operador 2");
                var operador2 = Integer.parseInt(consola.nextLine());

                int resultado;
                switch (operacion){
                    case 1-> {// la suma
                        resultado = operador2 + operador1;
                        System.out.println("El resultado es: " + resultado);

                    }
                    case 2 ->{//la resta
                        resultado = operador1 - operador2;
                        System.out.println("El resultado es: " + resultado);

                    }
                    case 3 -> {//la multiplicación
                        resultado = operador1 * operador2;
                        System.out.println("El resultado es: " + resultado);

                    }
                    case 4 -> {//la division
                        resultado = operador1 / operador2;
                        System.out.println("El resultado es: " + resultado);
                    }
                }
            } else if (operacion == 5) {
                System.out.println("NOS VEOMOS");
                break;
            }else {
                System.out.println("Solo puedes seleccionar las opciones mostradas" + operacion);
            }


        }
    }
}