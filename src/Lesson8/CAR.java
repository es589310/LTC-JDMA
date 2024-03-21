package Lesson8;

public class CAR {


        public String text(){
            String text = "Oyan ey Günəş";
            int counttext = textcount();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < counttext; i++) {
                result.append(text);
            }
            return  result.toString();
        }
        public int textcount(){
            int a = 5;
            return a;
        }
}


//    public void CARbrend(){
//        System.out.println("Brand: " + this.brand + " Model: " + this.model + " Year: " + this.year + "\n");
//    }
//    public int intNumber(int num1, int num2){
//        int sum = num1 + num2;
//        return sum;


//    int a = 5;
//    boolean b = true;
//    char c = 'A';
//    double f = 5.4;