package ua.javabegin.training.fastjava2.objects;

public class Phone {

    private  String name;
    private  String type;
    private  int ram;
    private int frontCam;
    private int diagonalScreen;

    public Phone() {
    }

    public Phone(int ram, String name, String type) {
        this.name = name;
        this.type = type;
        this.ram = ram;
    }

    public Phone(String name, String type, int ram, int frontCam, int diagonalScreen) {
        this.name = name;
        this.type = type;
        this.ram = ram;
        this.setFrontCam(frontCam);
        this.setDiagonalScreen(diagonalScreen);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getFrontCam() {
        return frontCam;
    }

    public void setFrontCam(int frontCam) {
        this.frontCam = frontCam;
    }

    public int getDiagonalScreen() {
        return diagonalScreen;
    }

    public void setDiagonalScreen(int diagonalScreen) {
        this.diagonalScreen = diagonalScreen;
    }
}
