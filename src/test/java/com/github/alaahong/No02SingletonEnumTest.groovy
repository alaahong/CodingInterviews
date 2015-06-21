package com.github.alaahong

import spock.lang.Specification

/**
 * Created by ian.zhang on 2015/6/21.
 */
class No02SingletonEnumTest extends Specification {
    def "ToString"() {
        def instance1 = No02SingletonEnum.INSTANCE
        def instance2 = No02SingletonEnum.INSTANCE
        instance1.setStr("me")
        expect: "one instance0"
        instance1 == instance2
        instance1.getStr() == instance2.getStr()
    }
}
