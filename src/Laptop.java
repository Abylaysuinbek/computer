public class Laptop extends Camputer {
    private String battarey;
    private String camera;
    public void setCamera(String camera){
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }
    private String name;
    public void setName(String name){
        this.name = name;
    }


    public String getName() {
        return name;

    }

    public Laptop(String monitor, String keyboard, String mouse){
       super(monitor,keyboard,mouse);
    }
   // Laptop laptop = new Laptop("LED","ABS","tachpad");
    public void setBattarey(String battarey){
        this.battarey = battarey;
    }
    public String getBattarey(){
        return this.battarey;
    }
    public String typC(String value){
        return "";
    }
    public String typC(int value){
        return "";
    }


}
