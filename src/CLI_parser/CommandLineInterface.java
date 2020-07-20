package CLI_parser;

import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class CommandLineInterface {

    Options options;

    public CommandLineInterface(){
        createOptions();
    }

    private void createOptions(){
        options = new Options();
        options.addOption(new Option("f","fun",false,"print some fun on command line"));
        options.addOption(new Option("n","name", true,"print a name on command line"));
        options.addOption(new Option("m","multiply",true,"multiply a value with 5"));
    }
}
