import java.util.Scanner;
public class Aplicativores{
	public static void main(String[] args){
		float valor1,valor2,valor3;
		Scanner lee=new Scanner(System.in);
		System.out.println("ingrese el valor1");
		valor1=lee.nextFloat();
		System.out.println("ingrese el valor2");
		valor2=lee.nextFloat();
		Operacionesres obj1=new Operacionesres(valor1);
		Operacionesres obj2=new Operacionesres(valor2);
		valor1=obj1.getValor();
		valor2=obj2.getValor();
		valor3=obj1.res(valor1, valor2);
		System.out.println("La Resta es: "+valor3);

	}	
}