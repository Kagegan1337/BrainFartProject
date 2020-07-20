package CLI_parser;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.ParseException;

public class ParserMain {

    public static void main(String[] args){
        CommandLineInterface options = new CommandLineInterface();
        CommandLineParser parser = new DefaultParser();

        try {
           CommandLine cmd = parser.parse(options.options,args);
           if(cmd.hasOption("n")){
               System.out.println(cmd.getOptionValue("n"));
           }
           if(cmd.hasOption("m")){
               String arg = cmd.getOptionValue("m");
               System.out.println(Integer.parseInt(arg) * 5);
           }
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
