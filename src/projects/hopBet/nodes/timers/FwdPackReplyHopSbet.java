package projects.hopBet.nodes.timers;

import projects.hopBet.nodes.messages.PackReplyHopSbet;
import projects.hopBet.nodes.nodeImplementations.NodeHopSbet;
import sinalgo.nodes.timers.Timer;

public class FwdPackReplyHopSbet extends Timer {
	
	private PackReplyHopSbet pkt;
	
	public FwdPackReplyHopSbet() {}
	
	public FwdPackReplyHopSbet(PackReplyHopSbet msg) {
		//super();
		this.pkt = msg;
		pkt.setHops(msg.getHops());
		pkt.setPath(msg.getPath());
		pkt.setSenderID(msg.getSenderID());
		pkt.setSinkID(msg.getSinkID());
		pkt.setsBet(msg.getsBet());
	}
	
	public FwdPackReplyHopSbet(int hops, int path, int senderID, int sinkID, int sendTo, double sBet) {
		//super();
		//this.pkt = pkt;
		pkt = new PackReplyHopSbet(hops, path, senderID, sinkID, sendTo, sBet);
	}
	@Override
	public void fire() {
		// TODO Auto-generated method stub
		((NodeHopSbet)this.node).fwdReply(this.pkt);
	}

	public PackReplyHopSbet getPkt() {
		return pkt;
	}

	public void setPkt(PackReplyHopSbet pkt) {
		this.pkt = pkt;
	}
	
}
