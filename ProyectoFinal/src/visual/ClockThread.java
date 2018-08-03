package visual;

import java.util.Date;

public class ClockThread extends Thread {
	
	PanelPrincipal dc;
	String time;
	
	public ClockThread (PanelPrincipal dc){
		this.dc = dc;
		start();
		
		
	}
	public void run(){
		while (true){
			
			time =""+new Date();
			dc.clock.setText(time);
		}
		
	}

}
