package chapter2.ch16;

    public class Employee {
    
        public static int serialNum = 1000;
    
        private int employeeId;
        private String employeeName;
        private String employeeDepartment;
    
        public int getEmployeeId() {
            return employeeId;
        }
        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }
    
        public String getEmployeeName() {
            return employeeName;
        }
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }
    
        public String getEmployeeDepartment() {
            return employeeDepartment;
        }
        public void setEmployeeDepartment(String employeeDepartment) {
            this.employeeDepartment = employeeDepartment;
        }
        
    }