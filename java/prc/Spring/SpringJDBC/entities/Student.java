package prc.Spring.SpringJDBC.entities;

public class Student {

		private int id;
		private String name;
		private String cit;
		public Student(int id, String name, String cit) {
			super();
			this.id = id;
			this.name = name;
			this.cit = cit;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCit() {
			return cit;
		}
		public void setCit(String cit) {
			this.cit = cit;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", cit=" + cit + "]";
		}
		
	}


