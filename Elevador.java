package Practica;

public class Elevador {
	static int numberFloor;
	static int goFloor;

public static void pedirElevador () {
	Robot obj = new Robot ();
	System.out.println("Ché en que piso estas?");
	numberFloor = (int) obj . Leer();
	
	while (numberFloor < 0 || numberFloor > 15) {
		obj.PedirNuevamente = true;
		System.out.println("Has ingresado un numero de piso invalido");
		System.out.println("Ingrese nuevamente un numero del 0 al 15");
		numberFloor = (int)obj.Leer();
		}	
	
	System.out.println("Llegando ascensor");
	System.out.println("Abriendo puertas");
	pedirPiso ();
}

public static void pedirPiso () {
	Robot obj = new Robot ();
	System.out.println("Ingresa el piso al que quieres ir");
	goFloor = (int) obj . Leer();	
	
	while (goFloor < 0 || goFloor > 15) {
		obj.PedirNuevamente = true;
		System.out.println("Has ingresado un numero de piso invalido");
		System.out.println("Ingrese nuevamente un numero del 0 al 15");
		goFloor = (int)obj.Leer();
		}	
	
	System.out.println("Cerrando Puertas");
	if (goFloor > numberFloor){
		System.out.println("Subiendo");
		runningStateFloor(numberFloor , goFloor);
	}else{
		System.out.println("Bajando");
		runningStateFloor(numberFloor,goFloor);
	}
	mensaje(goFloor);
	
}

public static void runningStateFloor (int val1, int val2){
	int s;
	int b;
	int x;
	if(val1 < val2){
		x = val2 ;
		for (s = val1 ; s <= x ; s ++){
			System.out.println("Subiendo al piso " + s);
		}
	}else{
		x = val2;
		for (b= val1 ; b > x ; b --){
			System.out.println("Bajando del piso " + b);
		}
	}
} 

public static void mensaje (int piso){
	String abrir = "Abriendo puerta";
	String pantalla = "Usted esta en el piso  ";
	String cerrar = "Cerrando puerta";
	System.out.println(pantalla + piso);
	System.out.println(abrir);
}

public static void main(String[] args) {
	
pedirElevador();

	}

}
