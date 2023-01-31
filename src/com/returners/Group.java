package com.returners;

import java.util.Map;
import java.util.HashMap;

public enum Group {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private static final Map<Integer, Group> BY_GROUP = new HashMap<>();

    static {
        for (Group e: values()) {
            BY_GROUP.put(e.getGroupValue(), e);
        }
    }

    private final int groupValue;

    Group(int group) {
        this.groupValue = group;
    }

    public int getGroupValue() {
        return groupValue;
    }

    public static Group groupBy(int value) {
        return BY_GROUP.get(value);
    }
}
