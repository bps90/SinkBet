package projects.hopBet.nodes.timers;

import projects.hopBet.nodes.nodeImplementations.NodeHopSbet;
import sinalgo.nodes.timers.Timer;

public class IniciaEventoHopSbet extends Timer {

	@Override
	public void fire() {
		// TODO Auto-generated method stub
		((NodeHopSbet)this.node).enviaEvent();
	}

}
