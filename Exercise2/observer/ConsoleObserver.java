package observer;
import model.Task;public class ConsoleObserver implements TaskConflictObserver{public void onConflict(Task n,Task c){System.out.println("ERROR: '"+n.getDescription()+"' conflicts with '"+c.getDescription()+"'.");}}
