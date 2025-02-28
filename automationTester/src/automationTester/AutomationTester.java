package automationTester;

import java.util.List;

public class AutomationTester {
    public static void main(String[] args) {
        final String candidateName = "John Hickey";
        final String role = "Automation Tester Extraordinaire";

        introduceCandidate(candidateName, role);

        List<String> skills = List.of(
                "Selenium WebDriver", "Java", "JUnit", "SQL", "CI/CD", "JMeter", "SoapUI",
                "AWS", "Katalon", "Problem Solving", "macOS", "Microsoft Windows",
                "Microsoft Office Suite", "UNIX Server", "Git", "CodeCommit", "Agile Methodology"
        );

        displaySkills(skills);

        System.out.println("Thanks for stopping by, I would love an opportunity to meet you!");

        verifyCandidateData(candidateName, skills);
    }

    private static void introduceCandidate(String name, String role) {
        System.out.printf("Hi, I'm %s, an %s who can turn coffee into code and bugs into features!%n", name, role);
    }

    private static void displaySkills(List<String> skills) {
        System.out.println("My toolkit includes (but is not limited to):");
        skills.forEach(skill -> System.out.println("- " + skill));
    }

    private static void verifyCandidateData(String name, List<String> skills) {
        assert name != null && !name.isEmpty() : "Candidate name is missing!";
        assert skills != null && !skills.isEmpty() : "Skills list is empty!";
    }
}
