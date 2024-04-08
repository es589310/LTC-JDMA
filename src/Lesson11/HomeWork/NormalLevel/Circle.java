package Lesson11.HomeWork.NormalLevel;

public class Circle {
        double radius;

        public Circle(double radius)
        {
            this.radius = radius;
        }

        public double calculateArea() {
            return Math.PI * radius * radius;
            //Math.PI = 3.14 metodu
        }

        public static void main(String[] args) {
            Circle circle = new Circle(5);
                double area = (int)circle.calculateArea();
            System.out.println("Dairənin sahəsi: " + area);
        }
    }


/*
    Yarıçap için bir örnek değişkeni olan bir Java sınıfı "Circle"
    tanımlayın. Çemberin alanını hesaplayan ve döndüren bir yöntem
    yazın. Yarıçapı 5 birim olan bir "Çember" nesnesi oluşturun ve
    alanını görüntüleyin.
 */
