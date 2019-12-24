
	package com.hcl.day4;

	public class Employ {

		int empno;
		String name;
		String job;
		double salary;
		int leaveAvail;
		
		public Employ() {
			
		}
		public void assignLeave(Employ[] arr) {
			for (Employ employ : arr) {
				if(employ.job.equals("Manager")) {
					employ.leaveAvail=30;
				} else {
					employ.leaveAvail=20;
				}
			}
		}
		
		public Employ(int empno, String name, String job, double salary) {
			super();
			this.empno = empno;
			this.name = name;
			this.job = job;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employ [empno=" + empno + ", name=" + name + ", job=" + job
					+ ", salary=" + salary + ", leaveAvail=" + leaveAvail + "]";
		}
		
		
	}

