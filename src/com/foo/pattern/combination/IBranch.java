package com.foo.pattern.combination;

import java.util.List;

public interface IBranch extends ICorp {
    void addSubordinate(ICorp corp);

    List<ICorp> getSubbordinate();
}
