package operaarray;

public class array {
	public static void main(String[] args) {
		rellenaArray();
	}

	public static void rellenaArray() {
		
			//esto es un metodo que rellena un array on 10 numeros alearorios de 1 a 20
	    int[] numeros = new int[10];
	    for (int x=0;x<numeros.length;x++) {
	        numeros[x] = (int) (Math.random()*20)+1;
	    }
	    
	    for (int i = 0; i < 10; i++) {
	    	System.out.println(" " + numeros[i] + "");
	    
	    }
	}}
	


