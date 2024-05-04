package Lesson19.Mentor.Exercises;

public class InputValidator {
    public boolean validateNumberInput(String inputPerson){
        return inputPerson.matches("-?\\d+(\\.\\d+)?");
    }
    public boolean validateTextInput(String inputPerson){
        return inputPerson.matches("[a-zA-Z]+");

    }
    public boolean validateSpecialCharacterInput(String inputPerson){
        return inputPerson.matches("[^a-zA-Z0-9 ]");
    }


    InputCategory categoriInput(String inputPerson){


        if (validateNumberInput(inputPerson)) {
            return InputCategory.NUMBER;
        } else if (validateTextInput(inputPerson)) {
            return InputCategory.TEXT;
        } else if (validateSpecialCharacterInput(inputPerson)) {
            return InputCategory.SPECIAL_CHARACTER;
        } else {
            return null;
        }
    }

}
