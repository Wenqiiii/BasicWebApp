package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("WWW"));
    }
    @Test
    public void ninepluseighteen() throws Exception {
        assertThat(queryProcessor.process("what is 9 plus 18"), containsString("27"));
    }
    @Test
    public void elvplusnineteen() throws Exception {
        assertThat(queryProcessor.process("what is 11 plus 19"), containsString("30"));
    }
    @Test
    public void largestNum() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 606, 64"), containsString("606"));
    }
    @Test
    public void thirteenPluselev() throws Exception {
        assertThat(queryProcessor.process("which is 13 plus 11"), containsString("24"));
    }
}
