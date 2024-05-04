package Lesson20.Teacher.HomeWork;

public class Pair <MAN, WOMAN>{

    MAN featuresM;
    WOMAN featuresW;

    public Pair(MAN featuresM, WOMAN featuresW) {
        this.featuresM = featuresM;
        this.featuresW = featuresW;
    }

    public MAN getFeaturesM() {
        return featuresM;
    }

    public void setFeaturesM(MAN featuresM) {
        this.featuresM = featuresM;
    }

    public WOMAN getFeaturesW() {
        return featuresW;
    }

    public void setFeaturesW(WOMAN featuresW) {
        this.featuresW = featuresW;
    }
}
