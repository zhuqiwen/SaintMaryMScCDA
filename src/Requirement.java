import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Requirement {
    private String type;
    private String question;
    private int answer;

    public Requirement(){

    }

    public Requirement(String q, String t){
        this.question = q;
        this.answer = 0;
        this.type = t;
    }

    public Requirement(String q, String t, int a){
        this.question = q;
        this.answer = a;
        this.type = t;
    }

    public String getQuestion() {
        return this.question;
    }

    public int getAnswer(){
        return this.answer;
    }

    public String getType() {
        return this.type;
    }
}
