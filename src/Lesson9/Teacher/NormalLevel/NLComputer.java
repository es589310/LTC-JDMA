package Lesson9.Teacher.NormalLevel;

public class NLComputer {
    String model;
    String color;
    String coreVersion;

    NLSSD ssdCount;
    NLRAM ramCount;

    @Override
    public String toString() {
        return "NLComputer{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", coreVersion='" + coreVersion + '\'' +
                ", ssdCount=" + ssdCount +
                ", ramCount=" + ramCount +
                '}';
    }
}
