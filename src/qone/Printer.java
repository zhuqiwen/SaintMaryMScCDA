package qone;

public class Printer {

    private int min;
    private int max;
    private int interval;
    private String info;
    private char ch;

    public Printer(int min, int max, int interval, String info, char ch){
        this.min = min;
        this.max = max;
        this.interval = interval;
        this.info = info;
        this.ch = ch;
    }

    public String buildLines(){
        StringBuilder sb = new StringBuilder();
        for (int i = this.min; i <= this.max; i = i + this.interval){
            sb.append(buildOneLine(i));
        }

        return sb.toString();
    }

    private String buildOneLine(int num_stars){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num_stars; i++){
            sb.append(this.ch);
        }
        sb.append('(');
        sb.append(num_stars);
        sb.append(' ');
        sb.append(this.info);
        sb.append(')');
        sb.append('\n');


        return sb.toString();
    }

}