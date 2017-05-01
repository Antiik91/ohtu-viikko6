/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statistics;

import java.lang.reflect.Method;
import java.util.ArrayList;
import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

/**
 *
 * @author janantik
 */
class QueryBuilder {

    Matcher match;

    public QueryBuilder() {
        match = new matcherStub();

    }

    public QueryBuilder playsIn(String team) {
        this.match = new And(this.match, new PlaysIn(this.match, team));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String fieldName) {
        this.match = new And(this.match, new HasFewerThan(this.match, value, fieldName));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String fieldName) {
        this.match = new And(this.match, new HasAtLeast(this.match, value, fieldName));
        return this;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.match = new Or(matchers);
        return this;
    }
    
    public Matcher build(){
        Matcher matcher = this.match;
        match = new matcherStub();
        return matcher;
    }
    private static class matcherStub implements Matcher {

        public matcherStub() {
        }

        @Override
        public boolean matches(Player p) {
            return true;
        }
    }
}
