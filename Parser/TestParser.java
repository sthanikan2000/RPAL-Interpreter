package Parser;

import java.util.List;
import Exception.CustomException;
import lexical_analyzer.LexicalAnalyser;
import lexical_analyzer.Token;

public class TestParser {

	public static void main(String[] args) {
		String inputFileName = "t1.txt";
	      LexicalAnalyser scanner = new LexicalAnalyser(inputFileName);
	      List<Token> tokens;
	      List<Node> AST;   
			try {
				tokens = scanner.scan();
//				for (Token token : tokens) {
//		            System.out.println("<" + token.type + ", " + token.value + ">");
//		        }
				Parser parser = new Parser(tokens);
				AST=parser.parse();
				if(AST==null) return;
				// Print the generated tokens
		        
//				for (Node node : AST) {
//		            System.out.println("<" + node.type + ", " + node.value + ", " + node.noOfChildren+">");
//		        }
				
				List<String> stringAST = parser.convertAST_toStringAST();
				for (String string : stringAST) {
		            System.out.println(string);
		        }
			} catch (CustomException e) {
				System.out.println(e.getMessage());
			}

	}

}
