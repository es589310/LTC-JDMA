package Lesson9.Teacher.Video;

public class lesson9Car {
    String make;
    String model;
    int year;

    //bu yazdığımız və bura bağladığımız class-lar istinad nöqtələri olduğu üçün reference tipdi
    lesson9Engine engine; //engine tipinden engine elave etdik
    lesson9Wheel wheel;

    @Override
    public String toString() {
        return "lesson9Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                ", wheel=" + wheel +
                '}';
    }//lesson9Car{make='Ferrari', model='F420', year=2022, engine=Lesson9.Teacher.Video.lesson9Engine@4a574795, wheel=Lesson9.Teacher.Video.lesson9Wheel@f6f4d33}
     //yenədə engine və vheel obyektini yaddaşdaki yer kimi göndərdi, səbəbi Wheel və Engine daxilində to String yoxdu
    //ikisindədə toString açırıq
    /* biz obyekti/obyektləri bu cür görməliyikki errorları tapa bilək
    lesson9Car{make='Ferrari', model='F420', year=2022,
     engine=lesson9Engine{name='V8', volume=6000.0, horsePower=500},
     wheel=lesson9Wheel{brand='Michelin', material='Rezin', size=18}}
    */
}

