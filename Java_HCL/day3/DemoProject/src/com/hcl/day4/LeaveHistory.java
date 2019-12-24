package com.hcl.day4;

public class LeaveHistory {

		int empno;
		int leaveTaken;
		LeaveType leaveType;
		LeaveStatus leaveStatus;
		public LeaveHistory(int empno, int leaveTaken, LeaveType leaveType) {
			super();
			this.empno = empno;
			this.leaveTaken = leaveTaken;
			this.leaveType = leaveType;
		}
		
		
		
		public LeaveHistory() {
			super();
			// TODO Auto-generated constructor stub
		}



		@Override
		public String toString() {
			return "LeaveHistory [empno=" + empno + ", leaveTaken=" + leaveTaken
					+ ", leaveType=" + leaveType + ", leaveStatus=" + leaveStatus
					+ "]";
		}



		public void applyLeave(Employ[] arr, LeaveHistory leave) {
			for (Employ employ : arr) {
				if(employ.empno==leave.empno) {
					if(employ.job.equals("Manager")) {
						leave.leaveStatus=LeaveStatus.APPROVED;
					} else {
						leave.leaveStatus=LeaveStatus.PENDING;
					}
				}
			}
		}
	}


}
