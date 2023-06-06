package persistencia;

import java.util.Date;

public abstract class AbstractEntityDAO<E> {
	

	private String id;
	private Date fechaCreacion;
	private Date fechaActualizacion;
	private Class<E> entityClass;
	
	public AbstractEntityDAO(Class<E> entityClass) {
		super();
		this.entityClass = entityClass;
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