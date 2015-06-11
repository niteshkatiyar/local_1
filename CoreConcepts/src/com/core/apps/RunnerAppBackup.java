package com.core.apps;
import com.core.collections.Runners;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RunnerAppBackup {

	private Runners p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	private Set<Runners> runnerSet,raceMapSet;
	private Map raceMap;
	
	public RunnerAppBackup()
	{
		runnerSet = new HashSet<Runners>();
		raceMap = new HashMap<Integer,Set>();
	}
	
	private void createRunners()
	{
		p1 	= new Runners("Aa",0,0);
		p2 	= new Runners("Bb",0,0);
		p3	= new Runners("Cc",0,0);
		p4 	= new Runners("Dd",0,0);
		p5 	= new Runners("Ee",0,0);
		p6 	= new Runners("Ff",0,0);
		p7 	= new Runners("Gg",0,0);
		p8 	= new Runners("Hh",0,0);
		p9 	= new Runners("Ii",0,0);
		p10 = new Runners("Kk",0,0);
		
	}
	
	private void createRace()
	{
		runnerSet.add(p1);
		runnerSet.add(p2);
		runnerSet.add(p3);
		runnerSet.add(p4);
		runnerSet.add(p5);
		runnerSet.add(p6);
		runnerSet.add(p7);
		runnerSet.add(p8);
		runnerSet.add(p9);
		runnerSet.add(p10);
	}
	
	private void beginRace()
	{
		createRunners();
		//System.out.println(p1.toString());
		p1.calculatePosition();
		p2.calculatePosition();
		p3.calculatePosition();
		p4.calculatePosition();
		p5.calculatePosition();
		p6.calculatePosition();
		p7.calculatePosition();
		p8.calculatePosition();
		p9.calculatePosition();
		p10.calculatePosition();
		createRace();
	}
	
	private void raceOngoing()
	{
		
		for(int i=1; i <=10; i++)
		{
			beginRace();
			raceMap.put(i, runnerSet);
		}
		
	}
	private void chkRaceSituation()
	{
		beginRace();
		raceMap.put(1, runnerSet);
		beginRace();
		//raceMap.put(2, runnerSet);
	}
	
	public void getRaceResults()
	{
		raceMapSet = raceMap.entrySet();
		
		Iterator iterator = raceMapSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next().toString());
		}
		
	}
	
	public static void main(String[] args) {
		RunnerAppBackup race = new RunnerAppBackup();
		//race.createRunners();
		System.out.println("Race countdown: 3..2..1!!!");
		race.chkRaceSituation();
		System.out.println("Race has ended now. Waiting for results.");
		race.getRaceResults();
	}

}
