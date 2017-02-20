/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
import java.util.*;
/*Lambda elevado a la k(numero que pido al usuario) se multiplica por el numero E (constante)
elevado a la menos lambda Y eso se divide entre el factorial de K.*/
/*numero de eventos, lambda es la media, p exitos*/
public class Poisson {
	
public static void main(String []args){
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Ingresar un valor para K");
	double K = sc.nextDouble();
	
	System.out.println("Las probabilidades son: ");
	double P = sc.nextDouble();
	
	double Gaby = Math.pow(P, K);
	double E = Math.E;
	E=(Math.pow(E, -P));
	double I=1;
	while (K!=0) {
		I=I*K;
		K--;
	}
	
	E = E*Gaby;
	E = E/I;
	
	System.out.println("Los resultados son: "+E);
	
}


}
