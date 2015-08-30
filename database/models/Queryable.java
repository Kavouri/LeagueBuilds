package database.models;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Queryable {

    /**
     * Find object matching a given set of parameters in the table belonging to the @class
     * @param model to find
     * @return True on success
     */
    Set<AbstractModel> findObject(AbstractModel model);

    /**
     * Remove object matching a given object in the table belonging to the @class
     * @param model
     * @return True on success
     */
    boolean removeObject(AbstractModel model);

    /**
     * Change objects matching the given params to the provided object
     * @param oldObject
     * @param newObject
     * @throws IllegalArgumentException when the provided object is not an instance of @class
     * @return True on success
     */
    boolean updateObject(AbstractModel oldObject, AbstractModel newObject) throws IllegalArgumentException;

    /**
     *
     * @param toInsert
     * @return True on success
     * @throws IllegalArgumentException when {{toInsert}} is not instance of @class
     */
    boolean insertObject(AbstractModel toInsert) throws IllegalArgumentException;

    /**
     * Turns @code{this} into a Map that represents column names -> values
     * @return the Mapping
     */

    List<String> getColumnNames();

    String getTableName();

}