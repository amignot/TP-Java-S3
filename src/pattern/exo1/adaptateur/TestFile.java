package pattern.exo1.adaptateur;

public class TestFile {

	public static void main(String[] args) {
		
		FileImpl<Integer> file = new FileImpl<Integer>();
		
		file.insererQueue(3);
		file.insererQueue(5);
		
		file.retirerTete();
		System.out.println(file.tete());
	}
}
