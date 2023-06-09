package tool;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class GenerateAst {
    public static void main(String[] args) throws IOException{
        String outputDir = "../lox";
        defineAst(outputDir, "Expr", Arrays.asList(
        "Binary   : Expr left, Token operator, Expr right",
        "Grouping : Expr expression",
        "Literal  : Object value",
        "Unary    : Token operator, Expr right"
        ));
    }

    private static void defineAst(String outpuDir, String baseName, List<String> types) throws IOException{
        
    }
}
