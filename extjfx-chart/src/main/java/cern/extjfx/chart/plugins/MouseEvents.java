/**
 * Copyright (c) 2018 European Organisation for Nuclear Research (CERN), All Rights Reserved.
 */

package cern.extjfx.chart.plugins;

import javafx.scene.input.MouseEvent;

import static javafx.scene.input.MouseButton.PRIMARY;
import static javafx.scene.input.MouseButton.SECONDARY;

/**
 * Utility methods for operating on {@link MouseEvent}s.
 */
public final class MouseEvents {

    public static boolean isOnlyPrimaryButtonDown(MouseEvent event) {
        return event.getButton() == PRIMARY && !event.isMiddleButtonDown() && !event.isSecondaryButtonDown();
    }

    public static boolean isOnlySecondaryButtonDown(MouseEvent event) {
        return event.getButton() == SECONDARY && !event.isPrimaryButtonDown() && !event.isMiddleButtonDown();
    }

    public static boolean isOnlyShiftModifierDown(MouseEvent event) {
        return !event.isControlDown() && !event.isAltDown() && !event.isMetaDown() && event.isShiftDown();
    }

    public static boolean isOnlyCtrlModifierDown(MouseEvent event) {
        return event.isControlDown() && !event.isAltDown() && !event.isMetaDown() && !event.isShiftDown();
    }

    public static boolean modifierKeysUp(MouseEvent event) {
        return !event.isAltDown() && !event.isControlDown() && !event.isMetaDown() && !event.isShiftDown();
    }
}
