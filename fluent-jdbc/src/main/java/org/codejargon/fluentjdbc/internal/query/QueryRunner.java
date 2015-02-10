package org.codejargon.fluentjdbc.internal.query;

import java.sql.Connection;
import java.sql.SQLException;

@FunctionalInterface
public interface QueryRunner<T> {
    T run(Connection c) throws SQLException;
}