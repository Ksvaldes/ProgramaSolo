import java.util.Scanner;
public class main {
	
	
	
	public static void main(String[] args) {
       
		 
		/*MENSAJE INICIAL DEL PROGRAMA*/
		
		Img textoMensaje =new Img();
		textoMensaje.Mensaje();
		
		/*PRIMERA INTERACCION DEL USUARIO*/
		Scanner imputCommand = new Scanner (System.in);
		System.out.print("--------> ");
		String  output = imputCommand.nextLine();
		
        /*BUSCA EN LA LIBRERIA EL COMADO INGRESADO*/
		CommandList datacommand =new CommandList ();
	
		for (int i=0;i<3;i++) {
			if(output.equals(datacommand.command[0])) {
		    Formula Dijosi = new Formula();
			Dijosi.dividir();
			i=4;
			}
			else if(output.equals(datacommand.command[1])) { 
			
				
			System.out.println("");
			System.out.println("Recuerda que la mente tranquila aporta fortaleza interna y \r\n"
					+ "confianza en uno mismo, por lo que es muy importante para \r\n"
					+ "una buena salud.");
			i=4;
			}else if(output.equals(datacommand.command[2])) { 
				
				/*INFORMACION SOBRE LA CREACION DEL PROGRAMA*/
				System.out.println("");
				System.out.println("Karen Sophia Valdés Leonardo, creó este programa.");
				System.out.println("");
				System.out.println("Páginas utilizadas para la recolección de información: ");
				System.out.println("");
				System.out.println("https://www.cdc.gov/healthyweight/spanish/assessing/bmi/\r\n"
						+ "adult_bmi/metric_bmi_calculator/bmi_calculator.html");
				System.out.println("");
				System.out.println("https://cuidateplus.marca.com/alimentacion/diccionario/\r\n"
						+ "indice-masa-corporal-imc.html");
				i=4;
				}else{
			
				/*AVISO QUE EL COMANDO INGRESADO NO EXISTE*/
			    System.out.println("Comando no encontrado");
			    i=4;

				}
		
			
				}		
}
}
	