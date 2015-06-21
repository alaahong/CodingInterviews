package com.github.alaahong

import spock.lang.Specification

/**
 * Created by ian.zhang on 2015/6/21.
 */
class No02SingletonDoubleCheckTest extends Specification {
    def "GetInstance"() {
        def instance1 = No02SingletonDoubleCheck.getInstance()
        def instance2 = No02SingletonDoubleCheck.getInstance()
        expect: ""
        instance1 == instance2
    }
}
