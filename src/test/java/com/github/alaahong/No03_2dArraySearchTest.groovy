package com.github.alaahong

import spock.lang.Specification

/**
 * Created by ian.zhang on 2015/6/21.
 */
class No03_2dArraySearchTest extends Specification {
    def "Search"() {
        def instance = new No03_2dArraySearch()
        expect:
        result == instance.search(matrix, target)
        where:
        result | matrix                                       | target
        true   | [[1, 2, 3], [2, 3, 4], [3, 4, 5]] as int[][] | 3
        false  | [[1, 2, 3], [2, 3, 4], [3, 4, 5]] as int[][] | 6
        false  | null                                         | 3
        false  | [[1, 2, 3], [2, 3, 4], [3, 4, 5]] as int[][] | 0
    }
}
