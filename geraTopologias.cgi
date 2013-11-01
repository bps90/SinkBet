#!/usr/bin/perl

$numRounds = 2; # number of rounds to perform per simulation
$numNodes=200; # number of nodes
$numExec=5;
$EV=50;
$intervalAggr=10;
$dimX=200;
$dimY=200;

for($i=0 ; $i<$numExec; $i+=1) {
  system("./sinalgo " .
  "-batch ".
  "-project Distribution " .             # choose the project
  "-gen $numNodes Distribution:SimpleNode Random " . # generate nodes
  "-rounds $numRounds ".
  "-overwrite ".
  "NumberNodes=$numNodes " .
  "dimX=$dimX ".
  "dimY=$dimY ".
  "idTopology=$i "
  );
}


#for($i=0 ; $i<$numExec; $i+=1) {
 # system("./sinalgo " .
 # "-batch ".
 # "-project hopBet " .             # choose the project
 # "-gen $numNodes hopBet:NodeHopSbet Random " . # generate nodes
 # "-rounds $numRounds ".
 # "-overwrite ".
 # "NumberNodes=$numNodes " .
 # "EV=$EV ".
 # "intervalAggr=$intervalAggr ".                  # Overwrite configuration file parameters
 # "dimX=$dimX ".
 # "dimY=$dimY "
 # );
#}