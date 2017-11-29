package qone;

import java.util.Scanner;

public class Printer {

    private int min;
    private int max;
    private int interval;
    private String info;
    private char ch;

    private Printer(JobBuilder jobBuilder){
        this.min = jobBuilder.min;
        this.max = jobBuilder.max;
        this.interval = jobBuilder.interval;
        this.info = jobBuilder.info;
        this.ch = jobBuilder.ch;
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



    public static class JobBuilder{
		private int min;
		private int max;
		private int interval;
		private String info;
		private char ch;
		private Scanner sc;

		public JobBuilder(){
			this.min = 0;
			this.max = 0;
			this.interval = 0;
			this.info = "";
			this.ch = '*';
			this.sc = new Scanner(System.in);
		}

		public JobBuilder min(int min){
			this.min = min;
			return this;
		}

		public JobBuilder min(){
			System.out.println(Constants.ASK_FOR_MIN);
			this.min = sc.nextInt();
			return this;
		}

		public JobBuilder max(int max){
			this.max = max;
			return this;
		}

		public JobBuilder max(){
			System.out.println(Constants.ASK_FOR_MAX);
			this.max = sc.nextInt();
			return this;
		}

		public JobBuilder interval(int interval){
			this.interval = interval;
			return this;
		}

		public JobBuilder interval(){
			System.out.println(Constants.ASK_FOR_INTERVAL);
			this.interval = sc.nextInt();
			return this;
		}


		public JobBuilder info(String info){
			this.info = info;
			return this;
		}

		public JobBuilder info(){
			System.out.println(Constants.ASK_FOR_INFO);
			this.info = sc.next();
			return this;
		}

		public JobBuilder character(char ch){
			this.ch = ch;
			return this;
		}

		public JobBuilder character(){
			System.out.println(Constants.ASK_FOR_CHARACTER);
			this.ch = sc.next().charAt(0);
			return this;
		}

		public Printer build(){
			return new Printer(this);
		}
	}

}