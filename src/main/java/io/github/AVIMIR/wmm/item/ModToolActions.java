package io.github.AVIMIR.wmm.item;

import com.google.common.collect.Sets;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModToolActions extends ToolActions {
    public static final ToolAction KNIFE_STRIP = ToolAction.get("knife_strip");



    public static final Set<ToolAction> DEFAULT_KNIFE_ACTIONS = of(KNIFE_STRIP);

    private static Set<ToolAction> of(ToolAction... actions) {
        return Stream.of(actions).collect(Collectors.toCollection(Sets::newIdentityHashSet));
    }
}
