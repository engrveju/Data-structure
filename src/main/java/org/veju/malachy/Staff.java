package org.veju.malachy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Staff {
    public static final double tax = 0.1;
    public static final double pension = 0.5;
    private String lastName;
    private double grossSalary;

    public static void main(String[] args) {
//        Thomas.
        Staff staff1 = new Staff("Omeje",100);
        Staff staff2 = new Staff("Ekene",110);
        Staff staff3 = new Staff("Ojukwu",90);

        System.out.println(PaySalary.payNetSalary(staff1));
        System.out.println(PaySalary.payNetSalary(staff2));
        System.out.println(PaySalary.payNetSalary(staff3));
    }
}

