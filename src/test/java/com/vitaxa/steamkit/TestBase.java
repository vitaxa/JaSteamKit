package com.vitaxa.steamkit;

import org.junit.BeforeClass;
import uk.co.thomasc.steamkit.util.logging.DebugLog;

public abstract class TestBase {
    @BeforeClass
    public static void beforeClass() {
        DebugLog.addListener((category, msg) -> {
            System.out.println(String.format("[SteamKit] Category - %s. Message: %s", category, msg));
        });
    }
}

