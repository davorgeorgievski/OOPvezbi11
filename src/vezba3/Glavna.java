package vezba3;

import java.util.ArrayList;
import java.util.List;

public class Glavna {
	
	public static void main(String[] args) {
		XmlCreator xml = new XmlCreator();
		List<Student> s = new ArrayList<Student>();
		s.add(new Student("Marko", "Jovanovski", 100));
		s.add(new Student("Stefan", "Ivanovski", 105));
		xml.createXMLFile("xml.xml", s);
	}
}