package testSmell;

import java.io.File;

public class Main {

	public static void main(String[] args) 
	{
		String src = "E:\\Math-Fun";
		//String src = "E:\\EquationSolverTest-master";
		AssertionRouletteFinder arf = new AssertionRouletteFinder();
		File source = new File(src);
        arf.searchMethods(source);
	}

}
