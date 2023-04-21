package ravikumaracademy.data;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class datareader {

	public List<HashMap<String, String>> getJsondataMap() throws IOException {
		
		//rwad json to string
		String jsoncontent=FileUtils.readFileToString(new File(System.getProperty("userdir")+"\\src\\test\\java\\ravikumaracademy\\data\\Purchase.json"));
		
		//String to Hashmap Jackson databind depndency d
		
		ObjectMapper mapper= new ObjectMapper();
		List<HashMap<String, String>> data=mapper.readValue(jsoncontent, new TypeReference<List<HashMap<String,String>>>(){});
		return data;
		
	
		
	}
}
