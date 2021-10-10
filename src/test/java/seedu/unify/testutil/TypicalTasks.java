package seedu.unify.testutil;

import static seedu.unify.logic.commands.CommandTestUtil.VALID_DATE_AMY;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_DATE_BOB;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_TIME_AMY;
import static seedu.unify.logic.commands.CommandTestUtil.VALID_TIME_BOB;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.unify.model.UniFy;
import seedu.unify.model.task.Task;

/**
 * A utility class containing a list of {@code Task} objects to be used in tests.
 */
public class TypicalTasks {

    public static final Task ALICE = new TaskBuilder().withName("Alice Pauline")
            .withDate("2021-12-11").withEmail("alice@example.com")
            .withTime("12:45")
            .withTags("friends").build();
    public static final Task BENSON = new TaskBuilder().withName("Benson Meier")
            .withDate("2021-11-23")
            .withEmail("johnd@example.com").withTime("23:41")
            .withTags("owesMoney", "friends").build();
    public static final Task CARL = new TaskBuilder().withName("Carl Kurz").withTime("23:41")
            .withEmail("heinz@example.com").withDate("2021-10-25").build();
    public static final Task DANIEL = new TaskBuilder().withName("Daniel Meier").withTime("07:24")
            .withEmail("cornelia@example.com").withDate("2021-12-11").withTags("friends").build();
    public static final Task ELLE = new TaskBuilder().withName("Elle Meyer").withTime("12:33")
            .withEmail("werner@example.com").withDate("2021-12-25").build();
    public static final Task FIONA = new TaskBuilder().withName("Fiona Kunz").withTime("03:40")
            .withEmail("lydia@example.com").withDate("2021-12-23").build();
    public static final Task GEORGE = new TaskBuilder().withName("George Best").withTime("13:44")
            .withEmail("anna@example.com").withDate("2021-10-25").build();

    // Manually added
    public static final Task HOON = new TaskBuilder().withName("Hoon Meier").withTime("11:22")
            .withEmail("stefan@example.com").withDate("2021-10-25").build();
    public static final Task IDA = new TaskBuilder().withName("Ida Mueller").withTime("23:59")
            .withEmail("hans@example.com").withDate("2022-01-15").build();

    // Manually added - Task's details found in {@code CommandTestUtil}
    public static final Task AMY = new TaskBuilder().withName(VALID_NAME_AMY).withTime(VALID_TIME_AMY)
            .withEmail(VALID_EMAIL_AMY).withDate(VALID_DATE_AMY).withTags(VALID_TAG_FRIEND).build();
    public static final Task BOB = new TaskBuilder().withName(VALID_NAME_BOB).withTime(VALID_TIME_BOB)
            .withEmail(VALID_EMAIL_BOB).withDate(VALID_DATE_BOB).withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalTasks() {} // prevents instantiation

    /**
     * Returns an {@code DateBook} with all the typical tasks.
     */
    public static UniFy getTypicalAddressBook() {
        UniFy ab = new UniFy();
        for (Task task : getTypicalTasks()) {
            ab.addTask(task);
        }
        return ab;
    }

    public static List<Task> getTypicalTasks() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
