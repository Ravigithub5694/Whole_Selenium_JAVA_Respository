package RaviFrameworks.ExceldataDriven1;

import java.io.IOException;
import java.util.ArrayList;

public class testSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelData ed=new ExcelData();
		ArrayList<String> data=ed.getData("Add profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
	}

}
