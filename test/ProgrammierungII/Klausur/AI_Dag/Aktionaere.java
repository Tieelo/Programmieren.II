package ProgrammierungII.Klausur.AI_Dag;

public abstract class Aktionaere {
    Information information;
    SchlechteInfos schlechteInfos;

    public abstract void display();

    public void performInformation() {
        information.info();
    }
    
    public void performSchlechteInfos() {
        schlechteInfos.fluchen();
    }

    public void setInformation(Information information) {
        this.information = information;
    }

    public void setSchlechteInfos(SchlechteInfos schlechteInfos) {
        this.schlechteInfos = schlechteInfos;
    }
}
