package factory;
import model.Task;import java.time.*;import java.util.*;
public class TaskFactory{public static Task create(String d,String s,String e,String p){LocalTime st=LocalTime.parse(s);LocalTime en=LocalTime.parse(e);Task.Priority pr=Task.Priority.valueOf(p.toUpperCase());return new Task(UUID.randomUUID().toString(),d,st,en,pr);}}
