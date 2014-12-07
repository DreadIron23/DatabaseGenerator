package databasegenerator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Auxiliary lame set
 * @author Johny
 */
public class ArraySet implements Iterable< Object[] > {
    private LinkedList< Object[] > container = new LinkedList<Object[]>();
    
    /**
     * 
     * @param item
     * @return true if item was inserted, false otherwise because it is already
     * in the set
     */
    public boolean insert( Object[] item ) {
        for( Object[] itemOfContainer : container ) {
            if( Arrays.equals( item, itemOfContainer ) ) {
                return false;
            }
        }
        container.add( item );
        return true;
    }
    
    public Object[] get( int index ) {
        return container.get( index );
    }
    
    public int size() {
        return container.size();
    }

    @Override
    public Iterator<Object[]> iterator() {
        return container.iterator();
    }
}
