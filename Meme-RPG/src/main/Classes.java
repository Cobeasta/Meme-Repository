package main;
/**
 * This will contain stats for each character. 
 *TODO David Add stats for character types. 
 * @author David
 *
 */
public enum Classes {
	LORD{

		@Override
		int range() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		int speed() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		int attack() {
			// TODO Auto-generated method stub
			return 12;
		}

		@Override
		int movement() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		int defense() {
			// TODO Auto-generated method stub
			return 7;
		}

		@Override
		int resistance() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		int health() {
			// TODO Auto-generated method stub
			return 30;
		}
		
	}, MAGE{

		@Override
		int range() {
			// TODO Auto-generated method stub
			return 2;
		}

		@Override
		int speed() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		int attack() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		int movement() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		int defense() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		int resistance() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		int health() {
			// TODO Auto-generated method stub
			return 25;
		}
		
	}, KNIGHT{

		@Override
		int range() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		int speed() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		int attack() {
			// TODO Auto-generated method stub
			return 14;
		}

		@Override
		int movement() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		int defense() {
			// TODO Auto-generated method stub
			return 12;
		}

		@Override
		int resistance() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		int health() {
			// TODO Auto-generated method stub
			return 35;
		}
		
	}, ARCHER{

		@Override
		int range() {
			// TODO Auto-generated method stub
			return 3;
		}

		@Override
		int speed() {
			// TODO Auto-generated method stub
			return 10;
		}

		@Override
		int attack() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		int movement() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		int defense() {
			// TODO Auto-generated method stub
			return 6;
		}

		@Override
		int resistance() {
			// TODO Auto-generated method stub
			return 8;
		}

		@Override
		int health() {
			// TODO Auto-generated method stub
			return 20;
		}
		
	}, BLADEMASTER{

		@Override
		int range() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		int speed() {
			// TODO Auto-generated method stub
			return 16;
		}

		@Override
		int attack() {
			// TODO Auto-generated method stub
			return 14;
		}

		@Override
		int movement() {
			// TODO Auto-generated method stub
			return 5;
		}

		@Override
		int defense() {
			// TODO Auto-generated method stub
			return 4;
		}

		@Override
		int resistance() {
			// TODO Auto-generated method stub
			return 12;
		}

		@Override
		int health() {
			// TODO Auto-generated method stub
			return 25;
		}
		
	};
		abstract int range();
		abstract int speed();
		abstract int attack();
		abstract int movement();
		abstract int defense();
		abstract int resistance();
		abstract int health();
}
