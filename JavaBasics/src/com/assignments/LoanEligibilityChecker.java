package com.assignments;

import java.util.Scanner;

public class LoanEligibilityChecker {

    public static void main(String[] args) {

    	int creditScore = 720;
        double monthlyIncome = 60000;
        double existingEMI = 10000;

        // Calculate Debt-to-Income Ratio
        double dti = (existingEMI / monthlyIncome) * 100;

        System.out.println("\n--- Loan Eligibility Result ---");
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Monthly Income: ₹" + monthlyIncome);
        System.out.println("Existing EMI: ₹" + existingEMI);
        System.out.printf("Debt-to-Income Ratio: %.2f%%\n", dti);
        if (creditScore >= 750 && dti <= 40) {
            System.out.println("✅ Excellent credit score. Loan Approved with best interest rate.");
        } else if (creditScore >= 700 && dti <= 40) {
            System.out.println("✅ Good credit score. Loan Approved with standard interest rate.");
        } else if (creditScore >= 650 && dti <= 35) {
            System.out.println("⚠️ Fair credit score. Loan May Be Approved with higher interest or co-applicant.");
        } else {
            System.out.println("❌ Loan Rejected. Low credit score or high EMI burden.");
        }

        // Estimate eligible loan amount (basic rule: 15x net income if eligible)
        if (creditScore >= 650 && dti <= 40) {
            double estimatedLoan = monthlyIncome * 15;
            System.out.printf("Estimated eligible loan amount: ₹%.2f\n", estimatedLoan);
        }

    }
}

