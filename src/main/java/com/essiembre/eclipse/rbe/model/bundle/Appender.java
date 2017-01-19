package com.essiembre.eclipse.rbe.model.bundle;

/**
 * Copyright (C) FITIT NV
 *
 * @author kenneth.westelinck
 * @since 19/01/2017
 */
@FunctionalInterface
public interface Appender {
    void append(String str);
}
