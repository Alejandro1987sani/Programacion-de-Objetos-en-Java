import java.util.Scanner;
public class Aplicativodiv{
	public static void main(String[] args){
		float valor1,valor2,valor3;
		Scanner lee=new Scanner(System.in);
		System.out.println("ingrese el valor1");
		valor1=lee.nextFloat();
		System.out.println("ingrese el valor2");
		valor2=lee.nextFloat();
		Operacionesdiv obj1=new Operacionesdiv(valor1);
		Operacionesdiv obj2=new Operacionesdiv(valor2);
		valor1=obj1.getValor();
		valor2=obj2.getValor();
		valor3=obj1.div(valor1, valor2);
		System.out.println("La Division es: "+valor3);

	}	
}