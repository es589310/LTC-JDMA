package Lesson9.NormalLevel;

public class NLMain {
    public static void main(String[] args) {
        NLRAM ramProporties = new NLRAM();
        ramProporties.ramMemory = 32;
        ramProporties.ramModel = "Corsair Dominator Platinum 32 GB";
        ramProporties.ramDDR = "DDR4";

        NLSSD ssdProporties = new NLSSD();
        ssdProporties.ssdMemory = 512;
        ssdProporties.ssdModel = "SanDisk";
        ssdProporties.ssdDDR = "DDR4";

        NLComputer generalComputer = new NLComputer();
        generalComputer.model = "HP";
        generalComputer.coreVersion = "İ9 13900HX ";
        generalComputer.color = "black";

        generalComputer.ssdCount = ssdProporties;
        generalComputer.ramCount = ramProporties;

        System.out.println(generalComputer);
    }
}
