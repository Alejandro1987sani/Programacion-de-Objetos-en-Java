import java.util.Scanner;
public class Aplicativo{
	public static void main(String[] args){
		float valor1,valor2,valor3;
		Scanner lee=new Scanner(System.in);
		System.out.println("ingrese el valor1");
		valor1=lee.nextFloat();
		System.out.println("ingrese el valor2");
		valor2=lee.nextFloat();
		Operaciones obj1=new Operaciones(valor1);
		Operaciones obj2=new Operaciones(valor2);
		valor1=obj1.getValor();
		valor2=obj2.getValor();
		valor3=obj1.suma(valor1, valor2);
		System.out.println("La Suma es: "+valor3);

	}	
}