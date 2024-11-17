package programs;

//Custom Exception for invalid country,  invalid employee name,   non-eligibility of tax
class CountryNotValidException extends Exception {
	public CountryNotValidException(String message) {
		super(message);
	}
}

class EmployeeNameInvalidException extends Exception {
	public EmployeeNameInvalidException(String message) {
		super(message);
	}
}

class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(String message) {
		super(message);
	}
}

// Main Class to calculate tax
public class TaxCalculator {

	// Method to calculate the tax based on employee details
	public double calculateTax(String empName, boolean isIndian, double empSal)
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

		// Check if employee name is valid
		if (empName == null || empName.trim().isEmpty()) {
			throw new EmployeeNameInvalidException("The employee name cannot be empty.");
		}

		// Check if employee is Indian
		if (!isIndian) {
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		}

		// Calculate tax based on salary
		if (empSal > 100000) {
			return empSal * 8 / 100; // 8% tax for salary above 1 lakh
		} else if (empSal >= 50000 && empSal <= 100000) {
			return empSal * 6 / 100; // 6% tax for salary between 50k and 1 lakh
		} else if (empSal >= 30000 && empSal < 50000) {
			return empSal * 5 / 100; // 5% tax for salary between 30k and 50k
		} else if (empSal >= 10000 && empSal < 30000) {
			return empSal * 4 / 100; // 4% tax for salary between 10k and 30k
		} else {
			throw new TaxNotEligibleException("The employee does not need to pay tax.");
		}
	}

	public static void main(String[] args) {
		// Create an instance of TaxCalculator
		TaxCalculator taxCalculator = new TaxCalculator();

		// Test Case 1: Employee Ron, Salary 34000, Non-Indian
		try {
			System.out.println("Test Case 1:");
			System.out.println("Tax amount is: " + taxCalculator.calculateTax("Ron", false, 34000));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Test Case 2: Employee Tim, Salary 1000, Indian
		try {
			System.out.println("Test Case 2:");
			System.out.println("Tax amount is: " + taxCalculator.calculateTax("Tim", true, 1000));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Test Case 3: Employee Jack, Salary 55000, Indian
		try {
			System.out.println("Test Case 3:");
			System.out.println("Tax amount is: " + taxCalculator.calculateTax("Jack", true, 55000));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// Test Case 4: Employee with no name, Salary 30000, Indian
		try {
			System.out.println("Test Case 4:");
			System.out.println("Tax amount is: " + taxCalculator.calculateTax("", true, 30000));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
