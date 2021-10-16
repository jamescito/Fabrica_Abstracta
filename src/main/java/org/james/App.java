package org.james;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        CocheFactory coche;
        Motor motor;
        Carroceria carroceria;
        String carro;

        System.out.println("Selecciones el coche (Ford y Opel): ");
        carro = entrada.readLine().toLowerCase();
        
        if (carro.equals("ford")) {
            
            coche = new FordFocusFactory();

            motor = coche.crearMotor();
            System.out.println(motor.presentamotor());

            carroceria = coche.crearCarroceria();
            System.out.println(carroceria.lacarroceria());

        }
        
        else if (carro.equals("opel")) {
            coche = new OpelAstracFactory();
            motor = coche.crearMotor();
            System.out.println(motor.presentamotor());

            carroceria = coche.crearCarroceria();
            System.out.println(carroceria.lacarroceria());
        }

        else {
            System.out.println("No existe este Coche");
            System.exit(0);
        }

    }

}
