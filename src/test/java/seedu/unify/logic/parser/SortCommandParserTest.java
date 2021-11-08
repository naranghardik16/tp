package seedu.unify.logic.parser;

import static seedu.unify.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.unify.logic.parser.CommandParserTestUtil.assertParseFailure;
import org.junit.jupiter.api.Test;
import seedu.unify.logic.commands.SortCommand;


public class SortCommandParserTest {


    private static final String MESSAGE_INVALID_FORMAT =
        String.format(MESSAGE_INVALID_COMMAND_FORMAT, SortCommand.MESSAGE_USAGE);


    private SortCommandParser parser = new SortCommandParser();

    @Test
    public void parse_invalidPreamble_failure() {

        // invalid arguments being parsed as preamble
        assertParseFailure(parser, "sort timing", MESSAGE_INVALID_FORMAT);

        // invalid prefix being parse as preamble
        assertParseFailure(parser, "sort time", MESSAGE_INVALID_FORMAT);
    }
}