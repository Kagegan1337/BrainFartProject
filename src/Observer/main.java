package Observer;

public class main {

    public static void main(String[] args){
        Observable21 controller = new Observable21();
        Oberser21 clo = new Oberser21();
        controller.regObserver(clo);
        controller.changeOutput("FOO");
        controller.changeOutput("BAR");
        controller.changeOutput("YOO");

    }
}
