package org.veju.malachy;

public class PaySalary {
    public static String payNetSalary(Staff staff){
        double grossSalary = staff.getGrossSalary();
        double totalDeduction = grossSalary*Staff.tax;
        double netSalary = grossSalary-totalDeduction;
        return String.format("{%s your salary is %s}",staff.getLastName(),netSalary);
    }
}
