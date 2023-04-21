package javaConcepts;

public class Stringspractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name1 = { "Fresho\r\n" + "Cucumber (Loose)" };

		String[] name2 = name1[0].split("Fresho");
		// System.out.println(name2[0]);
		String names = name2[1].trim();

		String[] name3 = names.split(" ");
		System.out.println(name3[0].trim());
		// System.out.println(name3[1].trim());
	}

}
