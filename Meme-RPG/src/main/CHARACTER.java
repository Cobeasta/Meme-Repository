package main;

public enum CHARACTER {
	//order of values are range, speed, damage, rate each from 1 to 3.
shortRange{

	@Override
	public int range() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int movementSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int damage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}, medium{

	@Override
	public int range() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int movementSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int damage() {
		// TODO Auto-generated method stub
		return 0;
	}
},longRange{

	@Override
	public int range() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int movementSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int damage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
};
public abstract int range();
public abstract int movementSpeed();
public abstract int damage();
	
}
