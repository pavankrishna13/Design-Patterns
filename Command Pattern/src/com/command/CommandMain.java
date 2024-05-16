package com.command;

public class CommandMain {

	public static void main(String[] args) {
		Accumulator accum = new Accumulator();
		Command cmd1 = new AddCommand(accum, "addOneValue", new Integer[] {23});
		Command cmd2 = new AddCommand(accum, "addTwoValues", new Integer[] { 100, 200});
		invoke(cmd1);
		invoke(cmd2);
		System.out.println(accum.getVal());
	}
	
	static void invoke(Command cmd) {
		cmd.execute();
	}

}
