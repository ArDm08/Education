package ua.com.foxminded.education;

import java.util.Objects;

public class Student {
	private String name;
	private String sername;

	public Student(String name, String sername) {
		this.name = name;
		this.sername = sername;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sername=" + sername + "]";
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getSername() {
		return sername;
	}

	public final void setSername(String sername) {
		this.sername = sername;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sername);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(sername, other.sername);
	}

}
