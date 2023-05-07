public class Camputer {
    private String monitor;
    public String getMonitor(){
        return monitor;
    }
    public void setMonitor(String monitor) {
       this.monitor = monitor;
    }
    private String keyboard;
    public String getKeyboard(){
        return keyboard;
    }
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
    private String mouse;
    public String getMouse(){
        return mouse;
    }
    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
    public Camputer(){

    }
    public Camputer(String monitor, String keyboard, String mouse){
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;

    }

}
