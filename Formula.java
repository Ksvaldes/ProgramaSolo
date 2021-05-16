import java.util.Scanner;

public class Formula {

	public static void dividir() {
	    /*INTERACCION CON EL USUARIO*/
	 	Scanner dividendo= new Scanner (System.in);
	 	System.out.println("");
		System.out.print("¿Cuál es tu peso en libras? : ");
		double num_1 = dividendo.nextDouble();
		
		
		Scanner divisor= new Scanner (System.in);
		System.out.println("");
		System.out.print("¿Cuál es tu altura en metros? : ");
		double num_2 = divisor.nextDouble();
		
		/*FORMULA PARA CONSEGUIR EL IMC*/
		double Masa=0;
		double alcuadrado = num_2*num_2;
        double akilogramos = num_1/2.205;
		double Respuesta= akilogramos/alcuadrado;
		Respuesta=Math.round(Respuesta*100)/100d;
		System.out.println("");
		System.out.println("---> Tu IMC es de: "+Respuesta);
			
	    /*RECOMENDACIONES AL USUARIO*/
				
	if (Respuesta<=18.5) {
		System.out.println("");
			System.out.println("¿Tienes un IMC de 18.5 o por debajo de esta cantidad?\r\n"
					+ "\r\n"
					+ "Eso significa que tu indice de masa corporal es muy\r\n"
					+ "bajo, lo cual te puede trar muchas consecuencias por esta\r\n"
					+ "razón te mencionaré algunos tratamientos y consejos\r\n"
					+ "para mejorar tu indice de masa corporal.\r\n"
					+ "\r\n"
					+ "TRATAMIENTOS:\r\n"
					+ "1.Comer con más frecuencia.\r\n"
					+ "2.Escoger comidas ricas en nutrientes.\r\n"
					+ "3.Tomar batidos y licuados de frutas.\r\n"
					+ "4.Elegir productos lácteos enteros.\r\n"
					+ "5.Hacer ejercicio.\r\n"
					+ "\r\n"
					+ "ALIMENTOS ACONSEJADOS:\r\n"
					+ "1.Leche entera y semidesnatada.\r\n"
					+ "2.Quesos frescos enteros tipo Burgos y semigrasos.\r\n"
					+ "3.Yogures enteros. Yogur azucarado con frutas o cereales.\r\n"
					+ "4.Queso fresco con frutas y azúcar, tipo petit-suisse. \r\n"
					+ "5.Pollo y pavo, ternera, cerdo magro, conejo y \r\n"
					+ "pierna de cordero.");
		
		}
	if (Respuesta>=18.6) {
		System.out.println("");
			System.out.println("¿Tienes un IMC de entre 18.6 a 24.9?\r\n"
					+ "\r\n"
					+ "Dejame felicitarte, tienesun IMC muy bueno. Felicidades!!\r\n"
					+ "A continuación de mencionaré algunas formas de mantener así tu IMC.\r\n"
					+ "\r\n"
					+ "CONSEJOS:\r\n"
					+ "1. Ejercicio físico. La actividad física regular quema \r\n"
					+ "calorías y genera tejido muscular. \r\n"
					+ "2. Reduce el tiempo ante la pantalla.\r\n"
					+ "3. Ten cuidado con las porciones distorsionadas.\r\n"
					+ "4. Come 5 porciones de frutas y verduras por día. \r\n"
					+ "5. No te saltees el desayuno.");
		}
	if (Respuesta>=25) {
		System.out.println("");
			System.out.println("\r\n"
					+ "¿Tienes un IMC de entre 25 a 29.9?\r\n"
					+ "\r\n"
					+ "Eso significa que según tu IMC tienes sobrepeso.\r\n"
					+ "Pero no te preocupes aquí te mencionaré algunos consejos\r\n"
					+ "para mejorar tu IMC.\r\n"
					+ "\r\n"
					+ "CAUSAS:\r\n"
					+ "Hay varios factores que contribuyen al aumento excesivo de \r\n"
					+ "peso, los más comunes son:\r\n"
					+ "\r\n"
					+ "1. Falta de actividad física\r\n"
					+ "2.Alimentación inadecuada,exceso de alimentos con pocos\r\n"
					+ "nutrientes.\r\n"
					+ "3.Genética\r\n"
					+ "4.Estilo de vida, el sedentarismo por ejemplo.\r\n"
					+ "\r\n"
					+ "RECOMENDACIONES:\r\n"
					+ "1.Limitar el consumo de alimentos que sean ricos en \r\n"
					+ "azúcares y grasas.Por ejemplo, algunos cereales son ricos\r\n"
					+ "en fibra, pero también en azúcares.\r\n"
					+ "2.Comer varias veces al día fruta y verdura, así como \r\n"
					+ "legumbres, cereales integrales y frutos secos.\r\n"
					+ "3.Realizar actividad física frecuente.\r\n"
					+ "\r\n"
					+ "CONSECUENCIAS DEL SOBREPESO:\r\n"
					+ "Una persona con problemas de peso sufre cambios en su \r\n"
					+ "metabolismo, en sus sistemas óseo y muscular, \r\n"
					+ "en el corazón, en la respiración y en su manera de dormir. ");		
		}
	if (Respuesta>=30) {
		System.out.println("");
			System.out.println("\r\n"
					+ "¿Tienes un IMC de 40 o más?\r\n"
					+ "\r\n"
					+ "Eso significa que segun tu IMC tienes obesidad.\r\n"
					+ "Pero no te preocupes aquí te mencionaré algunos consejos\r\n"
					+ "para mejorar tu IMC.\r\n"
					+ "\r\n"
					+ "CAUSAS:\r\n"
					+ "Existen causas genéticas, causas hormonales y causas de \r\n"
					+ "comportamiento, pero normalmente la obesidad se da cuando \r\n"
					+ "la persona ingiere más calorías de las que se queman con\r\n"
					+ "la actividad física. Estas calorías en exceso, acaban por\r\n"
					+ " acumularse en el cuerpo en forma de grasa.\r\n"
					+ "\r\n"
					+ "RECOMENDACIONES:\r\n"
					+ "1.Hacer ejercicio regularmente: entre 150 y 300 minutos\r\n"
					+ "de actividad física moderada semanal evitan el aumento \r\n"
					+ "de peso.\r\n"
					+ "2.Seguir una dieta y un plan de alimentación saludable:\r\n"
					+ "con una dieta rica en nutrientes y baja en calorías, \r\n"
					+ "que eviten las grasas saturadas, evitándose el alcohol \r\n"
					+ "y los dulces.\r\n"
					+ "3.Controlar el peso de manera regular: un control de \r\n"
					+ "peso semanal indica si los esfuerzos están dando o no \r\n"
					+ "resultados y permiten detectar ligeros aumentos de peso \r\n"
					+ "antes de que estos se conviertan en un problema. \r\n"
					+ "4.Ser constante\r\n"
					+ "\r\n"
					+ "CONSECUENCIAS DEL SOBREPESO:\r\n"
					+ "Una persona con problemas de peso sufre cambios en su \r\n"
					+ "metabolismo, en sus sistemas óseo y muscular, \r\n"
					+ "en el corazón, en la respiración y en su manera de dormir.");
		}
		
		
		

	}
		
	
		
	
	
	  
		    
	
 
	

	
    
	
	
	
	
	
	
	
}
