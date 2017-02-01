
public class Desencriptador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "6f676c41";
		StringBuilder mensajeBien = null;
		int counter = 0;
		int counter2 = 2;
		String cosa="";
		StringBuilder output = new StringBuilder();
		for(int i=0; i<(mensaje.length()/2);i++){			
			
			
			cosa=mensaje.substring(counter, counter2);
			StringBuilder c= output.append((char) Integer.parseInt(cosa, 16));
			counter=counter+2;
			counter2=counter2+2;
			
			
			
			mensajeBien=c;
		}
		mensajeBien=mensajeBien.reverse();
		
		System.out.println(mensajeBien);

	}

}
