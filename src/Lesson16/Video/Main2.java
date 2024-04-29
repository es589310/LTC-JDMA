package Lesson16.Video;

public class Main2 {
    public static void main(String[] args) throws UserNotFoundException {

        //Custom Exception
        String name = "Robin";

        if (!name.equals("Barney")) {
            throw new UserNotFoundException("Istifadechi tapilmadi");
        }//UserNotFoundException kimi yeni bir exception yaratdıq və ona dəyər verdik







        //Throw not Throws
        //Throw ona görədirki biz özümüz exception muzu ataq
        int a = 45;
        int b = 0;

        if (b == 0) {
            throw new ArithmeticException("b=0 ola bilmez");
        }
    }
}
