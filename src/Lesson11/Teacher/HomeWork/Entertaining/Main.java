package Lesson11.Teacher.HomeWork.Entertaining;

public class Main {
        public static void main(String[] args) {
            Trainer trainer = new Trainer();

            Animal lion = new Animal("Şir", "məməli", 5,"Kükrəyir");
            lion.displayİnfo();
            lion.makeSound();
            trainer.teachTrick("Hücum mövqeyi tutmaq, yerə uzanmaq", lion);

            Animal elephant = new Animal("Fil", "məməli", 10,"Kükrəyir");
            elephant.displayİnfo();
            elephant.makeSound();
            trainer.teachTrick("Xortumu qaldırmaq, dayanmaq, su içmək", elephant);

            Animal bear = new Animal("Ayı", "məməli", 8, "Xırıldayır və kükrəyir");
            bear.displayİnfo();
            bear.makeSound();
            trainer.teachTrick("Yumruq vurmaq, üzgüçülük", bear);

            Animal owl = new Animal("Bayquş", "Yırtıcı quş", 4, "Ulayır və qışqırır");
            owl.displayİnfo();
            owl.makeSound();
            trainer.teachTrick("Qanad çırpmaq, ququqlamaq, yüksək uçmaq", owl);

            Animal camel = new Animal("Dəvə", "Kamelus", 7, "Xomurdanır");
            camel.displayİnfo();
            camel.makeSound();
            trainer.teachTrick("Kürəyini yerə əymək, kürəyində yük daşımaq, sürətli qaçış", camel);

            Animal monkey = new Animal("Meymun", "Primatların məməlilərindən", 20, "Danışır və qışqırır.");
            monkey.displayİnfo();
            monkey.makeSound();
            trainer.teachTrick("Ağacda yellənmək, banan yemək, zarafat etmək", monkey);


            Feeder feeder = new Feeder();
            feeder.prepareMeal("Ət", lion);

            System.out.println("Zooparkı neçə nəfər ziyarət etdi: " + Animal.getTotalVisitors());







        }
}
