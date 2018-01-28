package com.pravin.java8.dateandtime;

import java.time.Clock;
import java.time.Duration;
import java.time.ZoneId;

public class ClockClassDemo {
    public static void main(String[] args) {
	Clock clock = Clock.systemDefaultZone();
	System.out.println(clock);
	System.out.println(clock.getZone());
	System.out.println(clock.instant());

	Clock euroClock = Clock.system(ZoneId.of("Europe/Tiraspol"));
	System.out.println(euroClock);
	System.out.println(euroClock.instant());

	Clock forwardClock = Clock.tick(euroClock, Duration.ofSeconds(600));
	System.out.println(forwardClock.instant());
    }
}
