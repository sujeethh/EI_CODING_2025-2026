package structural.decorator;
interface Notifier{void send(String m);}class BaseNotifier implements Notifier{public void send(String m){System.out.println("Send: "+m);}}
class NotifierDecorator implements Notifier{protected final Notifier wrap;public NotifierDecorator(Notifier n){this.wrap=n;}public void send(String m){wrap.send(m);}}
class SMSDecorator extends NotifierDecorator{public SMSDecorator(Notifier n){super(n);}public void send(String m){super.send(m);System.out.println("Also SMS: "+m);}}
public class DecoratorDemo{public static void run(){Notifier n=new SMSDecorator(new BaseNotifier());n.send("Hello");}}
