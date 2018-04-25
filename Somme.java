public class Somme {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		int Somme= x + y;
		Affiche(Somme);
		Affiche(Soustraction);
		Affiche(Multiplication);
		}
	
	static void Affiche(int somme) {
		System.out.println(somme);
}
	public static int Multiplication (int x, int y) {
		int c = x*y;
		return c;
}
	public static int Somme (int x, int y) {
		int c = x+y;
		return c;
}}
	public static int Soustraction (int x, int y) {
		int c = x-y;
		return c;
}

