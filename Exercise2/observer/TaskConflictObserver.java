package observer;
import model.Task;public interface TaskConflictObserver{void onConflict(Task newTask,Task conflict);}
