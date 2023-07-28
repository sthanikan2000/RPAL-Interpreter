import Engine.Evaluvator;

public class rpal20 {
    
    public static void main(String[] args) {  
        String fn;
        boolean isPrintAST=false,isPrintST=false; 
        if(args.length==0){
            fn = "t1.txt"; 
            isPrintAST = true;
            isPrintST = true;
            System.out.println(Evaluvator.evaluvate(fn,isPrintAST,isPrintST));                                   // get and print the answer

        }
        else if(args.length==3 && args[0].equalsIgnoreCase("-ast") && args[1].equalsIgnoreCase("-st")){
            fn = args[2];
            isPrintAST=true;
            isPrintST=true;
        }
        else if(args.length==2){
            fn=args[1];
            if(args[0].equalsIgnoreCase("-ast")){
                isPrintAST=true;
            }
            else if(args[0].equalsIgnoreCase("-st")){
                isPrintST=true;
            }
            else{
                System.out.println("Invalid Arguments Passing!");
                return;
            }
        }
        else if(args.length==1){
            fn = args[0];
        }
        else{
            System.out.println("Invalid Arguments Passing!");
            return;
        }

                                                                 
    }
}
