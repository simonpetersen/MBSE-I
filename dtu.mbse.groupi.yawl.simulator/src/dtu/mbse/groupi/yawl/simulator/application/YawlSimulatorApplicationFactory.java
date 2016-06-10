package dtu.mbse.groupi.yawl.simulator.application;

import org.pnml.tools.epnk.applications.ApplicationFactory;
import org.pnml.tools.epnk.applications.ApplicationWithUIManager;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dtu.mbse.groupi.yawl.YawlNet;

public class YawlSimulatorApplicationFactory extends ApplicationFactory {

	@Override
	public String getName() {
		return "Yawl Simulator";
	}

	@Override
	public String getDescription() {
		return "A simple YAWL simulator not yet taken XOR, OR and RESET arcs into account";
	}

	@Override
	public boolean isApplicable(PetriNet net) {
		// TODO change YAWLNet to the class representing your YAWL type
		return net.getType() instanceof YawlNet;
	}

	@Override
	public ApplicationWithUIManager startApplication(PetriNet net) {
		return new YawlSimulatorApplication(net);
	}

}
