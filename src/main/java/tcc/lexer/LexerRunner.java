/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tcc.lexer;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import tcc.lexer.analyzer.*;

public class LexerRunner {

    private static final Logger log = LogManager.getLogger(LexerRunner.class);

    private static final String INPUT_FILE_PATH = "src/main/java/tcc/lexer/inputs/code.mp";

    public static void main(String[] args) {
        try {
            log.info("Starting Lexer");

            minipascal minipascalLexer;

            minipascalLexer = new minipascal(CharStreams.fromFileName(INPUT_FILE_PATH));

            while (minipascalLexer.nextToken().getType() != Token.EOF){
                String token = minipascal.VOCABULARY.getDisplayName(minipascalLexer.getType());
                String lexeme = minipascalLexer.getText();

                log.info("Token found: "+ token +" | Lexeme: " + lexeme);
            }

            log.info("Program compiled successful!");

        } catch (Exception e){
            log.error("Something went wrong: " + e.getMessage());
        }
    }
}
