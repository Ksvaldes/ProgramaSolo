import java.util.Scanner;

public class Formula {

	public static void dividir() {
	    /*INTERACCION CON EL USUARIO*/
	 	Scanner dividendo= new Scanner (System.in);
	 	System.out.println("");
		System.out.print("�Cu�l es tu peso en libras? : ");
		double num_1 = dividendo.nextDouble();
		
		
		Scanner divisor= new Scanner (System.in);
		System.out.println("");
		System.out.print("�Cu�l es tu altura en metros? : ");
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
			System.out.println("�Tienes un IMC de 18.5 o por debajo de esta cantidad?\r\n"
					+ "\r\n"
					+ "Eso significa que tu indice de masa corporal es muy\r\n"
					+ "bajo, lo cual te puede trar muchas consecuencias por esta\r\n"
					+ "raz�n te mencionar� algunos tratamientos y consejos\r\n"
					+ "para mejorar tu indice de masa corporal.\r\n"
					+ "\r\n"
					+ "TRATAMIENTOS:\r\n"
					+ "1.Comer con m�s frecuencia.\r\n"
					+ "2.Escoger comidas ricas en nutrientes.\r\n"
					+ "3.Tomar batidos y licuados de frutas.\r\n"
					+ "4.Elegir productos l�cteos enteros.\r\n"
					+ "5.Hacer ejercicio.\r\n"
					+ "\r\n"
					+ "ALIMENTOS ACONSEJADOS:\r\n"
					+ "1.Leche entera y semidesnatada.\r\n"
					+ "2.Quesos frescos enteros tipo Burgos y semigrasos.\r\n"
					+ "3.Yogures enteros. Yogur azucarado con frutas o cereales.\r\n"
					+ "4.Queso fresco con frutas y az�car, tipo petit-suisse. \r\n"
					+ "5.Pollo y pavo, ternera, cerdo magro, conejo y \r\n"
					+ "pierna de cordero.");
		
		}
	if (Respuesta>=18.6) {
		System.out.println("");
			System.out.println("�Tienes un IMC de entre 18.6 a 24.9?\r\n"
					+ "\r\n"
					+ "Dejame felicitarte, tienesun IMC muy bueno. Felicidades!!\r\n"
					+ "A continuaci�n de mencionar� algunas formas de mantener as� tu IMC.\r\n"
					+ "\r\n"
					+ "CONSEJOS:\r\n"
					+ "1. Ejercicio f�sico. La actividad f�sica regular quema \r\n"
					+ "calor�as y genera tejido muscular. \r\n"
					+ "2. Reduce el tiempo ante la pantalla.\r\n"
					+ "3. Ten cuidado con las porciones distorsionadas.\r\n"
					+ "4. Come 5 porciones de frutas y verduras por d�a. \r\n"
					+ "5. No te saltees el desayuno.");
		}
	if (Respuesta>=25) {
		System.out.println("");
			System.out.println("\r\n"
					+ "�Tienes un IMC de entre 25 a 29.9?\r\n"
					+ "\r\n"
					+ "Eso significa que seg�n tu IMC tienes sobrepeso.\r\n"
					+ "Pero no te preocupes aqu� te mencionar� algunos consejos\r\n"
					+ "para mejorar tu IMC.\r\n"
					+ "\r\n"
					+ "CAUSAS:\r\n"
					+ "Hay varios factores que contribuyen al aumento excesivo de \r\n"
					+ "peso, los m�s comunes son:\r\n"
					+ "\r\n"
					+ "1. Falta de actividad f�sica\r\n"
					+ "2.Alimentaci�n inadecuada,exceso de alimentos con pocos\r\n"
					+ "nutrientes.\r\n"
					+ "3.Gen�tica\r\n"
					+ "4.Estilo de vida, el sedentarismo por ejemplo.\r\n"
					+ "\r\n"
					+ "RECOMENDACIONES:\r\n"
					+ "1.Limitar el consumo de alimentos que sean ricos en \r\n"
					+ "az�cares y grasas.Por ejemplo, algunos cereales son ricos\r\n"
					+ "en fibra, pero tambi�n en az�cares.\r\n"
					+ "2.Comer varias veces al d�a fruta y verdura, as� como \r\n"
					+ "legumbres, cereales integrales y frutos secos.\r\n"
					+ "3.Realizar actividad f�sica frecuente.\r\n"
					+ "\r\n"
					+ "CONSECUENCIAS DEL SOBREPESO:\r\n"
					+ "Una persona con problemas de peso sufre cambios en su \r\n"
					+ "metabolismo, en sus sistemas �seo y muscular, \r\n"
					+ "en el coraz�n, en la respiraci�n y en su manera de dormir. ");		
		}
	if (Respuesta>=30) {
		System.out.println("");
			System.out.println("\r\n"
					+ "�Tienes un IMC de 40 o m�s?\r\n"
					+ "\r\n"
					+ "Eso significa que segun tu IMC tienes obesidad.\r\n"
					+ "Pero no te preocupes aqu� te mencionar� algunos consejos\r\n"
					+ "para mejorar tu IMC.\r\n"
					+ "\r\n"
					+ "CAUSAS:\r\n"
					+ "Existen causas gen�ticas, causas hormonales y causas de \r\n"
					+ "comportamiento, pero normalmente la obesidad se da cuando \r\n"
					+ "la persona ingiere m�s calor�as de las que se queman con\r\n"
					+ "la actividad f�sica. Estas calor�as en exceso, acaban por\r\n"
					+ " acumularse en el cuerpo en forma de grasa.\r\n"
					+ "\r\n"
					+ "RECOMENDACIONES:\r\n"
					+ "1.Hacer ejercicio regularmente: entre 150 y 300 minutos\r\n"
					+ "de actividad f�sica moderada semanal evitan el aumento \r\n"
					+ "de peso.\r\n"
					+ "2.Seguir una dieta y un plan de alimentaci�n saludable:\r\n"
					+ "con una dieta rica en nutrientes y baja en calor�as, \r\n"
					+ "que eviten las grasas saturadas, evit�ndose el alcohol \r\n"
					+ "y los dulces.\r\n"
					+ "3.Controlar el peso de manera regular: un control de \r\n"
					+ "peso semanal indica si los esfuerzos est�n dando o no \r\n"
					+ "resultados y permiten detectar ligeros aumentos de peso \r\n"
					+ "antes de que estos se conviertan en un problema. \r\n"
					+ "4.Ser constante\r\n"
					+ "\r\n"
					+ "CONSECUENCIAS DEL SOBREPESO:\r\n"
					+ "Una persona con problemas de peso sufre cambios en su \r\n"
					+ "metabolismo, en sus sistemas �seo y muscular, \r\n"
					+ "en el coraz�n, en la respiraci�n y en su manera de dormir.");
		}
		
		
		

	}
		
	
		
	
	
	  
		    
	
 
	

	
    
	
	
	
	
	
	
	
}
