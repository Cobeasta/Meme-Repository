package main;

import java.awt.Toolkit;

public enum FRAME {
screenWidth {
	@Override
	int value() {
		
		return Toolkit.getDefaultToolkit().getScreenSize().width;
	}
}, screenHeight {
	@Override
	int value() {
		return Toolkit.getDefaultToolkit().getScreenSize().height;
	}
},
frameWidth{
	@Override
	int value(){
		return 1280;
	}
},
frameHeight{
	@Override
	int value(){
		return 720; 
	}
},
gridSpace{
	@Override
	int value(){
		return (frameWidth.value() - 100)/20;
	}
};
	abstract int value();

}
