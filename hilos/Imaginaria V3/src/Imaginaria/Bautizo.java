package Imaginaria;

public class Bautizo {
static String[] nombre={"edelmiro","Ataulfo","Benito","Diocleciano","Sinforiano","Anacleto",
	"Jacinto","Agustin","Salustiano","Silvestre"};
static String[] apellido={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x",};
public static String bautizarHabitante(){
	StringBuilder nombreHab=new StringBuilder();
	
	nombreHab.append(nombre[(int) (Math.random()*nombre.length)]);
	nombreHab.append(" ");
	nombreHab.append(apellido[(int) (Math.random()*apellido.length)]);
	return nombreHab.toString();
}
}
