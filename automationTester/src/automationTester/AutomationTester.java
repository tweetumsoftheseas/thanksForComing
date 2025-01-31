package automationTester;

public class AutomationTester {
	public static void main(String[] args) {
			String candidateName = "John Hickey";
			String role = "Automation Tester Extraordinaire";
			System.out.println("Hi, I'm " + candidateName + ", an " + role + " who can turn coffee into code and bugs into features!");
			String[] skills = {"Selenium WebDriver", "Java", "JUnit", "SQL", "CI/CD", "JMeter", "SoapUI", "AWS", "Katalon", "Problem Solving", "macOS", "Microsoft Windows", "Microsoft Office Suite", "UNIX Server", "Git", "CodeCommit", "Agile Methodology"};
			System.out.println("My toolkit includes (but is not limited to):");
			for(String skill : skills) {
			System.out.println("- " + skill);
			}
			System.out.println("Thanks for stopping by, I would love an opportunity to meet you!");
			// Verification
			assert candidateName != null && ! candidateName.isEmpty(): "Candidate name is missing!";
			assert skills.length > 0: "Skills list is empty!";
	}
}
