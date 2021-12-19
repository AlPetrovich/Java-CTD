package singleton;

public class Logger {
    private static Logger instance;
    private String msj;
    private Logger(){

    }
    public static Logger getInstance(){
        if (instance==null){
            instance=new Logger();
        }
        return instance;
    }

    public static void setInstance(Logger instance) {
        Logger.instance = instance;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }
}
