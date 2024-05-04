package Lesson19.Mentor.HomeWork;

import java.util.Scanner;

public class CharacterTypesPerson {
    //İntrovert: Özləri ilə vaxt keçirməkdən zövq alan və kitab oxumaq, film izləmək, rəsm çəkmək, meditasiya etmək və
        // yazmaq kimi fəaliyyətlərdən həzz alan insanlar introvertdirlər.
    //Extravert: aşırı sosyal
    //Ambivert: sosyallaşmaqdan zövq alır, ancaq işinə fokslanmaq üçün bunu vaxt ayırıb proqram daxilində edir
    //Omnivert: həm sosyallığı sevir, həmdə yalnız qalmağı, çox vaxt qərarsızdır
    public static void main(String[] args) {
        System.out.println("Siz 'Xarakter Tipi' oyunundasınız! Xarakter tipinizi bilmək üçün, sualları cavablandırın.");

        String[] questions = {
                "Bir tədbirdə iştirak etmək sizi sevindirirmi? (bəli/xeyr)",
                "Tək vaxt keçirməyi sevirsiz? (bəli/xeyr)",
                "Cəmiyyət içində və ya tək qaldığınız zaman rahatsınızmı? (bəli/xeyr)",
                "Həm yeni insanlarla tanışmağı hem də bildiyiniz insanlarla vaxt keçirməyi sevirsiz? (bəli/xeyr)"
        };
        String[] answers = new String[questions.length];

        for (int i = 0; i < questions.length; i++) {
            answers[i] = askQuestion(questions[i]);
        }
        CharacterType characterType = answerCharacterType(answers);
        System.out.println("\nSizin xarakteriniz: " + characterType);
    }



    private static String askQuestion(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.nextLine().trim().toLowerCase();
    }

    private static CharacterType answerCharacterType(String[] answers) {
        boolean isExtroverted = answers[0].equals("bəli");
        boolean isIntroverted = answers[1].equals("bəli");
        boolean isAmbiverted = answers[2].equals("bəli");
        boolean isOmniverted = answers[3].equals("bəli");

        // isExtroverted = pozitiv
        // INTROVERT = neqativ

        if (isExtroverted && !isIntroverted && !isAmbiverted && !isOmniverted) {
            System.out.println("Aşırı sosyal insansınız");
            return CharacterType.EXTROVERTED;
        } else if (!isExtroverted && isIntroverted && !isAmbiverted && !isOmniverted) {
            System.out.println("Özünüz ilə vaxt keçirməkdən zövq alırsınız ");
            return CharacterType.INTROVERTED;
        } else if (isAmbiverted && !isIntroverted && !isExtroverted && !isOmniverted) {
            System.out.println("Sosyallaşmaqdan zövq alırsınız, ancaq işinizə fokslanmaq üçün bunu vaxt ayırıb proqram daxilində edirsiniz");
            return CharacterType.AMBIVERTED;
        } else {
            System.out.println("Həm sosyallaşmağı sevirsiniz, həmdə yalnız qalmağı, çox vaxt qərarsızsınız");
            return CharacterType.OMNIVERTED; //
        }
    }

}
