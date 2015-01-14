package org.fluentjdbc.api.query;

import java.util.Iterator;
import java.util.List;

/**
 * Batch insert or update query for a SQL statement. A BatchQuery is mutable, non-threadsafe.
 */
public interface BatchQuery {
    /**
     *
     * @param params Parameters used by the batch update
     * @return this
     */
    BatchQuery params(Iterator<List<Object>> params);

    /**
     * Sets size of a batch
     * @param batchSize size of a batch
     * @return this
     */
    BatchQuery batchSize(Integer batchSize);

    /**
     * Runs the batch insert or update and returns the results (eg affected rows)
     *
     * @return List of update results
     */
    List<UpdateResult> run();
}