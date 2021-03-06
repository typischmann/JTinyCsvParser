package de.bytefish.jtinycsvparser.utils;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by philipp on 1/7/2016.
 */
public class StringUtilsTest {

    @Test
    public void testIsNullOrWhiteSpace() throws Exception {
        Assert.assertTrue(StringUtils.isNullOrWhiteSpace(null));
        Assert.assertTrue(StringUtils.isNullOrWhiteSpace(""));
        Assert.assertTrue(StringUtils.isNullOrWhiteSpace(" "));

        Assert.assertFalse(StringUtils.isNullOrWhiteSpace("a"));
    }
}