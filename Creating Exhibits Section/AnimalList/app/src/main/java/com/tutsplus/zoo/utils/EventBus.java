package com.tutsplus.zoo.utils;

import com.squareup.otto.Bus;

/**
 * Created by paulruiz on 4/8/15.
 */
public class EventBus extends Bus {
    private static final EventBus bus = new EventBus();

    public static Bus getInstance() { return bus; }

    private EventBus() {}
}
