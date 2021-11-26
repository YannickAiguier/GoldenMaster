package com.adaptionsoft.games.trivia;


import com.adaptionsoft.games.trivia.runner.GameRunner;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeTest {

    @Test
    public void golden_master_test() throws Exception {
        ByteArrayOutputStream mainOutput = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(mainOutput);
        GameRunner.run(out, new Random(6));
        Approvals.verify(mainOutput.toString());
    }
}
