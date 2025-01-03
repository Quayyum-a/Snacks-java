import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonalityTest {
    public static void main(String... args) {
        Scanner input = new Scanner(System.in);
        StringBuilder responses = new StringBuilder();
        List<String> selectedAnswers = new ArrayList<>();

        System.out.println("What is your full name? ");
        String name = input.nextLine();

        List<String> questions = List.of(
            "A. tough-minded, just\nB. tender-hearted, merciful",
            "A. candid, straightforward, frank\nB. tactful, kind, encouraging",
            "A. logical, analytical\nB. emotional, empathetic",
            "A. decisive, goal-oriented\nB. open-ended, flexible",
            "A. reserved, introverted\nB. outgoing, extroverted",
            "A. structured, organized\nB. spontaneous, carefree",
            "A. realistic, practical\nB. imaginative, creative",
            "A. focused on details\nB. big-picture thinker",
            "A. independent, self-reliant\nB. team-oriented, cooperative",
            "A. calm, level-headed\nB. passionate, energetic",
            "A. fact-based, factual\nB. possibility-based, speculative",
            "A. task-focused\nB. people-focused",
            "A. confident, assertive\nB. agreeable, accommodating",
            "A. like to plan ahead\nB. prefer to be spontaneous",
            "A. focused on logic\nB. focused on emotions",
            "A. direct and to the point\nB. diplomatic and considerate",
            "A. prefer routine\nB. enjoy variety",
            "A. prefer solitude\nB. enjoy being around people",
            "A. value consistency\nB. value flexibility",
            "A. practical and realistic\nB. imaginative and visionary"
        );

        System.out.println("Welcome to the MBTI Personality Test!");
        System.out.println("Please select 'A' or 'B' for each question.\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.printf("Question %d:\n%s\n", i + 1, questions.get(i));
            System.out.print("Enter your choice (A or B): ");
            char response = validateInput(input.nextLine(), input);
            responses.append(response);
				System.out.println();

            String answer = (response == 'A') ? questions.get(i).split("\n")[0] : questions.get(i).split("\n")[1];
            selectedAnswers.add(answer);
        }

        System.out.println("\nHello " + name + " you selected:");

        displayPersonalityBreakdown(responses.toString(), selectedAnswers);

        String personality = determinePersonality(responses.toString());
        System.out.println("\nYour MBTI Personality Type is: " + personality);
    }

    private static char validateInput(String input, Scanner sc) {
        while (input.isEmpty() || (input.charAt(0) != 'A' && input.charAt(0) != 'B')) {
            System.out.print("I know this is an error, Please try again: ");
            input = sc.nextLine();
        }
        return input.charAt(0);
    }

    private static String determinePersonality(String responses) {
        int introvert = 0, extrovert = 0;
        int sensing = 0, intuitive = 0;
        int thinker = 0, feeler = 0;
        int judging = 0, perceiving = 0;

        for (int count = 0; count < responses.length(); count++) {
            char answer = responses.charAt(count);
            switch (count) {
                case 0, 4, 8, 12, 16 -> {
                    if (answer == 'A') introvert++;
                    else extrovert++;
                }
                case 1, 5, 9, 13, 17 -> {
                    if (answer == 'A') sensing++;
                    else intuitive++;
                }
                case 2, 6, 10, 14, 18 -> {
                    if (answer == 'A') thinker++;
                    else feeler++;
                }
                case 3, 7, 11, 15, 19 -> {
                    if (answer == 'A') judging++;
                    else perceiving++;
                }
            }
        }

        String personality = "";
        personality += (introvert > extrovert) ? "I" : "E";
        personality += (sensing > intuitive) ? "S" : "N";
        personality += (thinker > feeler) ? "T" : "F";
        personality += (judging > perceiving) ? "J" : "P";

        return personality;
    }

    private static void displayPersonalityBreakdown(String responses, List<String> selectedAnswers) {
        List<String> introExtro = new ArrayList<>();
        List<String> sensingIntuition = new ArrayList<>();
        List<String> thinkingFeeling = new ArrayList<>();
        List<String> judgingPerceiving = new ArrayList<>();

        for (int count = 0; count < responses.length(); count++) {
            char answer = responses.charAt(count);
            switch (count) {
                case 0, 4, 8, 12, 16 -> introExtro.add(selectedAnswers.get(count));
                case 1, 5, 9, 13, 17 -> sensingIntuition.add(selectedAnswers.get(count));
                case 2, 6, 10, 14, 18 -> thinkingFeeling.add(selectedAnswers.get(count));
                case 3, 7, 11, 15, 19 -> judgingPerceiving.add(selectedAnswers.get(count));
            }
        }

        System.out.println("Introversion (I) vs Extroversion (E):");
        introExtro.forEach(System.out::println);
        displayChoiceCounts(introExtro);

        System.out.println("\nSensing (S) vs Intuition (N):");
        sensingIntuition.forEach(System.out::println);
        displayChoiceCounts(sensingIntuition);

        System.out.println("\nThinking (T) vs Feeling (F):");
        thinkingFeeling.forEach(System.out::println);
        displayChoiceCounts(thinkingFeeling);

        System.out.println("\nJudging (J) vs Perceiving (P):");
        judgingPerceiving.forEach(System.out::println);
        displayChoiceCounts(judgingPerceiving);
    }

    private static void displayChoiceCounts(List<String> answers) {
        long countA = answers.stream().filter(a -> a.startsWith("A")).count();
        long countB = answers.stream().filter(a -> a.startsWith("B")).count();
        System.out.println("Number of A selected: " + countA);
        System.out.println("Number of B selected: " + countB);
    }
}
