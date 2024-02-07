package utils;

import pages.AddEmployeePage;
import pages.DashBoardPage;
import pages.EmployeeSearchPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static DashBoardPage dashBoardPage;
   public static AddEmployeePage addEmployeePage;

   public static EmployeeSearchPage employeeSearchPage;
    public static void initializePageObjects(){
login=new LoginPage();
dashBoardPage=new DashBoardPage();
addEmployeePage=new AddEmployeePage();
employeeSearchPage=new EmployeeSearchPage();
    }
}
