package org.acme.${{values.java_package_name}};

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;
import org.junit.jupiter.api.Test;

import static org.awaitility.Awaitility.await;

@QuarkusTest
public class TimerRouteTest {

   @Test
    public void testTimerLog() {

        await().atMost(10L, TimeUnit.SECONDS).pollDelay(1, TimeUnit.SECONDS).until(() -> {
            String log = new String(Files.readAllBytes(Paths.get("target/quarkus.log")), StandardCharsets.UTF_8);
            return log.contains("Fire timer");
        });
    }
}
