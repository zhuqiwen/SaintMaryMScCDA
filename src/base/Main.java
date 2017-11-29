//Write a program that prints out lines of asterisks, based on the values determined by the user-input.
// The program first asks for the minimum number of asterisks, the maximum number of asterisks, and the
//        interval.
// It then prints lines of asterisks, starting with a line with the minimum number of asterisks, and
//        ending with a line with the maximum number of asterisks.
// The increment of the numbers of asterisks is
//        specified by the interval value. At the end of each line, it should also print how many stars are printed.

package base;
import qone.Printer;

public class Main {

    public static void main(String[] args) {
	// write your code here


		/**
		 * Question 1
		 */

        Printer p = new Printer.JobBuilder()
				.min(3).max(15).interval(3)
				.info("sharps").character('#')
				.build();
        System.out.println(p.buildLines());


		for(int i = 0; i < 2; i++){
			p = new Printer.JobBuilder()
					.max().min().interval()
					.info().character()
					.build();
			System.out.println(p.buildLines());
		}


		/**
		 * Question 2
		 */



	}
}
