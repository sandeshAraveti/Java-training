
public class Studentt implements Comparable {

		int sno;
		String name;
		String city;
		double cgp;
		public Studentt(int sno, String name, String city, double cgp) {
			super();
			this.sno = sno;
			this.name = name;
			this.city = city;
			this.cgp = cgp;
		}
		@Override
		public String toString() {
			return "Studentt [sno=" + sno + ", name=" + name + ", city=" + city + ", cgp=" + cgp + "]";
		}
		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}
		

	}



