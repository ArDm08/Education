package ua.com.foxminded.education;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class Education {

	public static void main(String[] args) {
		Student student1 = new Student("Ivan", "Ivanov");
		Student student2 = new Student("Nikolay", "Petrov");
		Student student3 = new Student("Kirill", "Antipov");
		Course matematic = new Course("Matematic");
		Course philosophy = new Course("Philosophy");
		Course english = new Course("English");
		Course physics = new Course("Physics");
		Course french = new Course("Franch");

		Map<Student, List<Course>> education = new HashMap<Student, List<Course>>();

		education.put(student1, Arrays.asList(matematic, english, philosophy));
		education.put(student2, Arrays.asList(matematic, english, physics));
		education.put(student3, Arrays.asList());

		Map<List<Course>, Student> changeMap = new HashMap<List<Course>, Student>();
		for (Map.Entry<Student, List<Course>> entry : education.entrySet()) {
			changeMap.put(entry.getValue(), entry.getKey());
		}

		for (Map.Entry entry : changeMap.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	////It is a working code//
	for (List<Course> courses : education.values()) {
	 Collections.replaceAll(courses, english, french);
	}
//This code is works!!
for (List<Course> course : education.values()) {

	int indexOf = course.indexOf(english);
	if (indexOf >= 0) {
		course.set(indexOf, french);
	}
}


		for (List<Course> courses1 : education.values()) {
			List<Course> updateCourse = new ArrayList<>();
			updateCourse.addAll(courses1);
			for (Course course : courses1) {
				if (course.equals(english)) {
					updateCourse.remove(course);
					updateCourse.add(french);
					System.out.println(updateCourse);

					Map<Student, List<Course>> newMap = new LinkedHashMap<>();
					for (Map.Entry<Student, List<Course>> entry : education.entrySet()) {
						newMap.put(entry.getKey(), entry.setValue(updateCourse));
					}

				}

			}
		}

		for (Map.Entry entry : education.entrySet()) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
	}

}

//		}
//		Map<Student, List<Course>> newMap = new HashMap<>(education);
//		for (Student key : education.keySet()) {
//		for(List<Course> vl:education.values())	{
//			newMap.put(v1, key);
//		}
//		}
//		Iterator<Course> changeCourse = updateCourse.iterator();
//		while(changeCourse.hasNext()) {
//			Course nextCourse = changeCourse.next();
//			if(nextCourse.equals(english)) {
//				changeCourse.remove();
//			}
//		}
//		}

//			 =itr.hasNext();
//		}
//		for(Course course:updateCourse) {
//			
//			if(course.equals(english)) {
//				updateCourse.remove();
//				updateCourse.add(french);
//				for(int i=0;i<updateCourse.size();i++) {
//					System.out.println(i);
//				}
//			}
//		}
//		}
//		for(int i=0;i<updateCourse.size();i++) {
//			System.out.println(updateCourse.get(i));
//			if(updateCourse.get(i).equals(english)){
//			updateCourse.remove(i);
//			i--;
//			System.out.println(i);
//			updateCourse.add(french);
//		}
//	
//		}
//	}
//		for (ListIterator<Course> it = updateCourse.listIterator(); it.hasNext();){
//		    Course value = it.next();
//		    if (english.equals(value)) {
//		    	updateCourse.remove(value);
////		        it.add(french);
//		    }
//		}

//		for(Course course : updateCourse) {
//			
//			if (course.equals(english)){
//		
//				courses.remove(english);
//				courses.add(french);
//			
//		}else {  
//			updateCourse.add(course);
//		}
////		}
//				for (Student key : education.keySet()) {
//					newMap.put(key,updateCourse);
//					education.putAll(newMap);
//
//				}
//		List<Course> course4 = new ArrayList<>();
//		for (List<Course> courses : education.values()) {
//			course4.addAll(courses);
//			for (Course course : courses) {
//				if (english.equals(course)) {
//				courses4.remove(english);
//				courses4.add(french);
//				
//			}
//			}

//		}
//		}
//		Iterator<List<Course>> courses = education.values().iterator();
//	
//	List<Iterator<List<Course>>> courses2 = Arrays.asList(courses);
//		List <Course>newList = new ArrayList<>();
//        for (Course course : courses2) {
//        	if(english.equals(course)) {
//        	newList.add(new Course("Franch"));	
//        	}else {
//        		newList.addAll( Arrays.asList(course));
//        	}
//        }

//		for (List<Course> course:education.values() ) {
//			List<Course> courses2 = new ArrayList<Course>(course);
//			if(course.equals(courses2)) {
//				course.remove(english);
//				course.addAll(courses2);
//			}
//		List<Course> courses2 = new ArrayList<>();
//		Iterator<List<Course>> newCourses = courses.iterator();
//
//		for (List<Course> course : courses) {
//			if (english.equals(course)) {
//				while (newCourses.hasNext()) {
//					List<Course> value = ((Iterator<List<Course>>) courses).next();
//					courses.remove(english);
//				}
//			}
//		}

//}

//	This code is works!!!!
//		Iterator<Map.Entry<Student, List<Course>>> update = education.entrySet().iterator();
//		Map<Student, List<Course>> newMap = new HashMap<>();
//
//		while (update.hasNext()) {
//			Map.Entry<Student, List<Course>> newValue = update.next();
//		if()
//			update.remove();
//			for (Student keys:education.keySet()) {
//			newMap.put(keys, null );
//			}
//			education.putAll(newMap);
//		}

//for (Entry<Student, List<Course>> entry : newMap.entrySet()) {
//	education.put(entry.getKey(), entry.setValue(courses1));
//	education.putAll(newMap);
//}
//education.get(student1).set(1, french);
//for (Entry<Student, List<Course>> entry : education.entrySet())
//	entry.setValue( new List<Course>());
//for (Entry<Student, List<Course>> entry : education.entrySet()) {
//education.put(entry.getKey(),entry.setValue(new ArrayList<Course>()));
//	}
//}

//}
//Collections.replaceAll(courses, english, french);
//updatedCourses.add(new Course("Franch"));

//for (Map.Entry<Student, List<Course>> entry : education.entrySet()) {
//entry.setValue(entry.getValue(),new  );
//
//		education.replaceAll( (k,v)->v= );
//		education.put( (Student) education.keySet(), (updatedCourses));
//		education.replace(student2, Arrays.asList(matematic, english, physics),
//				Arrays.asList(matematic, french, physics));
//	

//		education.replaceAll((k, v) -> {
//			if (education.containsKey(student1));
//			 return education.put(student1, (List<Course>)Arrays.asList(matematic) ;
//			{
//			return null;
//			}
//		});

//		 
//		 
//
//		    Arrays.asList().subList(english, philsophy);

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
//		education1.put(new Student("Ivan",nameOfCourse ));
//		List<Course> nameOfCourse =new ArrayList<Course>();
//		nameOfCourse.add(new Course("English"));
//		nameOfCourse.add(new Course("Matematic"));
//		nameOfCourse.add(new Course("Phisic"));
//		nameOfCourse.add(new Course("Philosophy"));

//if (v == Arrays.asList(english));
//
//{
//	return v = Arrays.asList(french);
//}
//});