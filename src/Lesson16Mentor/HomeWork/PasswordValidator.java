package Lesson16Mentor.HomeWork;

public class PasswordValidator {
public static void validatePassword(String password) throws InvalidPasswordException {


            if (password.length() < 8) {
                throw new InvalidPasswordException("Parol ən az 8 simvol uzunluğunda olmalıdır.");
            }


            if (!password.matches(".*[A-Z].*")) {
                throw new InvalidPasswordException("Parol ən az bir böyük hərf olmalıdır.");
            }


            if (!password.matches(".*[a-z].*")) {
                throw new InvalidPasswordException("Parol ən az bir balaca hərf olmalıdır.");
            }


            if (!password.matches(".*\\d.*")) {
                throw new InvalidPasswordException("Parol ən az bir rəqəm olmalıdır.");
            }

}





        public static void main(String[] args) {
            String password = "Parol8977";

            try {
                validatePassword(password);
                System.out.println("Parol doğrudur.");
            } catch (InvalidPasswordException e) {
                System.out.println("Yanlış parol: " + e.getMessage());
            }
        }




}




















