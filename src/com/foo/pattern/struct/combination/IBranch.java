package com.foo.pattern.struct.combination;

import java.util.List;

public interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);

    List<ICorp> getSubbordinate();
}
