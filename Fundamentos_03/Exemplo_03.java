package Fundamentos_03;

public class Exemplo_03 {

	public static void main(String[] args) {
		String str = "Hello World";
		String resultado = str.substring(6);
		System.out.println(resultado);
		
		String resultado1 = str.substring(3,8);
		System.out.println(resultado1);
		
		String resultado3 = str.toUpperCase();
		System.out.println(resultado3);
		
		String resultado4 = str.toLowerCase();
		System.out.println(resultado4);
		
		String resultado5 = str.trim();
		System.out.println(resultado5);
		
		char c = str.charAt(1);
		System.out.println(c);
		
		String str1 = "hello";
		String str2 = "HELLO";
		boolean b1 = str1.equals ("Hello");
		boolean b2 = str1.equals (str2);
		boolean b3 = str1.equalsIgnoreCase (str2);
		boolean b4 = str1.equalsIgnoreCase("azul");
		System.out.println();
		
		String s = "abc";
		int tam = s.length();
		System.out.println(tam);
		
		String str3 = "Hello World, Hello";
		int pos = str.indexOf("l");
		System.out.println(pos);
		int pos2 = str.lastIndexOf(c);
		
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 -Java") == 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 -JAVA") == 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA") == 0 ? true : false);
		 
		 String valor1 = "CDD - Java";
		 System.out.println(valor.endsWith("Java"));
		 System.out.println(valor.startsWith("C"));
		 System.out.println(valor.startsWith("DD", 1));
		 
		

	}

}
