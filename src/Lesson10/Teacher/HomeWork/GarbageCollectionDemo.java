package Lesson10.Teacher.HomeWork;
public class GarbageCollectionDemo {

    GarbageCLass object = new GarbageCLass();

    public GarbageCLass getObject() {
        object = null;
        return object;
    }
}

