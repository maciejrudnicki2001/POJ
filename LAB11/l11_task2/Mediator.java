package pjatk.l11_task2;

public class Mediator {

    private AnswerPanel answerPanel;
    private GuessPanel guessPanel;

    public void register(AnswerPanel answerPanel){
        this.answerPanel = answerPanel;
    }
    public void register(GuessPanel guessPanel){
        this.guessPanel = guessPanel;
    }

    public void makeAnswer(String c){
        this.answerPanel.setAnswer(c);
    }
}
