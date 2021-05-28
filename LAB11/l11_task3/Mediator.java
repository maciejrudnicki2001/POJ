package pjatk.l11_task3;

public class Mediator {

    private AfterRevPanel afterRevPanel;
    private InputPanel inputPanel;

    public void register(AfterRevPanel afterRevPanel){
        this.afterRevPanel = afterRevPanel;
    }
    public void register(InputPanel inputPanel){
        this.inputPanel = inputPanel;
    }

    public void setAnswer(String c){
        this.afterRevPanel.setAnswer(c);
    }
}
