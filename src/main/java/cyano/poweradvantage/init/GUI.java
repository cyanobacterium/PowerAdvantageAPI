package cyano.poweradvantage.init;

import cyano.poweradvantage.PowerAdvantage;
import cyano.poweradvantage.gui.FluidDrainGUI;
import cyano.poweradvantage.registry.MachineGUIRegistry;

public abstract class GUI {


	private static boolean initDone = false;
	public static void init(){
		if(initDone) return;
		
		Blocks.init();
		
		int id = MachineGUIRegistry.addGUI(new FluidDrainGUI());
		Blocks.fluid_drain.setGuiOwner(PowerAdvantage.getInstance());
		Blocks.fluid_drain.setGuiID(id);
		
		// TODO: block GUIs
		
		initDone = true;
	}
}
