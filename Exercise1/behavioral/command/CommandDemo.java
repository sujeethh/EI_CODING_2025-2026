package behavioral.command;
import java.util.*;import java.util.logging.*;
interface Command{void execute();}
class Light{private boolean on=false;private static final Logger LOG=Logger.getLogger(Light.class.getName());public void on(){on=true;LOG.info("Light ON");}public void off(){on=false;LOG.info("Light OFF");}}
class LightOnCommand implements Command{private final Light light;public LightOnCommand(Light l){this.light=l;}public void execute(){light.on();}}
class LightOffCommand implements Command{private final Light light;public LightOffCommand(Light l){this.light=l;}public void execute(){light.off();}}
class RemoteControl{private final Map<String,Command> buttons=new HashMap<>();public void setCommand(String n,Command c){buttons.put(n,c);}public void press(String n){Command c=buttons.get(n);if(c!=null)c.execute();else Logger.getLogger(RemoteControl.class.getName()).warning("No command");}}
public class CommandDemo {public static void run(){Light l=new Light();RemoteControl rc=new RemoteControl();rc.setCommand("ON",new LightOnCommand(l));rc.setCommand("OFF",new LightOffCommand(l));rc.press("ON");rc.press("OFF");}}
