
public class Somme {
		public static void main(String[] args) {
		int Somme = 0;
		int Soustraction = 0;
		Affiche(Somme);	
		Affiche(Soustraction);	
		}
	
	static void Affiche(int a) {
		System.out.println(a);
}
	public static int Soustraction (int x, int y) {
		int c = x-y;
		return c;
}
	public static int Somme (int x, int y) {
		int c = x+y;
		return c;
}

}
