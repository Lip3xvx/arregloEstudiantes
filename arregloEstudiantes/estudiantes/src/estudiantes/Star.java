package estudiantes;

public class Star {
	import javax.swing.JOptionPane;

	public class Procesos {
	    private String[] nombre;
	    private int[] edad;
	    
	    public void iniciar() {
	        String menu = "MENU ESTUDIANTES\n";
	        menu += "1. Registrar\n";
	        menu += "2. Imprimir\n";
	        menu += "3. Buscar por nombre\n";
	        menu += "4. Promedio de edades\n";
	        menu += "5. Mayores de edad\n";
	        menu += "6. Menores de edad\n";
	        menu += "7. Salir\n";
	        menu += "Ingrese una opción:";
	        
	        int opc = 0;
	        do {
	            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
	            validarOpcion(opc);
	        } while (opc != 7);
	    }
	    
	    private void validarOpcion(int opc) {
	        switch (opc) {
	            case 1:
	                registrarEstudiantes();
	                break;
	            case 2:
	                imprimirEstudiantes();
	                break;
	            case 3:
	                nombreEstudiante();
	                break;
	            case 4:
	                promedioEdades();
	                break;
	            case 5:
	                estudiantesMayores();
	                break;
	            case 6:
	                estudiantesMenores();
	                break;
	            case 7:
	                System.out.println("Chao!");
	                break;
	            default:
	                System.out.println("No existe el código!");
	                break;
	        }
	    }
	    
	    private void registrarEstudiantes() {
	        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
	        nombre = new String[n];
	        edad = new int[n];

	        for (int i = 0; i < nombre.length; i++) {
	            nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre");
	            edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
	        }
	    }
	    
	    public void imprimirEstudiantes() {
	        System.out.println("Lista de estudiantes: ");
	        for (int i = 0; i < nombre.length; i++) {
	            System.out.println(nombre[i] + ": " + edad[i] + " años");
	        }
	    }
	    
	    public void nombreEstudiante() {
	        System.out.println("Escriba el nombre del estudiante");
	        int cont = 0;
	        String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
	        
	        for (int i = 0; i < nombre.length; i++) {
	            if (nombre[i].equals(nombreBuscar)) {
	                System.out.println("Lo encontró en la pos: " + i + " con " + edad[i] + " años");
	                cont++;
	            }
	        }
	        
	        if (cont > 0) {
	            System.out.println("Lo encontró " + cont + " veces");
	        } else {
	            System.out.println("No encontró el nombre " + nombreBuscar);
	        }
	    }
	    
	    public void promedioEdades() {
	        int total = 0;
	        for (int i = 0; i < edad.length; i++) {
	            total += edad[i];
	        }
	        double promedio = (double) total / edad.length;
	        System.out.println("El promedio de edades es: " + promedio);
	    }
	    
	    public void estudiantesMayores() {
	        int cont = 0;
	        System.out.println("Estudiantes mayores de edad:");
	        for (int i = 0; i < edad.length; i++) {
	            if (edad[i] >= 18) {
	                System.out.println(nombre[i] + "forma parte del grupo mayores de edad. Tiene usted " + edad[i] + " años.");
	                cont++;
	            }
	        }
	        System.out.println("Estudiantes mayores de edad: " + cont);
	    }


	    public void estudiantesMenores() {
	        int menor = edad[0];
	        for (int i = 1; i < edad.length; i++) {
	            if (edad[i] < menor) {
	                menor = edad[i];
	            }
	        }
	        System.out.println("Estudiantes menores de edad:");
	        for (int i = 0; i < edad.length; i++) {
	            if (edad[i] == menor) {
	                System.out.println(nombre[i] + "forma parte del grupo menores de edad. Tiene usted " + edad[i] + " años.");
	            }
	        }
	    }


}
