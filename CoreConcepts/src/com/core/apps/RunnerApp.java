package com.core.apps;
import com.core.collections.Runners;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class RunnerApp {

	private Runners p1,p2,p3,p4,p5;
	private Set<Runners> runnerSet,raceMapSet;
	private Map raceMap;
	
	public RunnerApp()
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
		
	}
	
	private void createRace()
	{
		runnerSet.add(p1);
		runnerSet.add(p2);
		runnerSet.add(p3);
		runnerSet.add(p4);
		runnerSet.add(p5);
	}
	
	private void beginRace()
	{
		//System.out.println(p1.toString());
		p1.calculatePosition();
		System.out.println(p1.toString());
		
		p2.calculatePosition();
		System.out.println(p2.toString());
		
		p3.calculatePosition();
		System.out.println(p3.toString());
		
		p4.calculatePosition();
		System.out.println(p4.toString());
		
		p5.calculatePosition();
		System.out.println(p5.toString());
	}
	
	private void raceOngoing()
	{
		
		for(int i=1; i <=10; i++)
		{
			//beginRace();
			raceMap.put(i, runnerSet);
		}
		
	}
	private void chkRaceSituation(int time)
	{
		
		raceMap.put(time, runnerSet);
		//runnerSet.remove(p1);
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
		RunnerApp race = new RunnerApp();
		race.createRunners();
		
		race.createRace();
		race.beginRace();
		race.chkRaceSituation(0);
		
		race.createRace();
		race.beginRace();
		race.chkRaceSituation(1);
		
		race.getRaceResults();
		
	}

}
