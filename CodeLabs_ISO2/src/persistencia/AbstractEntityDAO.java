package persistencia;

public abstract class AbstractEntityDAO<E> {
	

	public AbstractEntityDAO(Class<E> entityClass) {
		super();
	}

	/**
	 * 
	 * @param id
	 */
	public E get(String id) {	
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entity
	 */
	public int insert(E entity) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entity
	 */
	public E update(E entity) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param entity
	 */
	public int delete(E entity) {
		throw new UnsupportedOperationException();
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}

}