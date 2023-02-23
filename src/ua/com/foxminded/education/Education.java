package ua.com.foxminded.education;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
//import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Education {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan", "Ivanov");
		Student student2 = new Student("Nikolay", "Petrov");
		Student student3 = new Student("Kirill", "Antipov");
		Course matematic = new Course("Matematic");
		Course philosophy = new Course("Philosophy");
		Course english = new Course("English");
		Course physics = new Course("Physics");
		Course french = new Course("French");
		english.ChangeCourse();
		Map<Student, List<Course>> education = new HashMap<Student, List<Course>>();

		education.put(student1, Arrays.asList(matematic, philosophy));
		education.put(student2, Arrays.asList(matematic, english, physics));
		education.put(student3, Arrays.asList());
		education.replace(student2, Arrays.asList(matematic, english, physics),
				Arrays.asList(matematic, french, physics));

		for (Map.Entry entry : education.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
//		  Map<String,Object> university =new HashMap<String,Object>();  
//		  university.put("Oxforf", education);
//		System.out.println(university.toString());
//		 

//		    Arrays.asList().subList(english, philsophy);
	}

//		Map<Student, Course> education = new HashMap<Student, Course>();
//		education.put(new Student("Ivan", "Ivanov"), new Course("Matematic"));
//		education.put(new Student("Nikolay", "Petrov"), new Course("Philosophy"));
//		education.put(new Student("Kirill", "Antipov"), new Course(" English"));
//		
//		 for(Map.Entry<Student,List<Course>> ed : education.entrySet()){
//	         
//	           System.out.printf("Key: %s  : %s \n", ed.getKey(), ed.getValue());
//	       }
//		Map<Student,List<Course>> education1=new HashMap<Student,List<Course>>();
//		education1.put(new Student("Ivan", "Ivanov"));
//		List<Course> nameOfCourse =new ArrayList<Course>();
//		nameOfCourse.add(new Course("English"));
//		nameOfCourse.add(new Course("Matematic"));
//		nameOfCourse.add(new Course("Phisic"));
//		nameOfCourse.add(new Course("Philosophy"));
}
