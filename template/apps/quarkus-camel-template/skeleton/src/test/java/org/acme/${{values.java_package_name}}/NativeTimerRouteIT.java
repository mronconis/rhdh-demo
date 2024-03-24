package org.acme.${{values.java_package_name}};

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeTimerRouteIT extends TimerRouteTest {
    // Execute the same tests but in native mode.
}
