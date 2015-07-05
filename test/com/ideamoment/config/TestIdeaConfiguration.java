/**
 * 
 */
package com.ideamoment.config;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Chinakite
 *
 */
public class TestIdeaConfiguration {
    @Test
    public void testIdeaConfig() {
        IdeaConfiguration ideaConfig = new IdeaConfiguration();
        ideaConfig.initConfig("ideaconfig.properties");
        assertEquals("Test Config", ideaConfig.get("ideaconfig.test", null));
    }
}
